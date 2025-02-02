package Course2.Lesson8;

import java.util.stream.IntStream;

public class IntStreamApp {

    public static void main(String[] args) {
        // Примитивный стрим

        IntStream.iterate(0, i -> i + 3)
                .limit(10);

    }
}
