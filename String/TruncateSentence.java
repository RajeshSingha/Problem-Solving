package String;

public class TruncateSentence {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }

    public static String truncateSentence(String s, int k) {
        String[] a = s.split(" ");
        String ans = "";
        for (int i = 0; i < k; i++) {
            ans += a[i];
            if (i == k - 1) {
                continue;
            } else {
                ans += " ";
            }
        }

        return ans;
    }
}
