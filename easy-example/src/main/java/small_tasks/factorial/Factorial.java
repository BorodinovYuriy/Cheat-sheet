package small_tasks.factorial;

import java.math.BigInteger;
/**https://habr.com/ru/articles/113128/____
Реализуйте метод, вычисляющий факториал заданного натурального числа.
        Факториал
        N вычисляется как 1⋅2⋅...⋅N.
        Поскольку это очень быстро растущая функция, то даже для небольших
        N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
 */
public class Factorial {

    public static BigInteger factorial(int value) {
            BigInteger ret = BigInteger.ONE;
            for (int i = 1; i <= value; ++i) ret = ret.multiply(BigInteger.valueOf(i));
            return ret;
    }

    public static BigInteger factorialRecursion(int value) {
        return  value == 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorialRecursion (value-1));
    }

    public static void main(String[] args) {

        System.out.println("factorial");

        long startTime = System.currentTimeMillis();
        System.out.println(factorial(500)+"  ");
        long endTime = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
//------------------------------------------------------------------------------------------------
        System.out.println("recursion factorial");

        long startTime2 = System.currentTimeMillis();
        System.out.println(factorialRecursion(500));
        long endTime2 = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime2-startTime2) + "ms");
    }
}
