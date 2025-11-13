package Module_1;

public class Factors {
    public static void main(String[] args) {
        Fact(28);
        if (perfect(28)){
            System.out.println("perfect");
        }

    }
    public static void Fact(int n) {
        System.out.print(1 + " ");

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        System.out.println(n + " ");
    }
    public static boolean perfect(int n){
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n ;
    }
}
