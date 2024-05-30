package Course1.Lesson7;

import java.util.Arrays;
import java.util.Locale;

public class StringApp {

    public static void main(String[] args) {
        String str = "String";
        System.out.println(Arrays.toString(str.toCharArray()));

        String str2 = new String(str.toCharArray());
        System.out.println(str2);

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println(str.startsWith("S"));

        String stringUpper = "StRiNg";
        System.out.println(str.equals(stringUpper));
        System.out.println(str.equalsIgnoreCase(stringUpper));

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(1).append(" ").append(2);

        StringBuffer stringBuffer = new StringBuffer(str); //тоже самое, что и StringBuilder, но синхронизированный и рабоает в параллелях, многопотоках
        stringBuffer.append(1).append(" ").append(2);

        String newString = stringBuilder.toString();
        System.out.println(newString);
    }
}
