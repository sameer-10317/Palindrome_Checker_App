public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "A man a plan a canal Panama";
        String normalized = original
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a Palindrome (Ignoring spaces & case).");
        } else {
            System.out.println("\"" + original + "\" is NOT a Palindrome.");
        }
    }
    }
