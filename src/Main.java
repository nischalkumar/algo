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
    static TreeNode cycleStart = null;


//    public int getPrime(int nth) {
//
//    }

//    public static int minimumJumpsBottomUp(int[] forbidden, int a, int b, int x) {
//        int[][] dp = new int[x + b][2];
//    }
//

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
//        System.out.println(flipSol(new int[]{1,0,1,0,1,1}));
//        System.out.println(flipSol(new int[]{1,1,0,1,1}));
//        System.out.println(flipSol(new int[]{0,1,0}));
//        System.out.println(flipSol(new int[]{0,1,1,0}));
//        int[] sol = findRedundantConnection(new int[][]{{1,2},{1,3},{2,3}});
//        System.out.println(sol[0] + " "+ sol[1]);
//        sol = findRedundantConnection(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}});
//        System.out.println(sol[0] + " "+ sol[1]);
//        System.out.println(checkPossibility(new int[]{4,2,3}));
//        System.out.println(checkPossibility(new int[]{4,2,1}));
//        System.out.println(checkPossibility(new int[]{1,2,1}));
//        System.out.println(checkPossibility(new int[]{1,2,1,4}));
//        System.out.println(checkPossibility(new int[]{1,9,9,1}));
//        System.out.println(Arrays.toString(avoidFlood(new int[]{1,2,0,1,0,2})));
//        System.out.println(Arrays.toString(avoidFlood(new int[]{1,2,0,1,0,2,0,2})));
//        System.out.println(Arrays.toString(avoidFlood(new int[]{1,2,3,4})));
//        System.out.println(Arrays.toString(avoidFlood(new int[]{1,2,0,0,2,1})));
//        System.out.println(Arrays.toString(avoidFlood(new int[]{1,2,0,1,2})));
//        System.out.println(Arrays.toString(avoidFlood(new int[]{69,0,0,0,69})));
//        System.out.println(Arrays.toString(avoidFlood(new int[]{10,20,20})));
//        System.out.println(Arrays.toString(avoidFlood(new int[]{10,20,20})));
//        System.out.println(Arrays.toString(avoidFlood(new int[]{1, 0, 2, 0, 2, 1})));
//        System.out.println(Arrays.toString(avoidFlood(new int[]{})));
//        System.out.println(minimumJumps(new int[]{14,4,18,1,15}, 3,15,9));
//        System.out.println(minimumJumps(new int[]{8,3,16,6,12,20}, 15, 13,11));
//        System.out.println(minimumJumps(new int[]{1,6,2,14,5,17,4}, 16,9 ,7));
//        System.out.println(minimumJumps(new int[]{128, 178, 147, 165, 63, 11, 150, 20, 158, 144, 136}, 61, 170, 135));
//        System.out.println(minimumJumps(new int[]{3},3 ,7,6));
//        System.out.println(minimumJumps(new int[]{1},1 ,100,20));
//        System.out.println(minimumJumps(new int[]{}, ,,));
//        System.out.println(kConcatenationMaxSum(new int[]{1,-1,1},2));
//        System.out.println(kConcatenationMaxSum(new int[]{1,-1,1},3));
//        System.out.println(kConcatenationMaxSum(new int[]{1,-1,1,  1,-1,1,    1,-1,1},2));
//        System.out.println(kConcatenationMaxSum(new int[]{1,2},3));
//        System.out.println(kConcatenationMaxSum(new int[]{1,-2,1},5));
//        System.out.println(kConcatenationMaxSum(new int[]{-1,-2},7));
//        System.out.println(kConcatenationMaxSum(new int[]{1-2,4,5,6},3)); //43
//        System.out.println(kConcatenationMaxSum(new int[]{1,-30,4,5,6},3)); //16
//        System.out.println(kConcatenationMaxSum(new int[]{1,-30,4,5,6},2)); //16
//        System.out.println(kConcatenationMaxSum(new int[]{1,-30,4,5,6},1)); //15
//        System.out.println(kConcatenationMaxSum(new int[]{-5,-2,0,0,3,9,-2,-5,4,-5,-2,0,0,3,9,-2,-5,4,-5,-2,0,0,3,9,-2,-5,4,-5,-2,0,0,3,9,-2,-5,4,-5,-2,0,0,3,9,-2,-5,4},1)); //16
//        System.out.println(kConcatenationMaxSum(new int[]{-5,-2,0,0,3,9,-2,-5,4},5)); //20
//        System.out.println(kConcatenationMaxSum(new int[]{10000,10000,10000,10000,10000,10000,10000,10000,10000,10000},100000)); //20
//        System.out.println(checkSubarraySum(new int[]{1,6,14,9,9},4));
//        System.out.println(checkSubarraySum(new int[]{1,2,2,0,0,9},7));
//        System.out.println(checkSubarraySum(new int[]{23,2,4,6,7},6));
//        System.out.println(checkSubarraySum(new int[]{23,2,6,4,7},6));
//        System.out.println(checkSubarraySum(new int[]{23,2,6,4,7},13));
//        System.out.println(checkSubarraySum(new int[]{2,4,3},6));
//        System.out.println(checkSubarraySum(new int[]{23,2,6,2,5},6)); //false
//        System.out.println(checkSubarraySum(new int[]{5,0,0,0},3));
//        System.out.println(countPairs(new int[]{2,2,2,2,2}));
//        System.out.println(countPairs(new int[]{1,3,5,7,9}));
//        System.out.println(countPairs(new int[]{1,1,1,3,3,3,7}));
//        System.out.println(countPairs(new int[]{149,107,1,63,0,1,6867,1325,5611,2581,39,89,46,18,12,20,22,234}));
//        System.out.println(minSubarray(new int[]{3,1,4,2}, 6));
//        System.out.println(minSubarray(new int[]{6,3,5,2}, 9));
//        System.out.println(minSubarray(new int[]{1,2,3}, 3));
//        System.out.println(minSubarray(new int[]{1,2,3}, 7));
//        System.out.println(minSubarray(new int[]{1000000000,1000000000,1000000000}, 3));
//        System.out.println(minSubarray(new int[]{8,32,31,18,34,20,21,13,1,27,23,22,11,15,30,4,2}, 148));
//        System.out.println(minSubarray(new int[]{4,4,2},7));
//        System.out.println(maxEvents(new int[][]{new int[]{1,2},new int[]{2,3},  new int[]{3,4}, }));
//        System.out.println(maxEvents(new int[][]{new int[]{1,2},new int[]{2,3},  new int[]{3,4},new int[]{1,2}, }));
//        System.out.println(maxEvents(new int[][]{new int[]{1,4},new int[]{4,4},  new int[]{2,2},new int[]{3,4},new int[]{1,1}, }));
//        System.out.println(maxEvents(new int[][]{new int[]{1,10000}}));
//        System.out.println(maxEvents(new int[][]{new int[]{1,1},new int[]{1,2},  new int[]{1,3},new int[]{1,4},new int[]{1,5},new int[]{1,6},  new int[]{1,7}, }));
//        System.out.println(maxEvents(new int[][]{new int[]{3,3}, new int[]{3,4}, new int[]{1,4}}));
//        System.out.println(maxEvents(new int[][]{new int[]{1,10000}}));
//        System.out.println(maximumScore(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
//        System.out.println(maximumScore(new int[]{-5, -3, -3, -2, 7, 1}, new int[]{-10, -5, 3, 4, 6}));
//        System.out.println(maximumScore(new int[]{1, 1, 1000, 1, 1, 1000}, new int[]{2, 1, 2}));
//        System.out.println(find132pattern(new int[]{1,2,3,4}));
//        System.out.println(find132pattern(new int[]{3,4,1,2}));
//        System.out.println(find132pattern(new int[]{3,1,4,2}));
//        System.out.println(find132pattern(new int[]{-1,3,2,0}));
//        System.out.println(find132pattern(new int[]{-1,3,-10,40}));
//        System.out.println(find132pattern(new int[]{-1,3,-10,-5,-2}));
//        System.out.println(find132pattern(new int[]{-1,3,-10,-5,-4}));
//        System.out.println(find132pattern(new int[]{-1,3,-10,-5,4}));
//        System.out.println(find132pattern(new int[]{-1,3,-10,-5,2}));
//        System.out.println(find132pattern(new int[]{-1,3,-10,-5,-6}));
//        System.out.println(find132pattern(new int[]{3, 5, 0, 3, 4}));
//        System.out.println(minimumMountainRemovals(new int[]{1,3,1}));
//        System.out.println(minimumMountainRemovals(new int[]{2,1,1,5,6,2,3,1}));
//        System.out.println(minimumMountainRemovals(new int[]{4,3,2,1,1,2,3,1}));
//        System.out.println(minimumMountainRemovals(new int[]{1,2,3,4,4,3,2,1}));
//        System.out.println(minAbsoluteSumDiff(new int[]{1, 7, 5}, new int[]{2, 3, 5}));
//        System.out.println(minAbsoluteSumDiff(new int[]{2, 4, 6, 8, 10}, new int[]{2, 4, 6, 8, 10}));
//        System.out.println(minAbsoluteSumDiff(new int[]{1, 10, 4, 4, 2, 7}, new int[]{9, 3, 5, 1, 7, 4}));
//        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
//        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));
//        System.out.println(firstMissingPositive(new int[]{5, 4, 3, 2, 1}));
//        System.out.println(firstMissingPositive(new int[]{-1, -1, -1, 1, 1, 1}));
//        System.out.println(maximalRectangle(new char[][]{new char[]{'0'}}));
//        System.out.println(maximalRectangle(new char[][]{}));
//        System.out.println(maximalRectangle(new char[][]{new char[]{'1'}}));
//        System.out.println(maximalRectangle(new char[][]{new char[]{'0','0'}}));
//        System.out.println(maximalRectangle(new char[][]{new char[]{'1', '0', '1', '0', '0'}, new char[]{'1', '0', '1', '1', '1'}, new char[]{'1', '1', '1', '1', '1'}, new char[]{'1', '0', '0', '1', '0'}}));
//        System.out.println(findMedianSortedArrays(new int[]{2,2,2,2,9}, new int[]{4,5,5,5,9}));
//        System.out.println(findMedianSortedArrays(new int[]{2,2,2,2,4}, new int[]{2,2,2,2,9}));
//        System.out.println(findMedianSortedArrays(new int[]{10,10,10,10,10}, new int[]{2,2,2,2,9}));
//        System.out.println(findMedianSortedArrays(new int[]{2,2,2,2,2}, new int[]{2,2,2,2,2}));
//        System.out.println(findMedianSortedArrays(new int[]{2}, new int[]{2}));
//        System.out.println(findMedianSortedArrays(new int[]{1}, new int[]{2}));
//        System.out.println(findMedianSortedArrays(new int[]{2}, new int[]{1}));
//        System.out.println(findMedianSortedArrays(new int[]{4,6}, new int[]{1,9}));
        System.out.println("------");
