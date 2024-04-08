package J_Multithreading;

 class Game {
    private static volatile int counter = 0;

    private static class Player extends Thread {
        @Override
        public void run() {
            // Simulate some game events
            for (int i = 0; i < 100; i++) {
                // Update the counter
                synchronized (Game.class) {
                    counter++;
                }
                System.out.println("Player updated counter: " + counter);
            }
        }
    }

    public static void main(String[] args) {
        // Create multiple player threads
        Player player1 = new Player();
        Player player2 = new Player();

        player1.start();
        player2.start();
    }
}

/*
volatile keyword is used as a modifier for a variable declaration to indicate that a variable's value may be changed by multiple threads concurrently. When a variable is declared as volatile, it ensures that any read or write operation on that variable is directly performed on the main memory, rather than relying on thread-local caches or optimizations that might delay updates to the main memory. This helps to enforce a certain level of visibility and synchronization between threads
 */