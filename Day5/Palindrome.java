package Day5;

import java.util.Stack;

public class Palindrome {
    public boolean isPalindrome(String string) {
        StringBuilder reversedString = new StringBuilder(string.length());
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<string.length(); i++) {
            stack.push(string.charAt(i));
        }
        int stackSize = stack.size();
        for (int i=0; i<stackSize; i++) {
            reversedString.append(stack.pop());
        }
        return reversedString.toString().equals(string);
    }
    public static void main(String[] args) {
        String string = "madam";
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(string));
    }
}
