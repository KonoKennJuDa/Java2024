package Course1.Lesson2;

public class MethodApp {

    public static final String TEMPLATE = "int = %d string = %s\n";

    public static void main(String[] args) {

        int v1 = multiplication(4, 10);
        int v2 = multiplication(5, 6.0);


        PrintUtil.printFormatted("v1 = " + v1 + "v2 = " + v2 + "v3 + " + multiplication(v1, v2));

        PrintUtil.printFormatted("string to format");

        System.out.printf(TEMPLATE, 10, "str");
        System.out.println();
        System.out.printf(TEMPLATE, 113, "st12313r");

        // TEMPLATE = "abc"; Нельзя поменять TEMPLATE, так как он final/константа
    }


    public static int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public static int multiplication(int n1, double n2) {
        return (int) (n1 * n2);
    }


    //int tp = 100; // tp - непонятное имя
    //int totalPrice = 100; // totalPrice - понятное имя

    //Модификатор доступа + тип значения + имя + набор параметров

    //CamelCase - Как горб верблюда, каждое слово с большой буквы
    //Naming - ClassName MyClassName. Класс всегда пишется с большой буквы и каждое слово с большой буквы
    //Methods, variables - loaerCase UperCase methodName variableName. Методы и переменные пишутся с маленькой буквы

    //SNAKE_CASE - Через консольный пробел
    //CONSTANTS - Создается один раз на уровне одного класса и никогда не меняются. Пишутся в UPPER_CASE. Нельзя менять во время исполнения

    //Type - void/real type

    //Public, Protected, (No modifier) Default, Private - Модификаторы доступа


}