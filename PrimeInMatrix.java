package softsuave;

public class PrimeInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println("MATRIX: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        printPrimes(matrix);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i < Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void printPrimes(int[][] matrix) {
        System.out.println("Prime numbers in the matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isPrime(matrix[i][j])) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
