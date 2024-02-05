package patterns.youtube_pattern.observer;
//Издатель(за которым следят)
public interface Publisher {
    public void addSubscriber(Subscriber subscriber);//подписка
    public void removeSubscriber(Subscriber subscriber);//удаление
    public void notifySubscriber(String text);//информирование всех подписчиков
}
