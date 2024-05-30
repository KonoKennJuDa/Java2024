package Course1.Lesson6;

public class Bike extends Transport {

    int wheelsNumber;

    public Bike(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public void wroomWroom() {
        System.out.println("Bzzzzrr");
    }

    @Override
    public void printInventionDate() {
        //любая другая логика
        System.out.println("2019");
    }

    public final boolean requireHelmet() { // final - запрещает наследовать метод на уровне класса
        return true;
    }

    /** @Override
    public int getCapacity() {
        return 0;
    } **/
}
