package patterns.patterns_from_book.facade.smartHome;

public class Sound {
    int volume = 0;
    public void soundOn(){
        System.out.println("sound is on\n");
    }
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("setVolume on "+volume+"\n");
    }
}
