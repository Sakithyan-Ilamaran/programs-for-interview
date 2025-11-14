package Zohocodinground.arrays.easyproblems;

public class LargestNumberDigits {
    public static void main(String[] args) {
        int[] arr = {1,5,6,4,8};
        findLargestNumberDigits1(arr);
    }

    public static void findLargestNumberDigits(int[] arr) {
        int[] count = new int[10];

        for (int num : arr) {
            count[num]++;
        }

        StringBuilder result = new StringBuilder();

        for (int i=9; i>=0; i--) {
            while (count[i] > 0) {
                result.append(i);
                count[i]--;
            }
        }
        System.out.println(result);
    }

    public static void findLargestNumberDigits1(int[] arr) {
        int[] count = new int[10];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            while (count[i] > 0) {
                stringBuilder.append(i);
                count[i]--;
            }
        }
        System.out.println(stringBuilder + " ");
    }
}
