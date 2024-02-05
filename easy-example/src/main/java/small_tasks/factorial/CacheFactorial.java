package small_tasks.factorial;

import java.math.BigInteger;
import java.util.HashMap;
/**
 https://habr.com/ru/articles/113128/
 ____Обратите внимание, что до сих пор я не использовал тот факт,
что я постоянно высчитываю одни и те же промежуточные значения от 1 до n.
Если бы я кэшировал эти значения, конечно, вычисления могли бы быть гораздо быстрее.
Если мы уже однажды рассчитали какое-то значение,
то сохраним его для дальнейшего использования, например, в HashMap:*/
public class CacheFactorial {
    static HashMap<Integer, BigInteger> cache = new HashMap<Integer,BigInteger>();

    public static BigInteger factorial(int n){
        BigInteger ret;

        if (n == 0) return BigInteger.ONE;
        if (null != (ret = cache.get(n))) return ret;
        ret = BigInteger.valueOf(n).multiply(factorial(n-1));
        cache.put(n, ret);
        return ret;
    }
}
