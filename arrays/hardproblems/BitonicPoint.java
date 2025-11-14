package Zohocodinground.arrays.hardproblems;

public class BitonicPoint {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,15,7,5,2};
        System.out.println(findBitonicPoint(arr));
    }

    public static int findBitonicPoint(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                return arr[mid];
            } else if (arr[mid-1] > arr[mid] ) {
                right = mid-1;
            } else  {
                left = mid+1;
            }
        }
        return -1;
    }
}
