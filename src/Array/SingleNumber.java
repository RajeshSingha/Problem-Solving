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
        for (int num : nums) {
            Integer cnt = map.get(num);
            if (cnt == null) {
                cnt = 1;
            } else {
                cnt++;
            }
            map.put(num, cnt);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) != 2) {
                return key;
            }
        }
        return -1;
    }
}
