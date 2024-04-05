package Course1.Lesson3;

public class LogicApp {
    public static void main(String[] args) {
        // или ||, | (если надо выполнить обе проверки, ставится одна |) (логическое сложение) (выполняется вторым)
        // 0 0 -> 0
        // 0 1 -> 1                        (достаточно одного соответствия условию)
        // 1 0 -> 1
        // 1 1 -> 1

        // и &&, &  (если надо выполнить обе проверки, ставится одна &) (логическое умножение) (выполняется первым)
        // 0 0 -> 0
        // 0 1 -> 0                        (оба выражения должны быть верны или не верны)
        // 1 0 -> 0
        // 1 1 -> 1

        // не !

        int a = 1;
        if (isPositive(a) && !isZero(a)) {
            System.out.println("Положителное и не 0");
        }

        if (!isPositive(a) || isZero(a)) {
            System.out.println("Чисто или не положительное или равно нулю");
        }

    }

    public static boolean isPositive(int val) {
        return val >= 0;
    }

    public static boolean isZero(int val) {
        return val == 0;
    }
}
