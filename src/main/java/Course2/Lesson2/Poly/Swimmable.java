package Course2.Lesson2.Poly;

public interface Swimmable {

    default void swim() {
        System.out.println("Плывет по умолчанию");
    }
}
