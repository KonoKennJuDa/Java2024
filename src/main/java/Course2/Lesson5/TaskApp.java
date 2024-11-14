package Course2.Lesson5;

public class TaskApp {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new MyThread();
        thread1.start();
        thread2.start();
        System.out.println("Я все запустил и уже закончил. Жду пока закончат остальные");
        // thread1.start(); - перезапускать поток повторно нелья. поток одноразовый. нужен еще поток - создавай поток

        //3) Анонимный класс
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i < 15; i++) {
                    System.out.println("Threat out: " + i);
                }
            }
        });
        thread3.start();

        //4) lambda
        Thread thread4 = new Thread(() -> {
            for (int i = 20; i < 25; i++) {
                System.out.println("Threat out: " + i);
            }
        });
        thread4.start();
    }

    //1) Runnable
    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Threat out: " + i);
            }
        }
    }

    //2) Наследование от Thread
    public static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 5; i < 10; i++) {
                System.out.println("Threat out: " + i);
            }
        }
    }


}
