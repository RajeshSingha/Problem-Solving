package String;

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        System.out.println(countSegments("   ,     foo bar"));
    }

    public static int countSegments(String s) {
        int c = 0;

        for(int i=0 ; i < s.length(); i++){
            if((i==0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ')
                c++;
        }
        return c;
    }
}
