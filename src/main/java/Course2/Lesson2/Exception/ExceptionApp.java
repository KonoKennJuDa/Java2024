package Course2.Lesson2.Exception;

public class ExceptionApp {
    // Throwable - мастер-интерфейс объединяющий все наши ошибки
    // Основных две причины: Ошибка на уровне JVM(Error). Ошибка на уровне кода (Exception)
    // Exception делится на RunTimeException(Не проверяемый) и CheckException(Input Output)(Проверяемый)
    // RunTimeException(Не проверяемый) - появляются в рантайме и мы их заметить пока не можем
    // CheckException(Input Output)(Проверяемый) - на этапе компиляции
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 2;
            System.out.println("a / b = " + (a / b));
            b = 0;
            System.out.println("a / b = " + div(a, b));

        } catch (ArithmeticException ae) {
            System.out.println("Поймал исключение");
            ae.printStackTrace(System.out);
        }
        System.out.println();

        //Открыли файл
        try {
            //Читаем
            System.out.println(divFirstAndSecond(args));
        } catch (ArithmeticException ae) {
            System.out.println("Попытались поделить на ноль");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Массив неподходящей длины");
        } catch (Exception ex) {
            System.out.println("Что-то другое" + ex.getMessage());
        } finally {
            //Закрыли файл
            System.out.println("Будет выполнено всегда");
        }
    }

    static int div(int a, int b) {
        return div2(a, b);
    }

    static int div2(int a, int b) {
        return a / b;
    }

    /**
     * Передали массив. Вернем результат деления первого на второй.
     * Не умеем делить на 10
     * @param array
     * @return
     */
    static int divFirstAndSecond(String[] array) throws MyCustomException {

        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        if (b == 10) {
            throw new MyCustomException(10);
        }
        return a / b;
    }
}
