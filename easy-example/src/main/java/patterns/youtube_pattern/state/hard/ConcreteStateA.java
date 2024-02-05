package patterns.youtube_pattern.state.hard;

public class ConcreteStateA implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Выполнено действие в состоянии А");
        context.setState(new ConcreteStateB());
    }
}
