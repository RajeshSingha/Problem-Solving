package Array;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] s = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(s));
    }

    public static int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (int i=0; i< sentences.length; i++){
            String[] a = sentences[i].split(" ");
            if(a.length > ans){
                ans = a.length;
            }
        }
        return ans;
    }
}
