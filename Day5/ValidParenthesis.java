package Day5;

import java.util.Stack;

public class ValidParenthesis {

    public boolean check(String checkSequence) {
        Stack<Character> stack = new Stack<>();

        int length = checkSequence.length();

        for (int i=0; i<length; i++) {
            char character = checkSequence.charAt(i);
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else if (stack.isEmpty()) {
                return false;
            } else if (character == ')' && stack.pop() != '(') {
                return false;
            } else if (character == ']' && stack.pop() != '[') {
                return false;
            } else if (character == '}' && stack.pop() != '{') {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.check("()[]{}"));
    }
}
