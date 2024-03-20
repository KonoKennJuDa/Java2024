package Course1.Lesson2;

import java.sql.SQLOutput;

public class CycleApp {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 6) {
                break;
            }
            PrintUtil.printFormatted("string " + i);
        }
        System.out.println();

        System.out.println(getDivideByThree());

        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        /*for (;;) {
                        Это бесконечный цикл, включать его не надо
        }*/

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i=" + i + " j=" + j);
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i=" + i + " j=" + j);

            }

        }
    }

    public static int getDivideByThree() {
        for (int i = 2; i < 10; i = i + 2) {
            if (i % 3 == 0) {
                return i;
            }
        }
        return 0;
    }
}