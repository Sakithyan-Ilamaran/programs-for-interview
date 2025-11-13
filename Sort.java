package Module_1;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 5, 3, 6, 7, 9, 9, 5, 3, 3};
        //sort(arr);
        //bubbleSort(arr);
        //Reverse(arr);
        //ass_dec(arr);
        mergeSort(arr, 0, arr.length - 1);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
//        System.out.println();
    }

    public static int sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        return 0;
    }
    
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void Reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void ass_dec(int[] arr) {
        Arrays.sort(arr);
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length / 2; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            for (int j = arr.length / 2; j >= 0; j--) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + " ");
//        }
        System.out.println();
    }

    public static void merge(int[]arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int x = 0; x < n1 ; x++) {
            leftArr[x] = arr[l + x];
        }

        for (int x = 0; x < n2; x++) {
            rightArr[x] = arr[mid + 1 + x];
        }

        int i=0, j=0, k=l;

        while (i < n1 && j < n2) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;

            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}




