package J_Multithreading.WaitNotifyNotifyAll;

//Interthread Commumication


class Restaurant {
    boolean foodReady = false;

    synchronized void waitForFood() throws InterruptedException {
        wait(); // Thread waits until food is ready
        System.out.println("Food is ready! Enjoy your meal!");
    }

    synchronized void notifyFoodReady() {
        notifyAll(); // Notifies all waiting threads that food is ready
        //try with notify 
    }
}

class Friend extends Thread {
    Restaurant restaurant;

    public Friend(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            restaurant.waitForFood();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        // Create multiple friends waiting for food
        for (int i = 0; i <= 3; i++) {
           //new Friend(restaurant).start();
           Friend f = new Friend(restaurant);
           f.start();
        }

        // Simulate food preparation
        try {
            Thread.sleep(7000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Notify that the food is ready
        restaurant.notifyFoodReady();
    }
}

/*
Imagine you're at a restaurant with a group of friends. You all decide to order food, but the kitchen can only handle one order at a time. Now, let's relate this to programming:

wait: In our scenario, wait is like when you and your friends are waiting for your food to be ready. You don't want to keep asking the waiter if the food is ready every second; instead, you patiently wait until the waiter notifies you that your food is ready.

In Java, when a thread calls wait on an object, it enters a waiting state until another thread calls notify or notifyAll on the same object. It's like pausing the thread's execution until a specific condition is met.

notify: Now, let's say your food is ready. The waiter comes to your table and notifies one person (let's say, you) that the food is ready. Now, you start eating, but your friends are still waiting.

Similarly, in Java, when a thread calls notify on an object, it wakes up one of the threads that are waiting on that object. It's like saying, "Hey, one of you can start working now because something important just happened!"

notifyAll: Sometimes, all the orders are ready at once, and the waiter wants to inform everyone. So, instead of notifying just one person, the waiter announces to everyone that their food is ready.

In Java, notifyAll is used to wake up all the threads that are waiting on an object. It's like broadcasting a message to everyone who is waiting, letting them know that something significant has occurred.

To use these methods in Java, you typically need to synchronize on an object's monitor. This ensures that only one thread at a time can access the object and helps avoid race conditions.


Restaurant class represents the place where friends are waiting for their food. The waitForFood method makes the threads wait until the food is ready, while the notifyFoodReady method notifies all waiting threads that the food is ready. The Friend class represents each friend who is waiting for their food. When you run the Main class, you'll see that all friends are notified when the food is ready, and they can enjoy their meal.
 */