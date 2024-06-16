package N_DesignPattern.BehaviourDP.ObserverDP;

public class Subscriber implements Observer {

    private String name;
    private String email;
    
    public Subscriber() {
    }

    public Subscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void notified(String topic) {
        System.out.println("New Video " + topic + " Uploaded..Check it out");
    }

}