package Course2.Lesson8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class StreamsApp {

    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        //Stream<Integer> stream = list.stream(); stream одноразовый

        //list.forEach(i -> System.out.println(i));

        // stream ленивый, он не будет работать без терминального метода/опператора
        // chain of responsibility - цепочка ответственности, каждый метод передает значение по порядку

        String s = list.stream()
                .limit(50)
                //.peek(i -> System.out.println(i))
                .filter(integer -> integer % 2 == 1)
                .sorted() // сортировка. Тяжелый метод
                .distinct() // только уникальные эллементы. Тяжелый метод
                .map(integer -> integer * 1000)
                .map(integer -> String.valueOf(integer))
                .collect(Collectors.joining("<->"));

        System.out.println(s);

        Stream<String> stringStream = Stream.of("aaaa", "bbbb", "cccc", "aaa", "aaaa", "bbb");

        Map<String, Integer> map = stringStream
                .collect(Collectors.toMap(str -> str, str -> 1, (v1, v2) -> v1 + 1));
        System.out.println(map);

//        boolean isAll4 = stringStream
//                .filter(s -> s.length() == 4)
//                .map(s -> s.toUpperCase())
//                .allMatch(s -> s.length() == 4);
//        System.out.println(isAll4);

    }
}
