package Zohocodinground.arrays.easyproblems;

public class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        System.out.println(findUniqueElement(arr));
    }

    public static int findUniqueElement(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static int findUniqueElementLogNSq(int[] arr) {
        for (int k : arr) {
            int count = 0;
            for (int i : arr) {
                if (k == i) {
                    count++;
                }
            }
            if (count == 1) {
                return k;
            }
        }
        return -1;
    }
}
