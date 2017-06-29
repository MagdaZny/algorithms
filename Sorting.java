package sorting;

public abstract class Sorting {

    protected static int length;

    protected void sort(Comparable[] array){};

    protected static void swap(Comparable[] randoms, int i, int j) {
        Comparable randomAtI = randoms[i];
        randoms[i] = randoms[j];
        randoms[j] = randomAtI;
    }
}
