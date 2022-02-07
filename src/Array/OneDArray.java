package Array;

public class OneDArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = runningSum(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(ans[i] + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int l = nums.length;
        int[] a = new int[l];

        a[0] = nums[0];
        for (int i = 1; i < l; i++) {
            a[i] = a[i - 1] + nums[i];
        }
        return a;
    }
}
