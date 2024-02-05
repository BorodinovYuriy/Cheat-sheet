package small_tasks.marge_sorted_arrays;

import java.util.Arrays;

/**Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив.
        Массивы могут быть любой длины, в том числе нулевой.
        Предполагается, что вы реализуете алгоритм слияния,
        имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив.
        Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
        Пример
        Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}*/

//public static int[] mergeArrays(int[] a1, int[] a2) {
//        int[] result = Arrays.copyOf(a1, a1.length + a2.length);
//        System.arraycopy(a2, 0, result, a1.length, a2.length);
// ...сортируем...
//        return result;
//        } ---пример для себя

public class Merge_n_sort_arrays {
    //массивы должны быть уже отсортированными!
    public static int[] mergeArrays(int[] a, int[] b) {
        if(a.length == 0) return b;
        if(b.length == 0) return a;

        int[] result = new int[a.length + b.length];
        int a1 = 0, b1 = 0, i = 0;

            while (a1 < a.length && b1 < b.length) {
                if (a[a1] <= b[b1]) {
                    result[i] = a[a1++];
                }else{
                    result[i] = b[b1++];
                }
                i++;
            }
            while (a1 < a.length){
                result[i++] = a[a1++];
            }
            while (b1 < b.length){
                result[i++] = b[b1++];
            }

        return result;
    }

    public static int[] mergeArraysSUPER(int[] a, int[] b) {
        int aLength = a.length, bLength = b.length;
        int aCount = 0, bCount = 0;
        int[] array = new int[aLength + bLength];

        while (aCount < aLength || bCount < bLength)
            array[aCount + bCount] = (aCount < aLength && (bCount == bLength || a[aCount] < b[bCount])) ? a[aCount++] : b[bCount++];
        return array;
    }
    public static void main(String[] args) {
        int[] a = {0,2,4,6,8,9,50,50,50,50};
        int[] b = {1,3,5,6,6,7,8,8,10};
        System.out.println(Arrays.toString((mergeArraysSUPER(a, b))));

    }













}
