package Course1.Lesson7;

public class GasStation {

    private int available;
    //private boolean isFull;

    public int getAvailable() {
        return available;
    }

    /**
     * Заправить указанное кол-во литров
     *
     * @param amount
     */
    public void refill(int amount) {
        this.available = this.available - amount;
    }

    public GasStation(int freeVolume) {
        this.available = freeVolume;
    }

    @Override
    public String toString() {
        return "GasStation(" + "available = " + available + ")";
    }

    public void info() {
        System.out.println(this);
    }

}
