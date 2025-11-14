package Zohocodinground.strings.easyproblems;

public class StringPalindromeFixer {
    public static void main(String[] args) {

        String str1 = "abca";
        String str2 = "aabbccr";
        System.out.println(makePalindrome2(str2));

    }

    public static String makePalindrome(String str) {
        StringBuilder  result = new StringBuilder(str);

        int left = 0;
        int right = result.length() - 1;

        while (left < right) {
            if (result.charAt(left) == result.charAt(right)) {
                left++;
                right--;
            } else {
                result.insert(left, result.charAt(right));
                left = 0;
                right = result.length() - 1;

            }
        }

        return result.toString();
    }

    public static String makePalindrome2(String str) {
        StringBuilder result = new StringBuilder(str);

        int left = 0;
        int right = result.length() - 1;

        while (left < right) {
            if (result.charAt(left) == result.charAt(right)) {
                left++;
                right--;
            } else {
                result.insert(left, result.charAt(right));
                left = 0;
                right = result.length() - 1;
            }
        }

        return result.toString();
    }
}
