package Course1.Lesson2;

public class PrintUtil {

    /**
     * @param str Строка для форматирования
     * @ Форматирует строку тремя * до и после
     */
    public static void printFormatted(String str) {
        System.out.printf("***%s***", str);
        System.out.println();
    }

    /**
     * @param str Строка для форматирования
     * @ Форматирует строку тремя * до и после
     */
    public static String getFormatted(String str) {
        return "***" + str + "***";
    }
}