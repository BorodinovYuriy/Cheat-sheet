package patterns.youtube_pattern.mediator;

public interface BankMediator {
    //метод создания счета
    void createAccount(BankUser user);
    //метод обращения за займом
    void applyForLoan(BankUser user);
}
