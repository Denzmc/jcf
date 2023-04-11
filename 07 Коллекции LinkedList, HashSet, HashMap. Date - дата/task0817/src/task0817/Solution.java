package task0817;

import java.util.*;
import java.util.stream.Collectors;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов","Иван");
        map.put("Юмадилов","Роберт");
        map.put("Зарипов","Денис");
        map.put("Теменцев","Сергей");
        map.put("Олегин","Олег");
        map.put("Козлов","Иван");
        map.put("Олегов","Олег");
        map.put("Иванчук","Петр");
        map.put("Хаям","Петр");
        map.put("Клейн","Иван");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        Set<String> set = new HashSet<>();

        Set<String> set2 =  map.values().stream().filter(e -> !set.add(e)).collect(Collectors.toSet());

        for (String s : set2) {
            removeItemFromMapByValue(map, s);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String > map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}
