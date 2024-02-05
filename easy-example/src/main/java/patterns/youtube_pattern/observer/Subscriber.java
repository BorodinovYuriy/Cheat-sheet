package patterns.youtube_pattern.observer;
//подписчик, вызывается при обновлении объекта за которым следим.
public interface Subscriber {
    public void showNotification(String text);
}