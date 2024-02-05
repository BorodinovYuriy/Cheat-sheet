package patterns.youtube_pattern.state.simple;

public class ConcreteStateA implements State{
    @Override
    public void doAction() {
        System.out.println("Выполнено действие в состоянии А");
    }
}
