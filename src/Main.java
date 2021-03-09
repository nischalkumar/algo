import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by nischal.k on 02/10/16.
 */
public class Main {

    public static Map<Integer, Node> nodeMap = new HashMap<>();

    public static void main(String[] args) throws java.lang.Exception {
        Reader.init(System.in);
//        System.out.println();
//        System.out.println("3");
//        System.out.println(bestTrio(6, Arrays.asList(1,2,2,3,4,5), Arrays.asList(2,4,5,5,5,6)));
//        System.out.println(bestTrio(5, Arrays.asList(1,1,2,2,3,4), Arrays.asList(2,3,3,4,4,5)));
//        System.out.println(bestTrio(7, Arrays.asList(2,3,5,1), Arrays.asList(1,6,1,7)));
//        System.out.println(sol("icyi"));
        //BAONXXOLL, BAOOLLNNOLOLBGAX QAWABAWONL ONLABLABLOON
//        System.out.println(ballonSol("BAONXXOLL"));
//        System.out.println(ballonSol("BAOOLLNNOLOLBGAX"));
//        System.out.println(ballonSol("QAWABAWONL"));
//        System.out.println(ballonSol("ONLABLABLOON"));
        //[1,0,1,0,1,1], [1,1,0,1,1], [0,1,0], [0,1,1,0]
        System.out.println(flipSol(new int[]{1,0,1,0,1,1}));
        System.out.println(flipSol(new int[]{1,1,0,1,1}));
        System.out.println(flipSol(new int[]{0,1,0}));
        System.out.println(flipSol(new int[]{0,1,1,0}));
    }

