package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Это тест лямбда выражений!!!!
 *
 */


/*

Java7
button.addActionListener(new ActionListener()){
    @Override
public void actionPerformed(ActionEvent e){
        doSomething(e);
        }
});

Java8
button.addActionListener(e -> doSomething(e));
-------------

*/

/*
Общий синтаксис:
()->{}

Варианты:
() -> 42   такая лямбда ничего не принимая возвращает 42

x -> {return x;}

x -> ++x   _принимая х, возвращает++

(Cat cat, String name, int age) -> {
    cat.setName(name);
    cat.setAge(age);
}


 */

public class Main_L_test {

    public static void main(String[] args) {

        //Сортировка массивов обычным методом:
        String[] array1 = {"мама", "мыла", "раму","папу","шляпу"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);
//компаратор - по размеру массивов...
        Comparator<String[]> sortByLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        };
//компаратор - по количеству букв в массиве...
        Comparator<String[]> sortByWordsLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int length1 = 0;
                int length2 = 0;
                for (String s : o1) {
                    length1 += s.length();
                }
                for (String s : o2) {
                    length2 += s.length();
                }
                return length1 - length2;
            }
        };
        arrays.sort(sortByLength);

        System.out.println(Arrays.toString(arrays.get(0)));
        System.out.println(Arrays.toString(arrays.get(1)));
        System.out.println(Arrays.toString(arrays.get(2)));

        arrays.sort(sortByWordsLength);
        System.out.println();

        System.out.println(Arrays.toString(arrays.get(0)));
        System.out.println(Arrays.toString(arrays.get(1)));
        System.out.println(Arrays.toString(arrays.get(2)));
/*Задача 1. Переписать этот пример так, чтобы он сортировал массивы не по возрастанию
 количества слов в массиве, а по убыванию...*/

        //Лямбды:

        arrays.sort((o1, o2) -> o2.length - o1.length);

        System.out.println();

        System.out.println(Arrays.toString(arrays.get(0)));
        System.out.println(Arrays.toString(arrays.get(1)));
        System.out.println(Arrays.toString(arrays.get(2)));


    }


}
