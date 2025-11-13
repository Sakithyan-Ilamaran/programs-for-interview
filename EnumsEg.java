package genericprograms;


public class EnumsEg {
    public static void main(String[] args) {
        status s1  = status.PENDING;
        status s2 = status.PROGRESS;

        System.out.println(s1.getDescription());
        System.out.println(s2.getDescription());
    }
}

 enum status {

     PENDING("the task is pending"),
     PROGRESS("The task is in progress");
    private final String description;
     status(String description) {
         this.description = description;
    }

    public String getDescription() {
         return description;
    }

 }
