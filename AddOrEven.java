package Module_1;

public class AddOrEven {
    public static void main(String[] args) {
        AddorEven(0);
        AddorEven(21);
        AddorEven(50);
        AddorEven(24);
        AddorEven(27);
        AddorEven(101);
        AddorEven(0);
    }

    public static int AddorEven(int n) {
       if(n == 0){
           System.out.println("zero");
       }else if(n % 2 ==0){
           System.out.println("Even");
       }else{
           System.out.println("odd");
       }
        return n;
    }
}
