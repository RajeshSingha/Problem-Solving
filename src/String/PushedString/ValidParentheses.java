package String.PushedString;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') return false;
        if (s.charAt(s.length() - 1) == '(' || s.charAt(s.length() - 1) == '{' || s.charAt(s.length() - 1) == '[')
            return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();

    }

    public static class Shuffle {
    }
}
