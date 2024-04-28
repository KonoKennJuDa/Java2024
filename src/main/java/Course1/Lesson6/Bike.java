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
}
