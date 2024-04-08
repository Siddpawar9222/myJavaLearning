package N_DesignPattern.BehaviourDP.ObserverDP;

public interface Subject {
    void subscribe(Observer ob) ;
    void unsubscribe(Observer ob) ;
    void notifyChanges(String topic);
}
