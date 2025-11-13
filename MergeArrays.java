package Module_1;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int[] a = {1,5,3,7};
        int l1 = a.length;
        int[] b = {2,6,4,8};
        int l2 = b.length;
        int[] c = new int[l1+l2];
        Arrays.sort(a);
        Arrays.sort(b);
        mergeArrays(a,b,c,l1,l2);

        //merAr(a,b,c,l1,l1);
    }

    public static void mergeArrays(int[] a, int[] b, int[] c, int l1, int l2 ){
        int i = 0 , j = 0 , k = 0;
        while (i < l1 && j < l2){
            if(a[i] < b[j]){
                c[k] = a[i];
                k++;
                i++;
            }else{
                c[k] = b[j];
                k++;
                j++;
            }
        }
        while(i < l1){
            c[k] = a[i];
            k++;
            i++;
        }
        while (j < l2){
            c[k] = b[j];
            k++;
            j++;
        }
        for (int m = 0; m < l1+l2 ; m++) {
            System.out.print(c[m]+" ");
        }
    }

    public static void merAr(int[] a, int[] b, int[] c, int l1, int l2){
        int i=0, j=0, k=0;
        while (i < l1 && j < l2) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }

        while (i < l1) {
            c[k] = a[i];
            k++;
            i++;
        }

        while (j < l2) {
            c[k] = b[j];
            k++;
            j++;
        }

        for (int l = 0; l < l1 + l2 ; l++) {
            System.out.print(c[l] + " ");
        }

    }

}
