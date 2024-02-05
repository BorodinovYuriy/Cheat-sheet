package small_tasks.symbol;
        /**Напишите функцию, которая будет возвращать количество различных буквенных символов и цифр,
        не зависящих от регистра, которые встречаются во входной строке более одного раза.
        Можно предположить, что входная строка содержит только буквы (как прописные,
        так и строчные) и числовые цифры.*/
public class Stroke {

public static void methodStr(String text) {
        text = text.toLowerCase();
        int tmpCount = 0;
        String tempChar;
        while (text.length() != 0) {
              tempChar = text.substring(0,1);
                if (text.contains(tempChar)) tmpCount ++;
                text = text.replace(tempChar, "");
                System.out.println(tempChar+" - "+tmpCount);
        }
}

                public static void main(String[] args) {
                        methodStr("fghdfghjfdkHJKHKJ");
                }

}





