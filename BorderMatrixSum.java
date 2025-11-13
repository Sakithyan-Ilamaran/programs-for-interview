package minuscule;

public class BorderMatrixSum {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] matrix2 = {
                {1,2},
                {3,4}};
        System.out.println(sumBorderElements(matrix1));
        System.out.println(sumBorderElements(matrix2));
    }

    public static int sumBorderElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 0 || i == matrix.length - 1 || j == 0 || j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
}
