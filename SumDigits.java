package Module_1;

public class SumDigits {
    public static void main(String[] args) {
       // sumDigits(999988877);

        sumDigits(111);
    }
    public static void sumDigits(int n) {
        int sum = 0;
        while(n >0){
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);
    }
}
