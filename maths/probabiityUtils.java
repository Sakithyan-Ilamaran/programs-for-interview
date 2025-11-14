package Zohocodinground.maths;

public class probabiityUtils {
    public static void main(String[] args) {

        int n = 1;
        int r = 2;

        System.out.println(countHeads(n, r));
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 2; i <= n ; i++) {
            fact *= i;
            fact++;
        }

        return fact;
    }

    public static double countHeads(int n, int r) {

        double res;

        res = (double) fact(n) / fact(r) * fact(n-r);
        res = res / Math.pow(2,n);

        return res;
    }
}
