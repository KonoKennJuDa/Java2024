package Course2.Lesson5;

public class WaitNotifyApp {

    Object lock = new Object();

    private String currentLatter = "A";

    public static void main(String[] args) {

        //ABABABABABABA...
        WaitNotifyApp app = new WaitNotifyApp();
        Thread t1 = new Thread(() -> {
            app.printA();
        });

        Thread t2 = new Thread(() -> {
            app.printB();
        });

        t1.start();
        t2.start();

    }

    public void printA() {
        synchronized (lock) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (!currentLatter.equals("A")) {
                        lock.wait();
                    }
                    System.out.print("A");
                    currentLatter = "B";
                    lock.notifyAll();
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (lock) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (!currentLatter.equals("B")) {
                        lock.wait();
                    }
                    System.out.print("B");
                    currentLatter = "A";
                    lock.notifyAll();
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}