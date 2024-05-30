package Course1.Lesson6;

public abstract class Transport extends Invention {

    protected String color;

    void printName() {
        System.out.println("Transport");
    }

    public abstract void wroomWroom();

    /**
     @Override
     public void printInventionDate() {        это реализация конкретного Override метода, который пойдет дальше по ветке насследования и переопределять его не надо

     } **/

    // public abstract int getCapacity();
}
