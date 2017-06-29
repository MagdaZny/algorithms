package sorting;


public class Bubble extends Sorting {


    public void sort(Comparable[] randoms) {

        for (int i = 0; i < length; i++) {
            int maxIndex = i;
            for (int j = i; j < length; j++)
                if (randoms[j].compareTo(randoms[maxIndex]) < 0)
                    swap(randoms, j, maxIndex);
        }
    }


}
