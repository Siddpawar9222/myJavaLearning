package G_OOPS.Enum;

public class Basic1 {
     public static void main(String[] args) {
        
        Status s = Status.FAILED ;

        switch (s) {
            case RUNNING:
                System.out.println("Operation Running");
                break;
            case FAILED:
                System.out.println("Operation Failed");
                break;
            case PENDING:
                System.out.println("Operation Pending");
                break;
            case SUCCESS:
                System.out.println("Operatioon Successful");
                break;
        
            default:
                System.out.println("Nothing to do");
                break;
        }



     }
}
/*
-I can use loops in enum
-Switch also supports for enum
 */