package Array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int l = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < l; i++) {
            Integer cnt = map.get(nums[i]);
            if (cnt == null) {
                cnt = 1;
            } else {
                cnt++;
            }
            map.put(nums[i], cnt);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) != 2) {
                return key;
            }
        }
        return -1;
    }
}
