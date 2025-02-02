package Course2.Lesson8;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("str");

        //String fromOptional = optional.orElse("EmptyString");

        optional.map(s -> s.toUpperCase());
    }
}
