package patterns.youtube_pattern.observer;

public class YouTubeUser implements Subscriber{

    String userName;

    public YouTubeUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void showNotification(String text) {
        System.out.println(userName + " -Вышло новое видео: " + text);
    }
}