    static int flipSol(int[] A) {
        int flip1=0;
        int flip2=0;
        int start = 1;
        for (int i = 0; i < A.length; i++) {
            if(A[i]!=start) {
                flip1++;
            }
            start = (start+1)%2;
        }
        start = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]!=start) {
                flip2++;
            }
            start = (start+1)%2;
        }
        return Math.min(flip1, flip2);

    }

    static  int ballonSol(String str) {
        Map<Character, Integer> balCountMap = new HashMap<>() ;
        for (int i = 0; i < str.length(); i++) {
            int oldCount = balCountMap.getOrDefault(str.charAt(i), 0);
            oldCount++;
            balCountMap.put(str.charAt(i), oldCount);
        }
        int bCount = balCountMap.getOrDefault('B',0);
        int aCount = balCountMap.getOrDefault('A',0);
        int lCount = balCountMap.getOrDefault('L',0)/2;
        int oCount = balCountMap.getOrDefault('O',0)/2;
        int nCount = balCountMap.getOrDefault('N',0);
        return Math.min(Math.min(Math.min(Math.min(aCount, bCount), lCount), oCount), nCount);
    }


    static String sol(String str) {
        Character sol = null;
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (charSet.contains(str.charAt(i))) {
                sol = str.charAt(i);
            } else {
                charSet.add(str.charAt(i));
            }
        }
        return Character.toString(sol);

    }


    public static int bestTrio(int friendsNodes, List<Integer> friendsFrom, List<Integer> friendsTo) {

        for (int i = 1; i <= friendsNodes; i++) {
            nodeMap.put(i, new Node(i));
        }
        for (int i = 0; i < friendsFrom.size(); i++) {

            Node x = nodeMap.get(friendsFrom.get(i));
            Node y = nodeMap.get(friendsTo.get(i));
            x.addFriend(y);
            y.addFriend(x);
            nodeMap.put(x.getI(), x);
            nodeMap.put(y.getI(), y);
        }
        Set<Trio> trios = new HashSet<>();
        for (int i = 1; i <= friendsNodes; i++) {
            for (int j = 1; j < friendsNodes; j++) {
                Node x = nodeMap.get(i);
                Node y = nodeMap.get(j);
                if (x.isFirend(y.getI()) && y.isFirend(x.getI())) {
                    List<Integer> candidate = new ArrayList<>();
                    for (int k : x.getNeighbourSet()) {
                        if (y.isFirend(k)) {
                            trios.add(new Trio(i, j, k));
                        }
                    }
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (Trio trio : trios) {
            int score = computeScore(trio);
            if (min > score) {
                min = score;
            }
        }

        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    private static int computeScore(Trio trio) {
        Node x = nodeMap.get(trio.x);
        Node y = nodeMap.get(trio.y);
        Node z = nodeMap.get(trio.z);

        int score = 0;
        score += x.getNeighbourSet().size();
        score += y.getNeighbourSet().size();
        score += z.getNeighbourSet().size();

        if (x.isFirend(trio.y)) {
            score--;
        }
        if (x.isFirend(trio.z)) {
            score--;
        }
        if (y.isFirend(trio.x)) {
            score--;
        }
        if (y.isFirend(trio.z)) {
            score--;
        }
        if (z.isFirend(trio.x)) {
            score--;
        }
        if (z.isFirend(trio.y)) {
            score--;
        }
        return score;
    }


    private static String getVal(String str, int k) {
        int val = str.length() - k;
        if (val % 2 != 0) {
            String flip = str.substring(0, k);
            String org = str.substring(k);
            StringBuilder input1 = new StringBuilder();
            input1.append(flip);
            return org + input1.reverse();
        } else {
            return str.substring(k) + str.substring(0, k);
        }
    }

    private static String getScore(String str, int k) {
        StringBuilder s = new StringBuilder();
        int val = str.length() - k;
        if (val % 2 == 1) {

            for (int i = k; i < str.length(); i++) {
                s.append(str.charAt(i));
            }
            for (int i = k - 1; i >= 0; i--) {
                s.append(str.charAt(i));
            }
        } else {
            for (int i = k; i < str.length(); i++) {
                s.append(str.charAt(i));
            }
            for (int i = 0; i < k; i++) {
                s.append(str.charAt(i));
            }

        }
        return s.toString();
    }


    private static boolean cantBeReduced(String str, Set<Integer> used) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int lastOpen = Integer.MAX_VALUE;
        int lastClosed = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if (!used.contains(i)) {
                if (str.charAt(i) == ')') {
                    lastClosed = Math.max(lastClosed, i);
                } else {
                    lastOpen = Math.min(lastOpen, i);
                }
            }
        }
        if (lastOpen < lastClosed && lastOpen != Integer.MAX_VALUE && lastClosed != Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

//    public static void main(String[] args) throws java.lang.Exception {
//        Reader.init(System.in);
//        int t = Reader.nextInt();
//        while (t>0) {
//            int n = Reader.nextInt();
//            int[] b = new int[n];
//            int[] ne = new int[n];
//
//            for (int i = 0; i < n; i++) {
//                b[i] = Reader.nextInt();
//            }
//            for (int i = 0; i < n; i++) {
//                ne[i] = Reader.nextInt();
//            }
//
//            Arrays.sort(b);
//            Arrays.sort(ne);
//            for (int i = 0; i < n; i++) {
//                System.out.print(b[i]+" ");
//            }
//            System.out.println();
//            for (int i = 0; i < n; i++) {
//                System.out.print(ne[i]+" ");
//            }
//            System.out.println();
//
//            t--;
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

    public static class Node {
        private int i;
        private List<Node> friends;
        private Set<Integer> neighbourSet;

        public Set<Integer> getNeighbourSet() {
            return neighbourSet;
        }

        public Node(int i) {
            this.i = i;
            this.friends = new ArrayList<>();
            this.neighbourSet = new HashSet<>();
        }

        public List<Node> getFriends() {
            return friends;
        }

        public void addFriend(Node node) {
            this.friends.add(node);
            this.neighbourSet.add(node.getI());
        }

        public boolean isFirend(int i) {
            return neighbourSet.contains(i);
        }

        public int getI() {
            return i;
        }
    }

    public static class Trio {
        private int x;
        private int y;
        private int z;

        public Trio(int x, int y, int z) {
            List<Integer> trios = new ArrayList<>();
            trios.add(x);
            trios.add(y);
            trios.add(z);
            trios.sort(Integer::compare);

            this.x = trios.get(0);
            this.y = trios.get(1);
            this.z = trios.get(2);
        }

        public boolean equals(Object o) {
            Trio other = (Trio) o;
            if (other.x == this.x && other.y == this.y && other.z == this.z) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.x, this.y, this.z);
        }

        public boolean isMember(int i) {
            return i == x || i == y;
        }
    }


}

