package String;

import org.jetbrains.annotations.NotNull;

class Shuffle {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString("codeleet", array));
    }


    public static @NotNull
    String restoreString(String s, int[] indices) {
        if (s.length() == 0) return "";
        if (s.length() != indices.length) return "";

        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int pos = indices[i];
            c[pos] = s.charAt(i);
        }
        return new String(c);
    }
}