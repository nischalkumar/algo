import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by nischal.k on 02/10/16.
 */
public class Question4Dij {
    public static void main(String[] args) throws Exception {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int[][] mat= new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                mat[i][j]= Reader.nextInt();
            }
        }

        Map<Integer,List<Integer>> restrictions = new HashMap<>();

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
//        int sol = dfs(1,mat,visited, restrictions);
//        System.out.println(sol);
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

