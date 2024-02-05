package patterns.youtube_pattern.observer;

/**
 * Подписчик_Поведенческий паттерн, создает механизм подписи, позволяющий
 * одним объектам следить и реагировать на события в других объектах.
 */
public class Main {
    public static void main(String[] args) {
        YouTubeChanel youTubeChanel = new YouTubeChanel();

        YouTubeUser user_1 = new YouTubeUser("user_1");
        YouTubeUser user_2 = new YouTubeUser("user_2");
        YouTubeUser user_3 = new YouTubeUser("user_3");

        //подписываемся на канал
        youTubeChanel.addSubscriber(user_1);
        youTubeChanel.addSubscriber(user_2);
        youTubeChanel.addSubscriber(user_3);

        youTubeChanel.uploadVideo("Как реализовать паттерн наблюдатель?");

    }
}
