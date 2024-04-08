package N_DesignPattern.CreationalDP.SingletonDP;

public class GovernmentOffice {

    // Lazy way to create Singleton object
    private static GovernmentOffice governmentOffice;

    private GovernmentOffice() { 
         
    }

    // This method Not Good in multithread environment(multiple thread can create mutltiple object)
    // public static GovernmentOffice getgovernmentOffice(){
    // if(governmentOffice==null){
    // governmentOffice= new GovernmentOffice();
    // }
    // return governmentOffice ;
    // }


    //synchronised code
    public static GovernmentOffice getgovernmentOffice() {

        if (governmentOffice == null) {

            synchronized (GovernmentOffice.class) {
                if (governmentOffice == null) {
                    governmentOffice = new GovernmentOffice();
                }
            }

        }
        return governmentOffice;
    }

}