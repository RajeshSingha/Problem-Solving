package Array;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInAnArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5};
        System.out.println(findPairs(nums, 2));

    }

    public static int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int count = 0;
        if (k == 0) {
            for (Integer key : map.keySet()) {
                if (map.get(key) >= 2) {
                    count++;
                }
            }
        } else {
            for (Integer key : map.keySet()) {
                if (map.containsKey(key + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}