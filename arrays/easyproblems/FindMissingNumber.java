package Zohocodinground.arrays.easyproblems;

public class FindMissingNumber {
    public static void main(String[] args) {

        int[] arr1 = {0,1,3};
        int[] arr2 = {};
        int[] arr3 = {2,3,4,1};
        int[] arr4 = {0,2,1,3,4};

        System.out.println(findMissingNumber(arr1));
        System.out.println(findMissingNumber(arr2));
        System.out.println(findMissingNumber(arr3));
        System.out.println(findMissingNumber(arr4));

    }

   public static int findMissingNumber(int[] arr) {
       int length = arr.length;
       if (length == 0) {
           return 0;
       }
       int total = (length * (length + 1)) / 2;
       for (int num : arr) {
           total -= num;
       }
       return total;
   }

    public static int findMissingNumber2(int[] arr) {
        int len = arr.length;
        int tot = len * (len + 1) / 2;
        for (int n : arr) {
            tot = tot - n;
        }

        return tot;
    }
}
