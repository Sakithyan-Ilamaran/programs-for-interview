package Module_1;

public class Palindrome {
    public static void main(String[] args) {
        intPalindrome(101101);

        System.out.println(stringPalindrome("racecar"));

    }
    public static void intPalindrome(int n) {
        int reverse = 0, temp = n;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }

        if (n == reverse) {
            System.out.println(n);
        }
    }

    public static boolean stringPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }

}
