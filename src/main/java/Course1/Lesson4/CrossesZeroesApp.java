package Course1.Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CrossesZeroesApp {

    //Поле
    public static char[][] map;

    //Размер поля
    public static final int SIZE = 3;

    //Точек для победы
    public static final int DOTS_TO_WIN = 3;

    //Описание точек
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'x';
    public static final char DOT_O = 'O';

    //Сканер
    public static final Scanner SCANNER = new Scanner(System.in);

    //Рандом
    public static final Random RANDOM = new Random();

    /**
     * Проиниализировать поле.
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
            //Arrays.fill(map[i], DOT_EMPTY); - тоже самое, но проще писать
        }
    }

    /**
     * Вывод игрового поля на экран.
     */
    public static void printMap() {
        //Нумеруем верхний ряд
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Пишем строки мапы
        for (int i = 0; i < map.length; i++) {
            //Выводим номер строки
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Ход человека.
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCallValid(x, y));
        map[y][x] = DOT_X;
    }

    /**
     * Ход робота.
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCallValid(x, y));
        System.out.println("Робот делает ход в " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    /**
     * Проверка валидны ли значения поля.
     *
     * @param x координата x
     * @param y координата y
     * @return да/нет
     */
    public static boolean isCallValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;
    }

    /**
     * Проверка победы.
     *
     * @param symbol сивол для которого проверяем
     * @return true, если выиграл
     */
    public static boolean checkWin(char symbol) {
        //Строки
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) {
            return true;
        }
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) {
            return true;
        }
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        //Столбцы
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) {
            return true;
        }
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) {
            return true;
        }
        //Диагональ
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) {
            return true;
        }
        return false;
    }

    /**
     * Проверка что в поле не осталось ни одной свободной ячейки.
     *
     * @return true, если нет ни одной свободной.
     */
    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Побеждает человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Робот выиграл");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена");
    }
}
