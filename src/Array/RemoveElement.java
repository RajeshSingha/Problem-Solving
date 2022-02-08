package Array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3,4,4,4,4,7,3};
        int val = removeElement(nums, 3);

        for(int i=0;i<val;i++){
            System.out.print(nums[i] + " ");
        }

    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}