package Module_1;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,20,30,30,30,30,40,40,50,50,60,60,60};
        //removeDuplicates(arr);
        remDup(arr);
    }
    public static void removeDuplicates(int[] arr){
        int Index =1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]){
                arr[Index] = arr[i];
                Index++;
            }
        }

        for (int i = 0; i < Index; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void remDup(int[] arr) {
        int ind = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                arr[ind] = arr[i];
                ind++;
            }
        }
        for (int i = 0; i < ind; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
