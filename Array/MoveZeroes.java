package Array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

        for (int num : nums) {
            System.out.println(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i= 0; i< nums.length; i++) {
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }
        for(int i= count; i< nums.length; i++){
            nums[i] = 0;
        }
    }
}
