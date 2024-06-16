package Course2.Lesson1.Interfaces;

public interface HardWorkable extends Workable {

    void workHard();

    default void workVeryHard() {
        workHard();
    }
}
