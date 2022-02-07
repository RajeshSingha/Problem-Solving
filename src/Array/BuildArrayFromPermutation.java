package Array;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] a = buildArray(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] buildArray(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
