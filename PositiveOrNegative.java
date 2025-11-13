package Module_1;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Positive_or_Negative();
    }
    public static void Positive_or_Negative(){
        int n= 0;
        if(n>0){
            System.out.println("positive number");
        }
        else if(n == 0){
            System.out.println("zero");
        }
        else{
            System.out.println("negative number");
        }
    }
}
