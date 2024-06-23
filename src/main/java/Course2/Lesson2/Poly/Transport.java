package Course2.Lesson2.Poly;

public abstract class Transport {

    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Посадка в транспорт.
     */
    abstract void load();
}
