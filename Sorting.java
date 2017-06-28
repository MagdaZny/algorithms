package sorting;

import edu.princeton.cs.algs4.StdRandom;

public class Sorting {

    private static int length;

    public static void main(String[] args) {

        length = Integer.parseInt(args[0]);
        Comparable[] randoms = new Comparable[length];

        for(int i = 0; i < length; i++)
            randoms[i] = StdRandom.uniform();
        bubbleSort(randoms);

        for (int i = 0; i < length; i++)
            System.out.println(randoms[i]);
    }

    private static void bubbleSort(Comparable[] randoms) {

        for (int i = 0; i < length; i++) {
            int maxIndex = i;
            for (int j = i; j < length; j++)
                if (randoms[j].compareTo(randoms[maxIndex]) < 0)
                    swap(randoms, j, maxIndex);
        }
    }

    private static void selectionSort(Comparable[] randoms) {

        for (int i = 0; i < length; i++){
            int minIndex = minInArray(randoms, i);
            swap(randoms, minIndex, i);
        }
    }

    private static int minInArray(Comparable[] randoms, int i) {

        int minIndex = i;
        for (int j = i; j < length; j++)
            if (randoms[j].compareTo(randoms[minIndex]) < 0)
                minIndex = j;
        return minIndex;
    }

    private static void insertionSort(Comparable[] randoms) {

        for (int i = 0; i < length; i++){
            for (int j = i; j > 0 && randoms[j-1].compareTo(randoms[j]) > 0; j--)
                swap(randoms, j-1, j);
        }
    }

    private static void swap(Comparable[] randoms, int i, int j) {
        Comparable randomAtI = randoms[i];
        randoms[i] = randoms[j];
        randoms[j] = randomAtI;
    }





}
