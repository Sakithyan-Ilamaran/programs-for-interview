package minuscule;

public class PrimeLimit {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
        sumLimit(5);

    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count == 0;
    }

    public static void sumLimit(int limit) {
        int sum = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
