package patterns.youtube_pattern.state.hard;

public class Main {
    /**
     * Состояние - поведенческий,
     * позволяет объекту варьировать своё поведение при изменении
     * внутреннего состояния.
     * При этом создается впечатление,что поменялся класс объекта.
     */
    public static void main(String[] args) {
        State state = new ConcreteStateA();
        Context context = new Context(state);
        context.doAction();
        context.doAction();
    }
}
