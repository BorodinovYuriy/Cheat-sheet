package patterns.youtube_pattern.flyweight;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Паттерн: Легковес или приспособленец
 * призван облегчить код - использует разделение для эффективной поддержки множества мелких объектов
 * ==если, например создаётся много однотипных фигур, приспособленец не будет жрать память....
 */
public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        factory.getSymbol("J", "Arial")
                .drawSymbol(new PositionExternalContext(0,0));
        factory.getSymbol("a", "Arial")
                .drawSymbol(new PositionExternalContext(0,1));
        factory.getSymbol("v", "Arial")
                .drawSymbol(new PositionExternalContext(0,2));
        factory.getSymbol("a", "Arial")
                .drawSymbol(new PositionExternalContext(0,3));

        //или тоже самое но "вумно"
        String str = "Java";
        List<String> items = Arrays.asList(str.split("(?!^)"));

        AtomicInteger counter = new AtomicInteger();
        items.forEach(s -> factory.getSymbol(s, "Arial")
                .drawSymbol(new PositionExternalContext(0,counter.getAndAdd(1))));
    }
}













