package Zohocodinground.arrays.twopointers;

import java.util.Arrays;

public class PairWithSum {
    public static void main(String[] args) {

        int[] arr = {1,2,4,2,5,3,9};
        Arrays.sort(arr);

        System.out.println(hasPairWithSUmTwoPointer(arr, 8));

    }

    public static boolean hasPairWithSUmTwoPointer(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                return true;
            } else if (sum < target) left++;
             else right--;
        }

        return false;
    }

    public static boolean hasPairWithSUmBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    return true;
                }
            }
        }

        return false;
    }
}
