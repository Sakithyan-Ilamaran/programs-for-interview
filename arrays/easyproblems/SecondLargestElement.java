package Zohocodinground.arrays.easyproblems;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr1 = {1,5,4,2,3};
        int[] arr2 = {5,5,4};
        int[] arr3 = {3,3,3};
        int[] arr4 = {5,-2,-5};

        System.out.println(findSecondLargestElement(arr1));
        System.out.println(findSecondLargestElement(arr2));
        System.out.println(findSecondLargestElement(arr3));
        System.out.println(findSecondLargestElement(arr4));
    }

    public static int findSecondLargestElement(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return -1;

        int lar = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;

        for (int num : arr) {
            if (lar < num) {
                secLar = lar;
                lar = num;
            } else if (secLar < num && num != lar) {
                secLar = num;
            }
        }

        if (secLar == Integer.MIN_VALUE) {
            return lar;
        }
        return secLar;
    }

    public static int findSecondLargestElement1(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return -1;

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int n : arr) {
            if (max < n) {
                secMax = max;
                max = n;
            } else if (secMax < n && n != max) {
                secMax = n;
            }
        }

        if (secMax == Integer.MIN_VALUE) {
            return max;
        }

        return secMax;
    }


}
