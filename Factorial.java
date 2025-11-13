package Module_1;

public class Factorial {
    public static void main(String[] args) {
        Factorial(4);
        System.out.println(recFactorial(4));
    }
    public static void Factorial(int n){
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact + " ");
    }

    public static int recFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * recFactorial(n - 1);
    }
}
