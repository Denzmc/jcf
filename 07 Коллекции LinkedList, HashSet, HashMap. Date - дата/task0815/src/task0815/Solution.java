package task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иван","Иванов");
        map.put("Роберт","Юмадилов");
        map.put("Денис","Зарипов");
        map.put("Сергей","Теменцев");
        map.put("Олег","Тюменцев");
        map.put("Иван","Козлов");
        map.put("Олег","Иванов");
        map.put("Иван","Петров");
        map.put("Петр","Иванов");
        map.put("Ольга","Клейн");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        return 0;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int sum = 1;
        for(String s: map.values()){
            sum = s.equals(lastName) ? ++sum : sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Map<String , String> map = createMap();
        System.out.println(map.size());
        System.out.println(getCountTheSameLastName(map, "Иванов"));
    }
}
