package Course2.Lesson3;

import java.util.*;

public class TreeApp {

    // Comparable - сравнимый. Один объект сравнивается с другим. Interface. Умение объектов сравниваться
    // Comparator - сравнитель. Abstract. Берет два объекта и сравнивает их

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();

        TreeSet<User> set = new TreeSet<>();
        set.add(new User(10));
        set.add(new User(19));
        set.add(new User(6));

        System.out.println(set);

        TreeSet<String> strings = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int res = o1.length() - o2.length();
                if (res != 0) {
                    return res;
                }
                return o1.compareTo(o2);
            }
        });
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        strings.add("b");
        strings.add("bb");
        strings.add("bbb");

        System.out.println(strings);


        // тоже принимают Comparator
        /// Arrays.sort();
        /// Collections.sort();

    }
}
