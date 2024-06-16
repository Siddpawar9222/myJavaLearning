package N_DesignPattern.BehaviourDP.ObserverDP;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel yc1 = new YoutubeChannel();
        yc1.subscribe(new Subscriber("John","doe@gmail.com")) ;
        yc1.subscribe(new Subscriber("Isa","isa@gmail.com")) ;
        yc1.subscribe(new Subscriber("Harsh","harsha@gmail.com")) ;
        yc1.notifyChanges("DP Video");

    }
}
/*
Obeserver DP :
Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
Subject - Object which notify the other 
Observer - Receive notification from subject
 */