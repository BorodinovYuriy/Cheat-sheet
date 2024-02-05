package patterns.youtube_pattern.flyweight;

public final class ConcreteFlyweight implements SymbolFlyweight{
    private final String symbol;
    private final String symbolStile;

    public ConcreteFlyweight(String symbol, String symbolStile) {
        this.symbol = symbol;
        this.symbolStile = symbolStile;
    }

    @Override
    public void drawSymbol(PositionExternalContext position) {
        System.out.println("Отображаем символ" + symbol
        + "в стиле: " + symbolStile
        + "в координатах: х и у, как " + position.getX() + " " + position.getY());

    }
}
