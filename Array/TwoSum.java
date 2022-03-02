package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        int[] ans = twoSum(nums, 4);
        for(int a:ans){
            System.out.print(a + " ");
        }
    }

    int sum = 0;
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                int complement = target - nums[i];

                if(nums[j] == complement){
                    return new int[] {i,j};
                }
            }
        }

        throw new IllegalArgumentException("No match found");
    }

}
