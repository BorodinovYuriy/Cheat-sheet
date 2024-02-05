package patterns.youtube_pattern.state.simple;

public class ConcreteStateB  implements State{
    @Override
    public void doAction() {
        System.out.println("Выполнено действие в состоянии В");
    }
}
