package patterns.youtube_pattern.state.hard;

public class ConcreteStateB  implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Выполнено действие в состоянии В");
        context.setState(new ConcreteStateA());
    }
}
