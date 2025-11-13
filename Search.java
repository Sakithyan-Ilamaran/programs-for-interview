package Module_1;

public class Search {
    public static void main(String[] args) {
        int[] arr = {3,6,4,6,9,3,3,6,9,2};
        System.out.println(linearSearch(arr, 6));
        System.out.println(binarySearch(arr, 9));

    }

    public static int linearSearch(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int tar) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = arr[mid];

            if (value < tar) low = mid + 1;
            else if (value > tar) high = mid - 1;
            else  return mid;
        }

        return -1;
    }
}

