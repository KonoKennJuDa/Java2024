package Course2.Lesson2.Poly;

import Course2.Lesson2.News.NewsService;
import Course2.Lesson2.News.OracleNewsService;

public class TransportApp {

    public static void main(String[] args) {

        Transport[] transports = new Transport[]{new Cater(), new Ship(), new Bus()};
        for (Transport transport : transports) {
            transport.load();

            if (transport instanceof Swimmable) {
                System.out.println("Эта штука плавает");
                Swimmable swimmable = (Swimmable) transport; // type-cast. Приведение типов
                swimmable.swim();
                System.out.println();
            }

            if (transport instanceof Bus) {
                Bus bus = (Bus) transport; // (Bus) - это приведение типа. Приводим Transport к типу Bus
                System.out.println("Маршрут " + bus.getMarshrout());
                System.out.println();
            }

            NewsService newsService = new OracleNewsService();
            newsService.getNews();

        }
    }
}
