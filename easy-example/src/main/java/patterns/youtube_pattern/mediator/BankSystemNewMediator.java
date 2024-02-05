package patterns.youtube_pattern.mediator;
//остановились тут!

public class BankSystemNewMediator implements BankMediator{
    @Override
    public void createAccount(BankUser user) {
        System.out.println(user.getUsername() + "-New логика для создания аккаунта");
    }

    @Override
    public void applyForLoan(BankUser user) {
        System.out.println(user.getUsername() + "-New логика для создания заявки на кредит");
    }
}
