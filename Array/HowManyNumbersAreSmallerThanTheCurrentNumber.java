package Array;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] a = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(a);

        for (int i: ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];
        int g = 0;
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length; j++){
                if(i==j) continue;
                if(nums[i] > nums[j]) g++;
            }
            ans[i] = g;
            g=0;
        }
        return ans;
    }
}
