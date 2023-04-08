package task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 
Играем в Золушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.


Requirements:
1. Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
2. Считать 20 чисел с клавиатуры и добавить их в главный список.
3. Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
4. Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
5. Добавить в третий дополнительный список все остальные числа из главного.
6. Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
7. Программа должна вывести три дополнительных списка, используя метод printList.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        List<Integer> listThreeDiv = new ArrayList<>();
        List<Integer> listTwoDiv = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            list.add(sc.nextInt());
        }
        listThreeDiv = list.stream().filter(n -> n%3 == 0).collect(Collectors.toList());
        listTwoDiv = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        list2 = list.stream().filter(n -> n%3 != 0 && n%2 != 0).collect(Collectors.toList());
        System.out.println("Two");
        printList(listTwoDiv);
        System.out.println("Tree");
        printList(listThreeDiv);
        System.out.println("Ost");
        printList(list2);

    }

    public static void printList(List<Integer> list) {
        list.forEach(System.out::println);
    }
}
