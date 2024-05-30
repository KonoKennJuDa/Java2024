package Course1.Lesson6;

public class Cabrio extends Car {

    protected boolean hasHardTop;

    public Cabrio(String model, int year, boolean hasHardTop) {
        super(model, year);
        System.out.println("This is a Cabrio constructor");
        this.hasHardTop = hasHardTop;
    }

    public boolean isHasHardTop() {
        return hasHardTop;
    }

    public void setHasHardTop(boolean hasHardTop) {
        this.hasHardTop = hasHardTop;
    }

    @Override
    void printName() {
        System.out.println("This is a cabrio");
    }

    @Override
    public void printInventionDate() {
        System.out.println("1950");
    }
}
