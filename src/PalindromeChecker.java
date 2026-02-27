import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "level";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < original.length(); i++) {
            char fromStack = stack.pop();
            char fromQueue = queue.remove();

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
    }
