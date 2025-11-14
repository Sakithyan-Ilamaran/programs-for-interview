package Zohocodinground.arrays.easyproblems;

import java.util.Arrays;

public class SumOfDigitsInArray {
    public static void main(String[] args) {
        int[] arr = {123, 45, 6, 789};
        System.out.println(Arrays.toString(findSumOfDigitsInArray2(arr)));
    }

    public static int[] findSumOfDigitsInArray(int[] arr) {
        int[] resultArray = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //int ele = arr[i];
            while (arr[i] > 0) {
                //int digits = ele % 10;
                sum += arr[i] % 10;
                arr[i] /= 10;
            }
            resultArray[i] = sum;
        }
        return resultArray;
    }

    public static int[] findSumOfDigitsInArray2(int[] arr) {
        int[] result = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                sum = sum + arr[i] % 10;
                arr[i] /= 10;
            }

            result[i] = sum;
        }

        return result;
    }
}
