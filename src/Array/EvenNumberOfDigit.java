package Array;

public class EvenNumberOfDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896, 12};
        System.out.println(solution(nums));
    }

    static int solution(int[] nums){
        int n=0;
        int jur = 0;
        for(int i=0; i < nums.length; i++){
            int k = nums[i];
            while(k > 0 ){
                k = k/10;
                n++;
            }
            if (n%2 ==0){
                jur++;
            }
            n = 0;
        }
        return jur;
    }
}
