package Course2.Lesson4;

import java.util.*;

public class CompareApp {

    public static void main(String[] args) {

        Set<User> set = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getId() - o2.getId();
            }
        });
        for (int i = 0; i < 10; i++) {
            set.add(new User(i));
        }
        System.out.println(set);

        List<String> list = new ArrayList<>();
        list.add("asd");
        list.add("asdd");
        list.add("asdasdasdasdas");
        list.add("asdasddsd");

        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(list);

    }
}
