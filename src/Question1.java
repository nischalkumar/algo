import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by nischal.k on 02/10/16.
 */
public class Question1 {
    public static void main(String[] args) throws Exception {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int k = Reader.nextInt();
        int m = Reader.nextInt();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stringList.add(Reader.next());
        }

        int begIndex = (m-1)*k;
        for (int i = 0; i < k && i+begIndex<stringList.size(); i++) {
            System.out.println(stringList.get(i+begIndex));
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

