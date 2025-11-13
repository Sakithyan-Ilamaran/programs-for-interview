package Module_1;

public class Armstrong {
    public static void main(String[] args) {
        Armtrong(407);
        ArmstrongRange(1,300);
    }
    public static int DigitsCount(int n){
        int len = 0;
        while(n >0){
            n = n/10;
            len++;
        }
        return len;
    }
    public static void Armtrong(int n){
        int reminder, sum = 0, temp = n;
        while (temp > 0){
//            reminder = temp % 10;
           sum = (int) (sum + Math.pow(temp %10 , DigitsCount(n)));
           temp /= 10;
        }
        if(sum == n){
            System.out.print(n + " || ");
        }
    }
    public static void ArmstrongRange(int low, int high) {

        for (int i = low; i < high; i++) {
            Armtrong(i);
        }
    }
}



