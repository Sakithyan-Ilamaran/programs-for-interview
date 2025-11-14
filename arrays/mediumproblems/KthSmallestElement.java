package Zohocodinground.arrays.mediumproblems;

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr1 = {1,5,45,23,76,4,2,3};
        int[] arr2 = {4,8,7,1,10,2,14};

        System.out.println(findKthSmallestElement(arr1, 5));
        System.out.println(findKthSmallestElement(arr2, 6));
    }

    public static int findKthSmallestElement(int[] arr, int k) {

        if (arr.length < k) return -1;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : arr) {
            queue.add(num);
        }

        for (int i=0; i<k-1; i++) {
            queue.poll();
        }

        return queue.peek();
    }
}
