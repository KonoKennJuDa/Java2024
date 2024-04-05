package Course1.Lesson3;

public class StringApp {
    public static void main(String[] args) {

        // stack - lifo - last in first out. Нужен для того, чтобы правильно раскручивать вызовы методов
        // sodd - stack over flow. Переполнение стека из-за неправильной рекурсии. Рекурсия это когда один метод вызывает другой или сам себя
        // primitive - все примитивные типы хранятся в стеке

        // heap - хранилище для ссылочных типов

        // garbage collector - mark and swipe. Работает в два прохожа. Сначала сверяет, маркерует используемые и во второй проход удаляет то, что не маркерованно

        String str = "new String";
        String str2 = new String("new string");

        str.equals(str2); // объекты всегда сравниваются через equals. Ссылки можно сравнивать двойным ровно ==


    }
}
