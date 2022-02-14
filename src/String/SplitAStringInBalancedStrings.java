package String;

public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
    }

    public static int balancedStringSplit(String s) {
        if (s.length() == 0)
            return 0;
        int rcount = 0;
        int lcount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') lcount++;
            else rcount++;

            if (lcount == rcount)
                count++;
        }

        return count;

    }
}
