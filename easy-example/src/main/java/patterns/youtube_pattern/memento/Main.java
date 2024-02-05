package patterns.youtube_pattern.memento;

/**
 * Паттерн Снимок: поведенческий паттерн проектирования позволяющий сохранить состояние объекта
 * и восстановить его в будущем, не раскрывая деталей реализации объекта.
 */
public class Main {

    public static void main(String[] args) {
        GameLevel gameLevel = new GameLevel();
        GameHistory gameHistory = new GameHistory();
        //играем первый уровень
        gameLevel.setLevelNumber(1);
        gameLevel.setScope(100);
        gameLevel.setCheckpoint("Level_1 Checkpoint_1");
        gameLevel.play();
        //сохра в хранилище
        gameHistory.add(gameLevel.save());

        //играем второй уровень
        gameLevel.setLevelNumber(2);
        gameLevel.setScope(200);
        gameLevel.setCheckpoint("Level_2 Checkpoint_1");
        gameLevel.play();
        //сохра в хранилище
        gameHistory.add(gameLevel.save());

        //загружаем состояние после первой сохры
        gameLevel.restore(gameHistory.get(0));
        System.out.println("Level: " + gameLevel.getLevelNumber());
    }
}
