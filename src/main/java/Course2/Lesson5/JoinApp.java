package Course2.Lesson5;

public class JoinApp {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        });


        thread.setPriority(Thread.MAX_PRIORITY); // Можно давать потоку приоритет, но операционным системам на это плевать, из-за этого не используется

        thread.start();
        thread.join(); // Ожидает пока потом заверщит свою работу
        System.out.println("End");
    }
}
