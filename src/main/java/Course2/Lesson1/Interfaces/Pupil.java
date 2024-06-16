package Course2.Lesson1.Interfaces;

public class Pupil implements Studyable {

    @Override
    public void study() {
        System.out.println("Ученик учится");
    }
}
