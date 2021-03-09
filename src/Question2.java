import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by nischal.k on 02/10/16.
 */
public class Question2 {
    public static void main(String[] args) throws Exception {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int m = Reader.nextInt();
        TreeMap<Integer, Integer> pair = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int a = Reader.nextInt();
            int b = Reader.nextInt();
            pair.put(a,b);
        }
        int q = Reader.nextInt();
        for (int i = 0; i < q; i++) {
            int a = Reader.nextInt();
            int b = Reader.nextInt();
            boolean flag = true;
            Integer floorKey = pair.floorKey(a);
            if(floorKey!=null) {

                int floorValue = pair.get(floorKey);
                if (a >= floorValue) {
                    NavigableMap<Integer, Integer> sumMap = pair.subMap(a, true, b, true);
                    for (Map.Entry<Integer, Integer> entry : sumMap.entrySet()) {
                        if (entry.getKey() <= b) {
                            flag = false;
                            break;
                        }
                    }
                } else {
                    flag = false;
                }
            } else {
                if(pair.size()>0 && b>=pair.firstEntry().getKey()) {
                    flag=false;
                }
            }
            if(flag) {
                System.out.println("OK");
                pair.put(a,b);
            }
            else System.out.println("NG");
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

