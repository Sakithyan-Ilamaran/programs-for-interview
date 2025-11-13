package minuscule;

public class Strings {
    public static void main(String[] args) {
        String str = "S&A*K(I^T&H^Y#A@N";
        String str2 = "ra*Ce*Car";
        //System.out.println(reverseStringUsingRecursion(str));
        System.out.println(" ");
        System.out.println(reverseStringWithoutSpecialCharacter(str));
        System.out.println(checkStringPalindromeExceptSymbols(str2));

        printFizzBuzz(10);
    }

    public static String reverseStringUsingRecursion(String word) {
        if (word == null || word.length() <= 1) return word;
        return reverseStringUsingRecursion(word.substring(1)) + word.charAt(0);
    }

    public static String reverseStringWithoutSpecialCharacter(String str) {
            char[] chars = str.toCharArray();
            int left = 0,  right = chars.length - 1;

            while (left < right) {
                if (!Character.isLetter(chars[left])) {
                    left++;
                } else if (!Character.isLetter(chars[right])) {
                    right--;
                } else {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
            }

            return new String(chars);
    }

    public static boolean checkStringPalindromeExceptSymbols(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                System.out.print(cleaned + " ");
                return false;
            }
            left++;
            right--;
        }
        System.out.print(cleaned + " ");
        return true;
    }

    public static void printFizzBuzz(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(n);
            }
        }
    }
}
