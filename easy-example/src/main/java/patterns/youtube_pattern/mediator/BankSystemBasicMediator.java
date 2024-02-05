package patterns.youtube_pattern.mediator;
//остановились тут!

public class BankSystemBasicMediator implements BankMediator{
    @Override
    public void createAccount(BankUser user) {
        System.out.println(user.getUsername() + "-логика для создания аккаунта");
    }

    @Override
    public void applyForLoan(BankUser user) {
        System.out.println(user.getUsername() + "-логика для создания заявки на кредит");
    }
}
