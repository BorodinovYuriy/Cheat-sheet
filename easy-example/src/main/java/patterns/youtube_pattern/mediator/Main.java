package patterns.youtube_pattern.mediator;

/**
 * Посредник - позволяет уменьшить связанность множества классов между собой,
 * благодаря перемещению этих связей в один класс.
 */
public class Main {
    public static void main(String[] args) {
        //создаем посредника
        BankSystemBasicMediator mediator = new BankSystemBasicMediator();
        BankSystemNewMediator newMediator = new BankSystemNewMediator();

        BankUser bankUser1 = new BankUser("user1",mediator);
        BankUser bankUser2 = new BankUser("user2",mediator);
        BankUser bankUser3 = new BankUser("user3",newMediator);

        bankUser1.createAccount();
        bankUser1.applyForLoan();

        bankUser2.createAccount();
        bankUser2.applyForLoan();

        bankUser3.createAccount();
        bankUser3.applyForLoan();
    }
}
