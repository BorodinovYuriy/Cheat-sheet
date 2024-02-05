package lambda;

public class RunnableLambda {
    public static void main(String[] args) {
        Runnable wow = () -> System.out.println("wow");
        wow.run();
    }
}
