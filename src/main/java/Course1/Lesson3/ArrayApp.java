package Course1.Lesson3;

import java.util.Arrays;

public class ArrayApp {

    public static int variable = 100;

    public static void main(String[] args) {
        int[] array = new int[5]; // new - всегда означает выделение памяти, без new массив не создать
        // int[] array2 = array; тут array2 ссылается на array
        // при создании массив заполняется дефолтными значениями переменной. int заполнится 0, boolean заполнится false, а String заполнится Null
        array[2] = 199;
        array[array.length - 1] = 100;

        for (int i = 0; i < array.length; i++) {
            array[i] = 100 + i * 100;
        }

        int[] arr = {1, 2, 3, 4, 5, 6};

        printArray(arr);
        printArray(array);

        String[] strings = new String[10];

        Arrays.fill(strings, "a");


        printArray(strings);
        System.out.println(Arrays.toString(strings)); // метод для вывода массива строк. Переводит массив в строку и выводит на экран

        boolean[] booleans = {};
        System.out.println(Arrays.toString(booleans));

        int integer = 100;
        integer = method1(integer);
        System.out.println("integer = " + integer);

        int[] integers = {1, 2, 3, 4, 5, 6};
        method2(integers);
        System.out.println(Arrays.toString(integers));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int method1(int a) {
        return variable + 10;
    }

    public static void method2(int[] a) {
        a[2] = 100500;
    }

    public static int getAvg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }


}
