package Array.PusedArray;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] a = shuffle(nums, n);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int[] a = new int[l];
        short flag = 0;
        int j = 0;
        for (int i = 0; i < l; i++) {
            if (flag == 0) {
                a[i] = nums[j++];
                flag = 1;
            } else {
                a[i] = nums[n++];
                flag = 0;
            }
        }
        return a;
    }
}
