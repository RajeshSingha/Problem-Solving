package Array.PusedArray;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] a = getConcatenation(nums);

        for (int i = 0; i < nums.length * 2; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] ans = new int[2 * l];
        int j = 0;

        for (int i = 0; i < 2 * l; i++) {
            ans[i] = nums[(j++) % l];
        }
        return ans;
    }

}
