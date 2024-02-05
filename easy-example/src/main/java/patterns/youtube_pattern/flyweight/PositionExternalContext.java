package patterns.youtube_pattern.flyweight;

public class PositionExternalContext {
    private int x,y;

    public PositionExternalContext(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
