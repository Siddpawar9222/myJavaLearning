package N_DesignPattern.BehaviourDP.ObserverDP;


import java.util.HashSet;
import java.util.Set;

public class YoutubeChannel implements Subject  {

    private Set<Observer> subscribers ;

    public YoutubeChannel(){
        this.subscribers=new HashSet<>();
    }

    @Override
    public void subscribe(Observer ob) {
       this.subscribers.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void notifyChanges(String topic) {
        for (Observer subscriber : this.subscribers) {
            subscriber.notified(topic);
        }
    }
    
}
