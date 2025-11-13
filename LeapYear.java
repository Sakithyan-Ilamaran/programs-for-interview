package Module_1;

public class LeapYear {
    public static void main(String[] args) {
        findLeapYear(1900);
    }
    public static void findLeapYear(int year){
        if(year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap!");
                } else {
                    System.out.println("non-leap");
                }
            } else {
                System.out.println("non-leap");
            }
        } else {
            System.out.println("non-leap");
        }
    }
}
