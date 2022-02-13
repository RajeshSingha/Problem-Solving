package String;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    private static void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private static boolean isVowel(char[] arr, int index) {
        char ch = arr[index];

        return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U';
    }

    public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();

        while (left < right){
            while(left < right && isVowel(arr, left)){
                left++;
            }

            while(left < right && isVowel(arr, right)){
                right--;
            }

            swap(arr, left, right);
            left++;
            right--;
        }

        return new String(arr);
    }


}
