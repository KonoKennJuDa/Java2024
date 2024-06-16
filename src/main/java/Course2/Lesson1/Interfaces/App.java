package Course2.Lesson1.Interfaces;

public class App {

    public static void main(String[] args) {

        Student student = new Student();
        Pupil pupil = new Pupil();


        //Workable[] workables = new Workable[] {student, pupil}; pupil не имеется интерфеса workable
        Studyable[] studyables = new Studyable[] {student, pupil};
        for (Studyable studyable : studyables) {
            studyable.study();
        }
    }
}
