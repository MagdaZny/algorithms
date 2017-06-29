package sorting;

public class Selection extends Sorting{

    public void sort(Comparable[] randoms) {

        for (int i = 0; i < length; i++){
            int minIndex = minInArray(randoms, i);
            swap(randoms, minIndex, i);
        }
    }

    static int minInArray(Comparable[] randoms, int i) {

        int minIndex = i;
        for (int j = i; j < length; j++)
            if (randoms[j].compareTo(randoms[minIndex]) < 0)
                minIndex = j;
        return minIndex;
    }
}
