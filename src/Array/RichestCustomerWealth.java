package Array;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(a));
    }

    public static int maximumWealth(int[][] acc) {
        int l = acc.length;
        int max = -2147483648;
        int sum = 0;
        for (int[] ints : acc) {
            for (int anInt : ints) {
                sum += anInt;
            }
            if (max < sum) {
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
