package patterns.youtube_pattern.mediator;

public class BankUser {

    private String username;
    public BankMediator mediator;

    public BankUser(String username, BankMediator mediator) {
        this.username = username;
        this.mediator = mediator;
    }

    public String getUsername() {
        return username;
    }
    //метод создания счета(скопипастил из интерфейса)
    public void createAccount(){
        mediator.createAccount(this);
    }
    //метод обращения за займом(скопипастил из интерфейса)
    public void applyForLoan(){
        mediator.applyForLoan(this);
    }
}
