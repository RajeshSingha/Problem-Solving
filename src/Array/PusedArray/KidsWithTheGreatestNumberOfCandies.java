package Array.PusedArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        List<Boolean> ans = kidsWithCandies(candies, 3);

        for (Boolean an : ans) {
            System.out.print(an + " ");
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> b = new ArrayList<>();
        int maxInArray = -2147483648;

        for (int candy : candies) {
            if (candy > maxInArray) {
                maxInArray = candy;
            }
        }
        int x = maxInArray - extraCandies;
        for (int candy : candies) {
            if (candy >= x) {
                b.add(true);
            } else {
                b.add(false);
            }
        }
        return b;
    }
}
