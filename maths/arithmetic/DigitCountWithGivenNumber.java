package Zohocodinground.maths.arithmetic;

public class DigitCountWithGivenNumber {
    public static void main(String[] args) {

        findDigitCount(989949339, 3);
    }

    public static void findDigitCount(int N, int D) {
        int count = 0;

        while (N > 0) {
            int digit = N % 10;

            if (digit == D) {
                count++;
            }

            N /= 10;
        }

        System.out.println("Digits repeated: " + count);
    }
}
