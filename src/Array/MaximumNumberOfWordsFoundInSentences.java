package Array;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] s = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(s));
    }

    public static int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (String sentence : sentences) {
            String[] a = sentence.split(" ");
            if (a.length > ans) {
                ans = a.length;
            }
        }
        return ans;
    }
}
