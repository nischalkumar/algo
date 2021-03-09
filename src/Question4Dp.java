import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by nischal.k on 02/10/16.
 */
public class Question4Dp {

    static int[][] mat= new int[15][15];
    static Map<Integer,List<Integer>> restrictions = new HashMap<>();
    static int size;
//    static Map<DP, Integer> dpMap = new HashMap<>();

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
        int sol = dfs(1,visited);
//        int sol = dpdfs(new DP(1, visited));
        System.out.println(sol);
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
//    private static int dpdfs(DP dp) {
//        int minValue = Integer.MAX_VALUE;
//        if(dp.getVisited().size()==size) return 0;
//        if(dpMap.containsKey(dp)) {
//            System.out.println("dp helped");
//            return dpMap.get(dp);
//        }
//        for (int j = 1; j <= size; j++) {
//            List<Integer> restrictionList = restrictions.getOrDefault(j, new ArrayList<>());
//            if(!dp.getVisited().contains(j)&& dp.getVisited().containsAll(restrictionList) & dp.getI()!=j) {
//                dp.getVisited().add(j);
//                int val =dpdfs(new DP(j, dp.getVisited()));
//                if(val!=Integer.MAX_VALUE) {
//                    minValue = Math.min(val + mat[dp.getI()][j], minValue);
//                }
//                dp.getVisited().remove(j);
//            }
//        }
//        dpMap.put(dp, minValue);
//        return minValue;
//    }
//
//    static class DP {
//        private int i;
//        private Set<Integer> visited;
//
//        public DP(int i, Set<Integer> visited) {
//            this.i = i;
//            this.visited = visited;
//        }
//
//        public int getI() {
//            return i;
//        }
//
//        public Set<Integer> getVisited() {
//            return visited;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            DP dp = (DP) o;
//            return i == dp.i && (visited.containsAll(dp.visited) && dp.visited.containsAll(visited));
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(i, visited);
//        }
//    }

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

