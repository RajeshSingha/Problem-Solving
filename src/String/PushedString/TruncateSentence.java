package String.PushedString;

public class TruncateSentence {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }

    public static String truncateSentence(String s, int k) {
        String[] a = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < k; i++) {
            ans.append(a[i]);
            if (i == k - 1) {
                continue;
            } else {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
