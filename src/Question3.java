import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by nischal.k on 02/10/16.
 */
public class Question3 {
    public static void main(String[] args) throws Exception {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int L = Reader.nextInt();
        int[] ar= new int[n];
        for (int i = 0; i <n; i++) {
            ar[i]=Reader.nextInt();
        }

        Deque<Integer> deque = new ArrayDeque<>();
//        int i =0;
//        for (;  i< L; i++) {
//            while (deque.size()>0 && deque.peekLast()<ar[i]) {
//                deque.removeLast();
//            }
//            deque.addLast(ar[i]);
//        }

//        System.out.println(deque.getFirst());

        for (int i=0;  i< n; i++) {

            while (deque.size()>0 && deque.peekLast()<ar[i]) {
                deque.removeLast();
            }
            deque.addLast(ar[i]);

            if(i+1>=L) {
                System.out.println(deque.getFirst());

                if (ar[i - L + 1] == deque.peekFirst()) {
                    deque.removeFirst();
                }
            }
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

