package Zohocodinground.maths.arithmetic;

public class DigitSumUntilSingleUnit {
    public static void main(String[] args) {
        findDigitSumUntilSingleUnit(12345);
    }

    public static void findDigitSumUntilSingleUnit(int n) {

        while (n > 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

             n = sum;
        }

        System.out.println(n + " ");
    }
}
