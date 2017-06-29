package sorting;

public class Insertion extends Sorting{

    public void sort(Comparable[] randoms) {

        for (int i = 0; i < length; i++){
            for (int j = i; j > 0 && randoms[j-1].compareTo(randoms[j]) > 0; j--)
                swap(randoms, j-1, j);
        }
    }
}
