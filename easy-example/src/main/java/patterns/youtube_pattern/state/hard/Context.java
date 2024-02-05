package patterns.youtube_pattern.state.hard;

/**
 * Именно этот объект будет менять и находиться в разном состоянии
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void doAction(){
        state.doAction(this);
        //или можно обновлять состояние из самого контекста реализовав метод замены состояний ифами...(муветон)
    }
}
