package Course1.Lesson6;

public class App {
    public static void main(String[] args) {
        Transport t1 = new Car("KIA", 2010);
        Transport t2 = new Cabrio("Chrysler", 1998, true);
        Transport t3 = new Bike(2);
        Transport t4 = new Van("Ford", 2020, 8);

        Transport[] transports = {t1, t2, t3, t4};

        for (Transport transport : transports) {
            transport.printInventionDate();
        }
    }
}
