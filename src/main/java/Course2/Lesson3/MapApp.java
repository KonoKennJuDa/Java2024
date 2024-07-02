package Course2.Lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapApp {

    public static void main(String[] args) {

        // equals
        // hashCode

        Map<String, Integer> map = new HashMap<>(); // entry<key,value>. LoadFactor 0.75 Когда map будет заполненная на 75%, произойдет перехеширование и она увеличиться в два раза
        // map<Double, Double> - любой объектный тип может быть
        map.put("key", 100); // кладем в hashMap объект с ключем и значением
        map.put("key", 200); // перезаписываем в hashMap объект с таким же ключем на новое значение
        map.get("key"); // вернет 100, если объекта нет, вернет null
        map.containsKey("key"); // поиск объекта с таким ключем
        map.remove("asd"); // удаление объекта с таким ключем
        map.size(); // размер мар
        map.getOrDefault("Key123", 10); // вернет объект, но// если такого объекта нет, то вернет дефолт
        map.isEmpty(); // проверяет на пустоту, если пустая, то true
        map.replace("Key", 3000); // почти тоже самое, что и map.put
        map.values(); // список всех значений. Collection, значения не уникальные
        map.keySet(); // список уникальных значений. Set

        Set<Integer> set = new HashSet<>();






    }
}
