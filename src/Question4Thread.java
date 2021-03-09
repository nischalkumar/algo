import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by nischal.k on 02/10/16.
 */
public class Question4Thread{

    static int[][] mat= new int[15][15];
    static Map<Integer,List<Integer>> restrictions = new HashMap<>();
    static int size;

    public static void main(String[] args) throws Exception {
        Reader.init(System.in);
        size = Reader.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                mat[i][j]= Reader.nextInt();
            }
        }


        int restrictionsLength = Reader.nextInt();
        for (int i = 0; i < restrictionsLength; i++) {
            int a = Reader.nextInt();
            int b = Reader.nextInt();
            List<Integer> val = restrictions.getOrDefault(b, new ArrayList<>());
            val.add(a);
            restrictions.put(b, val);
        }

        Set<Integer> visited = new HashSet<>();
        visited.add(1);
        List<EulerThread> threadList= dfs(1,visited);
        ExecutorService executorService = Executors.newFixedThreadPool(threadList.size());
        List<Future<Integer>> futures = new ArrayList<>();
        for(EulerThread e: threadList) {
            futures.add(executorService.submit(e));
        }
        List<Integer> sol = new ArrayList<>();
        for(Future<Integer> future: futures) {
            int val = future.get();
            sol.add(val);
        }
        executorService.shutdownNow();
        if(threadList.size()==0) {
            System.out.println(0);
            return;
        }
        int min = Integer.MAX_VALUE;
        for (Integer val : sol) {
            if(min>val) {
                min = val;
            }
        }
        System.out.println(min);
    }

    private static List<EulerThread> dfs(int i, Set<Integer> visited) {
        List<EulerThread> eulerThreads = new ArrayList<>();
        for (int j = 1; j <= size; j++) {
            List<Integer> restrictionList = restrictions.getOrDefault(j, new ArrayList<>());
            if(!visited.contains(j)&& visited.containsAll(restrictionList) & i!=j) {
                visited.add(j);
                EulerThread thread = new EulerThread(j,visited, mat[i][j]);
                eulerThreads.add(thread);
                visited.remove(j);
            }
        }
        return eulerThreads;
    }

    static class EulerThread implements Callable {
        private int i;
        private Set<Integer> visited;
        private int orgCost;
        private int res;

        public EulerThread(int i, Set<Integer> visited, int orgCost) {
            this.i = i;
            this.visited = new HashSet<>(visited);
            this.orgCost=orgCost;
        }

        @Override
        public Integer call() {
            res = dfs(i, visited);
            if(res!=Integer.MAX_VALUE) {
                res= res+orgCost;
            }
            return res;
        }

        private static int dfs(int i, Set<Integer> visited) {
            int minValue = Integer.MAX_VALUE;
            if(visited.size()==size) return 0;
            for (int j = 1; j <= size; j++) {
                List<Integer> restrictionList = restrictions.getOrDefault(j, new ArrayList<>());
                if(!visited.contains(j)&& visited.containsAll(restrictionList) & i!=j) {
                    visited.add(j);
                    int val =dfs(j,visited);
                    if(val!=Integer.MAX_VALUE) {
                        minValue = Math.min(val + mat[i][j], minValue);
                    }
                    visited.remove(j);
                }
            }
            return minValue;
        }
    }

    static class DP {
        private int i;
        private Set<Integer> visited;

        public DP(int i, Set<Integer> visited) {
            this.i = i;
            this.visited = visited;
        }

        public int getI() {
            return i;
        }

        public Set<Integer> getVisited() {
            return visited;
        }


    }

    static class Reader {
        static BufferedReader reader;
        static StringTokenizer tokenizer;

        /**
         * call this method to initialize reader for InputStream
         */
        static void init(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input));
            tokenizer = new StringTokenizer("");

        }

        /**
         * get next word
         */
        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
//            TODO add check for eof if necessary
                tokenizer = new StringTokenizer(
                        reader.readLine());
            }
            return tokenizer.nextToken();
        }

        static Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}