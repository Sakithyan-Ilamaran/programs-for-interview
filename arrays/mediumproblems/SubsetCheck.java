package Zohocodinground.arrays.mediumproblems;

public class SubsetCheck {
    public static void main(String[] args) {

        int[] arr1 = {1,3,5,6,7,8,9,10};
        int[] arr2 = {3,6,9};

        System.out.println(findSubsetCheck1(arr1,arr2));
    }

    public static boolean findSubsetCheck(int[] arr1, int[] arr2) {
        int i=0, j=0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            }
        }
        return j == arr2.length;
    }

    public static boolean findSubsetCheck1(int[] arr1, int[] arr2) {
        int i=0, j=0;

        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            }
        }
        return j == arr2.length;
    }
}
