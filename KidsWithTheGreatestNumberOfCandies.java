package Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        List<Boolean> ans = kidsWithCandies(candies, 3);

        Iterator<Boolean> iter = ans.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> b = new ArrayList<>();
        int maxInArray = -2147483648;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxInArray) {
                maxInArray = candies[i];
            }
        }
        int x = maxInArray - extraCandies;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= x) {
                b.add(true);
            } else {
                b.add(false);
            }
        }
        return b;
    }
}
