package Zohocodinground.arrays.easyproblems;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {3,4,6,5,8,5,9,6,1,5,11,3,1,2,2};
        System.out.println(equilibriumIndex2(arr));
    }

    public static int equilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (totalSum == leftSum) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }

    public static int equilibriumIndex2(int[] arr) {
        int totalSum = 0;

        for (int n : arr) {
            totalSum = totalSum + n;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum - arr[i];
            if (totalSum == leftSum) return i;
            leftSum = leftSum + arr[i];
        }

        return -1;
    }
}
