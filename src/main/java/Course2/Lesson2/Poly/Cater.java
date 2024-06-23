package Course2.Lesson2.Poly;

public class Cater extends Transport implements Swimmable {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    void load() {
        System.out.println("Диско-шар и алкоголь");
    }
}
