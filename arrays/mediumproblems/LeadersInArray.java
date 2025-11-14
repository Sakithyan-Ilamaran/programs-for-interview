package Zohocodinground.arrays.mediumproblems;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2,1,8,4,2,7,3,2};
        findLeadersInArray1(arr);
        //findLeadersInArray2(arr);
    }

    public static void findLeadersInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        StringBuilder result = new StringBuilder();
        for (int i = arr.length-1; i >=0; i--) {
            if (max < arr[i]) {
                max = arr[i];
                result.insert(0, max + " ");
            }
        }
        System.out.println(result + " ");
    }

    public static void findLeadersInArray1(int[] arr) {
        int lar = Integer.MIN_VALUE;

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = arr.length-1; i > 0 ; i--) {
            if (lar < arr[i]) {
                lar = arr[i];
                stringBuilder.insert(0, lar + " ");
            }
        }
        System.out.println(stringBuilder);
    }
}
