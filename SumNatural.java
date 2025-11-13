package Module_1;
public class SumNatural {
    public static void main(String[] args) {
        sumNatural(10);
        sumRange(5,7);
    }
    public static int sumNatural(int n){
        int sum= 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        } System.out.println(sum);
        return sum;
    }
    public static void sumRange(int a, int b){
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
