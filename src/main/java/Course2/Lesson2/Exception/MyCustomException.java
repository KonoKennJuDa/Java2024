package Course2.Lesson2.Exception;

public class MyCustomException extends RuntimeException {

    public MyCustomException(int a) {
        super("Не умеем делить на " + a);
    }
}
