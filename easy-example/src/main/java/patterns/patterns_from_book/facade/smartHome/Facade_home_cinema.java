package patterns.patterns_from_book.facade.smartHome;

public class Facade_home_cinema {
    DVD dvd;
    Screen screen;
    Sound sound;
    Projector projector;

    public Facade_home_cinema(DVD dvd,
                              Screen screen,
                              Sound sound,
                              Projector projector) {
        this.dvd = dvd;
        this.screen = screen;
        this.sound = sound;
        this.projector = projector;
    }
    public void playFilm(String filmName){
        System.out.println("Load "+filmName+" on dvd\n");

        dvd.dvdOn();
        screen.screenOn();
        sound.soundOn();
        sound.setVolume(10);
        projector.projectorOn();
        dvd.play();

    }

}
