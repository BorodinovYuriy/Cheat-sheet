package patterns.patterns_from_book.adapter;

public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
    turkey.gobble();
    }

    @Override
    public void fly() {
        //Индюшки летают на короткие расстояния поэтому,
        // для соответствия уткам - наша индюшка летит пять раз.
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }

    }
}
