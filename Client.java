package sorting;

import edu.princeton.cs.algs4.StdRandom;


public class Client {

    public static void main(String[] args) {

        Sorting sorting = new Insertion();

        int length = Integer.parseInt(args[0]);
        Comparable[] randoms = new Comparable[length];

        for(int i = 0; i < length; i++)
            randoms[i] = StdRandom.uniform();
        sorting.sort(randoms);

        for (int i = 0; i < length; i++)
            System.out.println(randoms[i]);
    }
}
