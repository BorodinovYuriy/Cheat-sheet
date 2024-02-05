package patterns.youtube_pattern.strategy;

public class Main {
    /**
     * Стратегия - поведенческий, определяет семейство алгоритмов,
     * инкапсулируя их все и позволяяподставлять один вместо другого.
     * Можно менять алгоритмы, независимо от клиента, который ими пользуется.
     */
    public static void main(String[] args) {
        int[] arr = {1,4,9,2,4,0};
        ArraySorter arraySorter = new ArraySorter(new BubbleSort());
        arraySorter.sort(arr);//сортировка пузырьком

        arraySorter.setSortingStrategy(new MargeSort());
        arraySorter.sort(arr);//сортировка слиянием
    }
}
