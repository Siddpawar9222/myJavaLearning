package G_OOPS.Enum;

enum DayOfWeek {
    
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7) ;

    private String displayName;
    private int dayNumber;


    private DayOfWeek(String displayName, int dayNumber) {
        this.displayName = displayName;
        this.dayNumber = dayNumber;
    }      


    // Getters for displayName and dayNumber
    public String getDisplayName() {
        return displayName;
    }

    public int getDayNumber() {
        return dayNumber;
    }
    
    // Setters for displayName and dayNumber (Not reccommended)
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    
}

public class Basic2 {
    public static void main(String[] args) {
        DayOfWeek dow = DayOfWeek.FRIDAY;
        //DayOfWeek dow1 = new DayOfWeek() ;
        System.out.println(dow);
        System.out.println(dow.getDisplayName());  
        System.out.println(dow.getDayNumber());
    }
}