//        System.out.println(findMedianSortedArrays(new int[]{2,2,2,2}, new int[]{4,5,5,5,9}));
//        System.out.println(findMedianSortedArrays(new int[]{2,2,2,2}, new int[]{2,2,2,2,9}));
//        System.out.println(findMedianSortedArrays(new int[]{10,10,10,10}, new int[]{2,2,2,2,9}));
//        System.out.println(findMedianSortedArrays(new int[]{2,2,2,2}, new int[]{2,2,2,2,2}));
//        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{2}));
//        System.out.println(findMedianSortedArrays(new int[]{1}, new int[]{}));
//        System.out.println(findMedianSortedArrays(new int[]{2}, new int[]{1,3}));
//        System.out.println(findMedianSortedArrays(new int[]{4,6,7}, new int[]{1}));
//        System.out.println(findMedianSortedArrays(new int[]{4,6,7}, new int[]{6}));
//        System.out.println(findMedianSortedArrays(new int[]{4,6,8,9}, new int[]{7}));
//        System.out.println(findMedianSortedArrays(new int[]{7}, new int[]{4,6,7,8,9,10}));
//        System.out.println(findMedianSortedArrays(new int[]{8}, new int[]{4,6,7,9,10,11}));
//        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{10,11}));
//        System.out.println(findMedianSortedArrays(new int[]{2,2,4,4}, new int[]{2,2,4,4}));
//        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{1,2,3}));
//        System.out.println((new int[]{}));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int low = 0;
        int high = nums1.length-1;
        int mid;
        int medianPosition= (nums1.length+nums2.length+1)/2;
        while (low < high) {
            mid = low + (high - low) / 2;
            Integer pos = medianFound(nums1, nums2, mid,medianPosition);
            if(pos==null) {
                low=mid;
                break;
            }
            if (pos > medianPosition) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (nums1.length>0 && low>=0 && medianFound(nums1, nums2, low, medianPosition) == null) {
            if((nums1.length+nums2.length)%2==1) {
                return nums1[low];
            }
            return ((double) (nums1[low] + findNext(nums1, nums2, low, medianPosition))) / (double) 2.0;
        }

        low = 0;
        high = nums2.length-1;
        while (low < high) {
            mid = low + (high - low) / 2;
            Integer pos = medianFound(nums2, nums1, mid, medianPosition);
            if (pos == null) {
                low=mid;
                break;
            }
            if (pos > medianPosition) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if((nums1.length+nums2.length)%2==1) {
            return nums2[low];
        }
        return ((double) (nums2[low] + findNext(nums2, nums1, low, medianPosition))) / (double) 2.0;
    }

    private static int findNext(int[] self, int[] other, int selfPos, int medianPosition) {
        int key = self[selfPos];
        int low = 0;
        int high = other.length-1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (other[mid] >= key && selfPos+1+mid+1>medianPosition) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        if (selfPos + 1 >= self.length || (low< other.length && other[low]>=key&& other[low] <= self[selfPos + 1])) {
            return other[low];
        }
        return self[selfPos + 1];
    }

    private static Integer medianFound(int[] nums1, int[] nums2, int mid, int medianPosition) {
        int ceil = getJustLow(nums2, nums1[mid]);
        int floor = getJustHigh(nums2, nums1[mid]);
        int pos = mid + 1;
        if (ceil != -1) {
            pos += ceil + 1;
        }
        if(floor==-1) {
            floor=nums2.length-1;
        }
        if (pos == medianPosition) {
            return null;
        }
        if (ceil + 1 != floor) {
            if (pos < medianPosition && pos+(floor-(ceil<0?0:ceil)) >= medianPosition) {
                return null;
            }
        }
        return pos;
    }

    private static int getJustHigh(int[] nums, int key) {
        if(nums.length==0) return -1;
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return (key < nums[high]) ? high : -1;
    }

    private static int getJustLow(int[] nums, int key) {
        if(nums.length==0) return -1;
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low + 1) / 2;
            if (nums[mid] >= key) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return high<0  || nums[high]<key?high:-1;
    }


    public static int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int max = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(dp[i], 0);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '1') {
                    int localMaxHeight = i == 0 ? 1 : dp[i - 1][j] + 1;
                    int maxArea = localMaxHeight;
                    dp[i][j] = localMaxHeight;
                    for (int k = j - 1; k >= 0; k--) {
                        if (matrix[i][k] == '0') {
                            break;
                        }
                        localMaxHeight = Math.min(dp[i][k], localMaxHeight);
                        maxArea = Math.max(maxArea, (j - k + 1) * localMaxHeight);
                    }
                    max = Math.max(max, maxArea);
                }
            }
        }
        return max;
    }

    public static int firstMissingPositive(int[] nums) {
        boolean onePresent = false;
        boolean lastPresent = false;
        if (nums.length == 1) {
            if (nums[0] == 1) {
                return 2;
            }
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                onePresent = true;
                nums[i] = 0;
            } else if (nums[i] == nums.length) {
                lastPresent = true;
            }
        }
        if (!onePresent) {
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            inPlaceUpdate(nums, nums[i]);
        }
        nums[1] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 1) {
                return i;
            }
        }
        return (lastPresent) ? nums.length + 1 : nums.length;
    }

    private static void inPlaceUpdate(int[] nums, int val) {
        if (val >= nums.length || val <= 1) {
            return;
        }
        int existing = nums[val];
        nums[val] = 1;
        inPlaceUpdate(nums, existing);
    }

    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        PriorityQueue<Pair> diffQueue = new PriorityQueue<>((a, b) -> b.key - a.key);
        TreeSet<Integer> num = new TreeSet<>();
        long sum = 0;
        for (int i = 0; i < nums1.length; i++) {
            diffQueue.add(new Pair(Math.abs(nums1[i] - nums2[i]), i));
            num.add(nums1[i]);
            sum += Math.abs(nums1[i] - nums2[i]);
        }
        long sol = sum;
        while (!diffQueue.isEmpty()) {
            Pair pair = diffQueue.poll();
            int key = nums2[pair.value];
            Integer floor = num.floor(key);
            Integer ceil = num.ceiling(key);
            if (floor != null) {
                sol = Math.min(sol, sum - Math.abs(nums1[pair.value] - nums2[pair.value]) + Math.abs(floor - nums2[pair.value]));
            }
            if (ceil != null) {
                sol = Math.min(sol, sum - Math.abs(nums1[pair.value] - nums2[pair.value]) + Math.abs(ceil - nums2[pair.value]));
            }
        }
        return (int) (sol % 1000000007);
    }

    public static int minimumMountainRemovals(int[] nums) {
        int[] incr = new int[nums.length];
        int[] decr = new int[nums.length];
        Arrays.fill(incr, 1);
        Arrays.fill(decr, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    incr[i] = Math.max(incr[i], incr[j] + 1);
                }
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] < nums[i]) {
                    decr[i] = Math.max(decr[i], decr[j] + 1);
                }
            }
        }
        int sol = 0;
        for (int i = 0; i < nums.length; i++) {
            if (incr[i] > 1 && decr[i] > 1) {
                sol = Math.max(sol, incr[i] + decr[i] - 1);
            }
        }

        return nums.length - sol;
    }

    public static boolean find132pattern(int[] nums) {
        TreeMap<Integer, Integer> gap = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer key = gap.lowerKey(nums[i]);
            if (key != null && gap.get(key) > nums[i]) {
                return true;
            } else {
                key = gap.floorKey(nums[i]);

                if (key != null) {
                    List<Integer> removalCandidate = new ArrayList<>();
                    for (Integer lowK : gap.keySet()) {
                        if (lowK <= key) {
                            removalCandidate.add(lowK);
                        } else {
                            break;
                        }
                    }
                    int max = Integer.MIN_VALUE;
                    for (Integer removal : removalCandidate) {
                        max = Math.max(max, gap.get(removal));
                        gap.remove(removal);
                    }
                    gap.put(removalCandidate.get(0), Math.max(nums[i], max));
                } else {

                    gap.put(nums[i], nums[i]);
                }
            }
        }
        return false;
    }

    public static int maximumScore(int[] nums, int[] multipliers) {
        long[][] dp = new long[multipliers.length][multipliers.length + 1];
        for (int i = 0; i < multipliers.length; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        dp[0][1] = nums[0] * multipliers[0];
        dp[0][0] = nums[nums.length - 1] * multipliers[0];
        for (int i = 1; i < multipliers.length; i++) {
            for (int j = 0; j <= i + 1; j++) {
                int right = (j - i + nums.length - 1) % nums.length;
                if (j == 0) {
                    dp[i][j] = multipliers[i] * nums[right] + dp[i - 1][j];
                    continue;
                }
                long a = multipliers[i] * nums[j - 1] + dp[i - 1][j - 1];
                long b = multipliers[i] * nums[right] + dp[i - 1][j];
                dp[i][j] = Math.max(a, b);
            }
        }
        int sol = Integer.MIN_VALUE;
        for (int i = 0; i <= multipliers.length; i++) {
            sol = Math.max((int) dp[multipliers.length - 1][i], sol);
        }
        return sol;
    }

    static int recurseMultiScore(int cur, int i, int[] nums, int[] multipliers, Map<Integer, Map<Integer, Integer>> dp) {
        if (cur >= multipliers.length) {
            return 0;
        }
        Integer val = getDp(cur, i, dp);
        if (val != null) {
            return val;
        }
        int right = (i - cur + nums.length - 1) % nums.length;
        if (i > right || i >= nums.length || right < 0) {
            return Integer.MIN_VALUE;
        }
        int a = multipliers[cur] * nums[i] + recurseMultiScore(cur + 1, i + 1, nums, multipliers, dp);
        int b = multipliers[cur] * nums[right] + recurseMultiScore(cur + 1, i, nums, multipliers, dp);
        enrichDp(Math.max(a, b), cur, i, dp);
        return Math.max(a, b);
    }

    private static Integer getDp(int cur, int left, Map<Integer, Map<Integer, Integer>> dp) {
        return dp.getOrDefault(cur, new HashMap<>()).get(left);
    }

    private static void enrichDp(int max, int cur, int left, Map<Integer, Map<Integer, Integer>> dp) {
        Map<Integer, Integer> curMap = dp.getOrDefault(cur, new HashMap<>());
        curMap.put(left, max);
        dp.put(cur, curMap);
    }

    public static int maxEvents(int[][] events) {
        PriorityQueue<Integer> attend = new PriorityQueue<Integer>();
        Arrays.sort(events, (a, b) -> a[0] - b[0] == 0 ? a[1] - b[1] : a[0] - b[0]);
        int max = 0;
        int e = 0;
        for (int i = 0; i <= 100000; i++) {
            while (attend.size() > 0 && attend.peek() < i) {
                attend.poll();
            }
            while (events.length > e && events[e][0] == i) {
                attend.add(events[e][1]);
                e++;
            }
            if (attend.size() > 0) {
                attend.poll();
                max++;
            }
        }
        return max;
    }

    public static int minSubarray(int[] nums, int p) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum < p) {
            return -1;
        }
        if (sum % p == 0) {
            return 0;
        }
        int k = (int) (sum % p);
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % p;
            m.put((int) sum, i);
            int x = (int) ((sum > k) ? sum - k : (sum + p - k) % p);
            if (m.containsKey(x) && i - m.get(x) != nums.length) {
                min = Math.min(min, i - m.get(x));
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static int countPairs(int[] deliciousness) {
        List<Integer> pow = new ArrayList<>();
        int mod = Double.valueOf(Math.pow(10, 9) + 7).intValue();
        int two = 1;
        pow.add(1);
        for (int i = 1; i <= 30; i++) {
            two = two * 2;
            pow.add(two);
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < deliciousness.length; i++) {
            int c = count.getOrDefault(deliciousness[i], 0);
            c++;
            count.put(deliciousness[i], c);
        }

        long ans = 0;
        for (int i = 0; i < deliciousness.length; i++) {
            int key = deliciousness[i];
            for (Integer twoPow : pow) {
                if (count.containsKey(twoPow - key)) {
                    if (twoPow - key == key) {
                        ans = (ans + (count.get(twoPow - key) - 1) % mod) % mod;
                    } else {
                        ans = (ans + (count.get(twoPow - key)) % mod) % mod;
                    }
                }
            }
        }
        return (int) ans;
    }

    static public boolean checkSubarraySum(int[] nums, int k) {
        int sum = nums[0];
        Set<Integer> set = new HashSet<>();
        set.add(nums[0] % k);
        set.add(0);
        for (int i = 1; i < nums.length; i++) {
            sum = sum + nums[i];
            if ((nums[i] % k == 0 && nums[i - 1] % k == 0) || (set.contains(sum % k) && nums[i] % k != 0)) {
                return true;
            }
            set.add(sum % k);
        }
        return false;
    }

    public static int kConcatenationMaxSum(int[] arr, int k) {
        int mod = Double.valueOf(Math.pow(10, 9) + 7).intValue();
        long maxSum = 0;
        long sum = 0;
        long overAllSum = 0;
        long progressiveMaxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            overAllSum += arr[i];
            maxSum = Math.max(sum, maxSum);
            progressiveMaxSum = Math.max(progressiveMaxSum, overAllSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        if (k == 1) {
            return Long.valueOf(maxSum % mod).intValue();
        }
        return Long.valueOf((Math.max((sum + (k - 2) * overAllSum + progressiveMaxSum), Math.max(maxSum, sum + progressiveMaxSum))) % mod).intValue();
    }

    public static int minimumJumps(int[] forbidden, int a, int b, int x) {
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 0);
        Set<Integer> forbiddenSet = new HashSet();
        for (int i : forbidden) {
            forbiddenSet.add(i);
        }
        recurse(0, a, b, x, dp, true, forbiddenSet);
        if (dp.containsKey(x)) {
            return dp.get(x);
        }
        return -1;
    }

    static boolean isValid(int cur, Set<Integer> forbidden, int b, int x) {
        if (cur < 0 || cur > x + b || forbidden.contains(cur)) {
            return false;
        }
        return true;
    }

    private static void recurse(int cur, int a, int b, int x, Map<Integer, Integer> dp, boolean forward, Set<Integer> forbidden) {
        int key = cur + a;
        if (isValid(key, forbidden, b, x)) {
            if (!dp.containsKey(key) || dp.get(key) > dp.get(cur) + 1) {
                dp.put(key, dp.get(cur) + 1);
                recurse(key, a, b, x, dp, true, forbidden);
            }
        }
        key = cur - b;
        if (forward && isValid(key, forbidden, b, x)) {
            if (!dp.containsKey(key) || dp.get(key) > dp.get(cur) + 1) {
                dp.put(key, dp.get(cur) + 1);
            }
            recurse(key, a, b, x, dp, false, forbidden);
        }
    }

    public static int[] avoidFlood(int[] rains) {

        Set<Integer> seen = new HashSet<>();
        TreeSet<Integer> floodCandidates = new TreeSet<>();
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] != 0 && seen.contains(rains[i])) {
                floodCandidates.add(rains[i]);
            }
            seen.add(rains[i]);
        }

        int[] ans = new int[rains.length];
        Arrays.fill(ans, -1);
        boolean flag = true;
        Map<Integer, Integer> back = new HashMap<>();
        TreeSet<Integer> zero = new TreeSet<>();
        for (int i = 0; i < rains.length; i++) {
            if (floodCandidates.contains(rains[i])) {
                if (back.containsKey(rains[i])) {
                    int oldIndex = back.get(rains[i]);
                    Integer zelo = zero.higher(oldIndex);
                    if (zelo == null) {
                        flag = false;
                        break;
                    }
                    zero.remove(zelo);
                    ans[zelo] = rains[i];

                }
                back.put(rains[i], i);
            }
            if (rains[i] == 0) {
                zero.add(i);
            }
        }
        for (Integer zelo : zero) {
            ans[zelo] = 1;
        }
        if (flag) {
            return ans;
        }
        return new int[0];
    }

    public static boolean checkPossibility(int[] nums) {
        int issuePoint = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                issuePoint = i - 1;
            }
        }
        if (issuePoint == -1 || issuePoint == nums.length - 1) {
            return true;
        }
        int oldVal = nums[issuePoint];
        nums[issuePoint] = nums[issuePoint + 1];
        boolean flag = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) return true;
        flag = true;
        nums[issuePoint] = oldVal;
        nums[issuePoint + 1] = nums[issuePoint];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int[] findRedundantConnection(int[][] edges) {
        Map<Edge, Integer> edgePositionMap = new HashMap<>();
        Map<Integer, TreeNode> nodeIndexMap = new HashMap<>();
        TreeNode treeNode = null;
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            TreeNode aNode = nodeIndexMap.getOrDefault(a, new TreeNode(a, new ArrayList<>()));
            TreeNode bNode = nodeIndexMap.getOrDefault(b, new TreeNode(b, new ArrayList<>()));
            nodeIndexMap.put(a, aNode);
            nodeIndexMap.put(b, bNode);

            Edge edge = new Edge(a, b);
            edgePositionMap.put(edge, i);
            aNode.getChildren().add(bNode);
            bNode.getChildren().add(aNode);

            treeNode = bNode;
        }
        int[] edgePosition = new int[edges.length];
        Arrays.fill(edgePosition, 0);
        findCycle(treeNode, edgePositionMap, edgePosition, null);
        for (int i = edges.length - 1; i >= 0; i--) {
            if (edgePosition[i] == 1) {
                return edges[i];
            }
        }
        return new int[]{-1, -1};
    }

    static boolean findCycle(TreeNode root, Map<Edge, Integer> edgePositionMap, int[] edgePosition, TreeNode parent) {
        root.setColor(1);
        boolean isCycle = false;
        for (TreeNode child : root.getChildren()) {
            boolean flag = false;
            if (parent != child) {
                if (child.getColor() == 0) {
                    flag = findCycle(child, edgePositionMap, edgePosition, root);
                } else if (child.getColor() == 1) {
                    cycleStart = child;
                    flag = true;
                }
                if (flag) {
                    int position = edgePositionMap.get(new Edge(root.getI(), child.getI()));
                    edgePosition[position] = 1;
                }
                isCycle = isCycle || flag;
            }
        }
        root.setColor(0);
        if (cycleStart == root) {
            return false;
        }
        return isCycle;
    }

    static int flipSol(int[] A) {
        int flip1 = 0;
        int flip2 = 0;
        int start = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != start) {
                flip1++;
            }
            start = (start + 1) % 2;
        }
        start = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != start) {
                flip2++;
            }
            start = (start + 1) % 2;
        }
        return Math.min(flip1, flip2);

    }

    static int ballonSol(String str) {
        Map<Character, Integer> balCountMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int oldCount = balCountMap.getOrDefault(str.charAt(i), 0);
            oldCount++;
            balCountMap.put(str.charAt(i), oldCount);
        }
        int bCount = balCountMap.getOrDefault('B', 0);
        int aCount = balCountMap.getOrDefault('A', 0);
        int lCount = balCountMap.getOrDefault('L', 0) / 2;
        int oCount = balCountMap.getOrDefault('O', 0) / 2;
        int nCount = balCountMap.getOrDefault('N', 0);
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

    public static class TreeNode {
        private final int i;
        private final List<TreeNode> children;
        private int color;

        public TreeNode(int i, List<TreeNode> children) {
            this.i = i;
            this.children = children;
            this.color = 0;
        }

        public int getI() {
            return i;
        }

        public List<TreeNode> getChildren() {
            return children;
        }

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }
    }

    private static class Edge {
        private final int a;
        private final int b;

        public Edge(int a, int b) {
            if (a < b) {
                this.a = a;
                this.b = b;
            } else {
                this.a = b;
                this.b = a;
            }
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Edge edge = (Edge) object;
            return a == edge.a && b == edge.b;
        }

        public int hashCode() {
            return java.util.Objects.hash(a, b);
        }
    }

    public static class Node {
        private int i;
        private List<Node> friends;
        private Set<Integer> neighbourSet;

        public Node(int i) {
            this.i = i;
            this.friends = new ArrayList<>();
            this.neighbourSet = new HashSet<>();
        }

        public Set<Integer> getNeighbourSet() {
            return neighbourSet;
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

    static class Pair {
        private int key;
        private int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


}

