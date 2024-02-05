package patterns.patterns_from_book.facade.smartHome;

public class Main_test_facade {
    public static void main(String[] args) {

        //Запуск классов можно отдельно вынести или придумать чего....
        DVD dvd = new DVD();
        Screen screen = new Screen();
        Sound sound = new Sound();
        Projector projector = new Projector();

        Facade_home_cinema homeCinemaLoadFilm= new Facade_home_cinema(dvd,screen,sound,projector);

        homeCinemaLoadFilm.playFilm("Унесенные ветром");
    }
}
