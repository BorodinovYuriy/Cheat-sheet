package patterns.youtube_pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class GameHistory {
    private final List<GameLevelMemento> mementos = new ArrayList<>();

    public void add(GameLevelMemento gameLevelMemento){
        mementos.add(gameLevelMemento);
    }
    public GameLevelMemento get(int index){
        return mementos.get(index);
    }
}
