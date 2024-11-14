package Course2.Lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableApp {

    public static void main(String[] args) {

        List<String> list = List.of("one", "two", "three");
        list = new ArrayList<>(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println();

        // remove if < 4    Неправильная реализация, в обход итератора
        //  for (String str : list) {
        //    if (str.length() < 4) {
        //        list.remove(str);
        //    }
        // }

        iterator = list.iterator();    // правильная реализация
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() < 4) {
                iterator.remove();
            }
        }
        System.out.println(list);
        System.out.println();

        list.add("aa");
        list.removeIf(str -> str.length() < 4);
        list.stream().filter(str -> str.length() > 4).map(str -> str.length()).forEach(str -> System.out.println(str));

    }
}
