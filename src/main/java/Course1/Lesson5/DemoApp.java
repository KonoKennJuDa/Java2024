package Course1.Lesson5;

public class DemoApp {

    public static void main(String[] args) {
        Car car = new Car("Dodge", 2020);

        car.info();
        car.printModel();

        car.crash();
        car.info();

        String carModel = car.getModel();

        //Car.info(); - так нельзя, так как это метод объекта, а не шаблона. Т.е. он не static
        //car.year = -100;

        /* Car car2 = new Car();
        car2.model = "Ford";
        car2.year = 1998;
        car2.wheelsNumber = 6;

        System.out.println("Model = " + car2.model + " year = " + car2.year + " wasCrashed = " + car2.wasCrashed + " wheelsNumber = " + car2.wheelsNumber);


        int wheelsNumber = Car.wheelsNumber;

        Car[] cars = new Car[]{car, car2};
        */


        //stringpool. Место в хипе, куда отправляются стринговые переменные. Можно отправлять стринговые значения намеренно, лично

        String str = new String("newString");

        Robot[] robots = new Robot[10];
        for (int i = 0; i < robots.length; i++) {
            robots[i] = new Robot("Robot" + i, i + 10);
        }

        for (Robot robot : robots) {
            robot.info();
        }
    }
}
