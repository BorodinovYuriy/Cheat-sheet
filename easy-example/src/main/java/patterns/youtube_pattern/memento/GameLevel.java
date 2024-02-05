package patterns.youtube_pattern.memento;

public class GameLevel {
    private  int levelNumber;
    private  int scope;
    private  String checkpoint;

    //свои методы:
    public GameLevelMemento save(){
        return new GameLevelMemento(levelNumber, scope, checkpoint);
    }
    //восстановление прошлого состояния
    public void restore(GameLevelMemento gameLevelMemento){
        levelNumber = gameLevelMemento.levelNumber();
        scope = gameLevelMemento.scope();
        checkpoint = gameLevelMemento.checkpoint();
    }
    //----------
    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public String getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
    }

    public void play() {
        //Игровая логика
    }
}
