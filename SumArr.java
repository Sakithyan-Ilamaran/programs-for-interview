package Module_1;

public class SumArr {
    public static void main(String[] args) {
        int[] arr = {1,4,5,5,3,6,7,9,9,5,3,3};
        Sum(arr);

    }
    public static void Sum(int[] arr){
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
//        }
//        System.out.println(sum);

        int s = 0;
        for (int i : arr) {
            s += i;
        }
        System.out.println(s);
    }
}
