package String;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for (String s : word1) {
            s1 = s1.concat(s);
        }


        for (String s : word2) {
            s2 = s2.concat(s);
        }

        return s1.equals(s2);
    }
}
