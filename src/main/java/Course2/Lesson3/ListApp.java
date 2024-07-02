package Course2.Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ListApp {

    public static void main(String[] args) {

        int[] array = new int[10];
        // Создать массив с элементами меньше пяти
        List<Integer> list = new ArrayList<>();
        //List<Integer> list = new LinkedList<>(); связанный список, код не ломается, но под капотом меняется

        list.add(0, 10);// Добавляет 10 на 0 позицию, если индекс не указан, то добавляется в конец листа
        list.add(10);
        list.remove(0); // Удаляет элемент с 0 позиции
        list.get(1); // Получить/взять элемент в позиции 1
        list.size(); // Возвращает количество элементов в нашем листе
        list.contains(10); // Проверяет имеется ли такой элемент в листе

        for (int x : array) {
            if (x < 5) {
                list.add(x);
            }
        }

        Object[] objects = list.toArray();

        Collections.sort(list);

    }
}
