package Module_1;

public class MaxnMin {
    public static void main(String[] args) {
        int[] arr = {1,5,2,65,34,7,867,423,4,33,55,5543,5,2,3};
        Max(arr);
        SEC_MAX(arr);
        MIN(arr);
        SEC_MIN(arr);

    }
    public static void Max(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if(max < i)
                max = i;
        }
        System.out.println(max);
    }
    public static void MIN (int [] arr){
        int min = arr[0];
        for (int i : arr) {
            if(min > i)
                min = i;
        }
        System.out.println(min);

    }
    public static void SEC_MIN(int[] arr) {
//        int min = arr[0];
        int min = Integer.MAX_VALUE;
        int sec_smallest = Integer.MAX_VALUE;
        for (int j : arr) {
            if (min > j) {
                sec_smallest = min;
                min = j;
            } else if (sec_smallest != min && sec_smallest > j  ) {
                sec_smallest = j;
            }
        }
//        for (int i : arr) {
//         if (i != min && i < sec_smallest){
//             sec_smallest = arr[i];
//         }
//        }
        System.out.println(sec_smallest);
    }
    public static void SEC_MAX(int[] arr) {
        int max = arr[0];
        int sec_max = Integer.MIN_VALUE;

        for (int j : arr) {
            if (max < j) {
                sec_max = max;
                max = j;
            } else if (sec_max < j) {
                sec_max = j;
            }
        }
//        for (int j : arr) {
//            if (j != max && j > sec_max) {
//                sec_max = j;
//            }
//        }
        System.out.println(sec_max);
    }
}
