package Course2.Lesson5;

public class DeadLockApp {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 locked lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread 1 locked lock2");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 locked lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("Thread 2 locked lock1");
                }
            }
        }).start();

    }
}
