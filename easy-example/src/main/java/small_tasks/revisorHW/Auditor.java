package small_tasks.revisorHW;
/**Вам дан список ролей и сценарий пьесы в виде массива строчек.
        Каждая строчка сценария пьесы дана в следующем виде:
        Роль: текст
        Текст может содержать любые символы.
        Напишите метод, который будет группировать строчки по ролям,
        пронумеровывать их и возвращать результат в виде готового текста (см. пример).
        Каждая группа распечатывается в следующем виде:
        Роль:
        i) текст
        j) текст2
        ...
        ==перевод строки==
        i и j -- номера строк в сценарии.
        Индексация строчек начинается с единицы,
        выводить группы следует в соответствии с порядком ролей.
        Переводы строк между группами обязательны,
        переводы строк в конце текста не учитываются.
        Заметим, что вам предстоит обработка огромной пьесы
        в 50 000 строк для 10 ролей – соответственно,
        неправильная сборка результирующей строчки может выйти за ограничение по времени.*/
public class Auditor {
    private String printTextPerRole(String[] roles, String[] textLines) {
        return "";
    }

    public static void main(String[] args) {
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
    }
}
