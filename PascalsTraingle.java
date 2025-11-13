package genericprograms;

public class PascalsTraingle {
    public static void main(String[] args) {

        pascalTriangle(5);
        reversePascalTriangle(5);
        findElement(5,3);
    }
    public static int factorial(int n) {
        if (n == 0) return 1;
        else return n * factorial(n-1);
    }

    public static int pascalCombination(int i, int k) {
        return factorial(i) / (factorial(k) * factorial(i-k));
    }

    public static void pascalTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print(" " + pascalCombination(i, k));
            }

            System.out.println();
        }
    }

    public static void reversePascalTriangle(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" " + pascalCombination(i, k));
            }
            System.out.println();
        }
    }

    public static void findElement(int i, int k) {
        int numerator = factorial(i);
        int denominator = factorial(k) * factorial(i - k);
        System.out.println("The element is in: "+ numerator / denominator);
    }
}
