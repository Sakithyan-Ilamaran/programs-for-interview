package genericprograms;

import com.sun.security.jgss.GSSUtil;

public class Patterns {
    public static void main(String[] args) {
//     numberTrianglePattern(5);
//     numberTrianglePatternNormal(5);
//     numberTrianglePatternHalfNumHalfStr(5);
//        leftHalfPyramid(5);
//        reverseLeftHalfPyramid(5);
        diamondPatter(5);
    }

    public static void numberTrianglePattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(i + " "); // if we print i num repeate, if print j , num increase
            }

            System.out.println();
        }
    }

    public static void numberTrianglePatternNormal(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void numberTrianglePatternHalfNumHalfStr(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(j + " ");
                } else System.out.print("*" + " ");
            }

            System.out.println();
        }
    }

    public static void leftHalfPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    public static void reverseLeftHalfPyramid(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamondPatter(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
