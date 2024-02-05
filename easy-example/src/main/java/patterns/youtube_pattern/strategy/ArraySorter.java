package patterns.youtube_pattern.strategy;

public class ArraySorter {
    private SortingStrategy sortingStrategy;

    public ArraySorter(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
    public void sort(int[] array){
        sortingStrategy.sort(array);
    }
}
