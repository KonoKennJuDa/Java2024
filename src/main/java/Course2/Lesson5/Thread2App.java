package Course2.Lesson5;

public class Thread2App {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000); // 1s
        new Thread(() -> {
            try {
                Thread.sleep(3000); // 3s
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        }).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000); //
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        });
        thread.setDaemon(true);
        thread.start();
    }
}
