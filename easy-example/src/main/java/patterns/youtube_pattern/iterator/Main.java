package patterns.youtube_pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Итератор - поведенческий, позволяет обходить сложную коллекцию,
 * без раскрытия внутренней реализации
 */
public class Main {
    public static void main(String[] args) {

//Обычный итератор
        List<String> myList = new ArrayList<>();
        myList.add("foo");
        myList.add("bar");
        myList.add("baz");

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("\n");

//---------AdultUserIterator------------
        List<User> myUsers = new ArrayList<>();
        myUsers.add(new User("Ivan",18));
        myUsers.add(new User("Denis",20));
        myUsers.add(new User("Oleg",19));

        Iterator<User> itUser = new AdultUserIterator(myUsers);
        while (itUser.hasNext()) {
            User u = itUser.next();
            System.out.println(u.getName());
        }
    }
}
