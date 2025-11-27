package pt.adrz.samples.concurrency;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelMergeSort extends RecursiveAction {

    private static final int THRESHOLD = 10_000;

    private final int[] array;
    private final int[] temp; // buffer
    private final int start;
    private final int end;

    public ParallelMergeSort(int[] array) {
        this.array = array;
        this.temp = new int[array.length];
        this.start = 0;
        this.end = array.length;
    }

    private ParallelMergeSort(int[] array, int[] temp, int start, int end) {
        this.temp = temp;
        this.array = array;
        this.start = start;
        this.end = end;
    }

    private boolean isSmallEnough() {
    	return end - start <= THRESHOLD;
    }

    private int splitInHalf() {
    	return start + (end - start) / 2;
    }

    @Override
    protected void compute() {

        if (this.isSmallEnough()) {
            Arrays.sort(array, start, end);
            return;
        }

        int mid = this.splitInHalf();

        ParallelMergeSort left = new ParallelMergeSort(array, temp, start, mid);
        ParallelMergeSort right = new ParallelMergeSort(array, temp, mid, end);

        // runs both in parallel
        invokeAll(left, right);

        // Merge the two sorted halves
        merge(start, mid, end);
    }

    private void merge(int start, int mid, int end) {

        System.arraycopy(array, start, temp, start, end - start);

        int i = start;      // pointer for left half (in temp)
        int j = mid;        // pointer for right half (in temp)
        int k = start;      // pointer for output (in array)

        while (i < mid && j < end) {
            array[k++] = temp[i] <= temp[j] ? temp[i++] : temp[j++];
        }
        while (i < mid) {
            array[k++] = temp[i++];
        }
        while (j < end) {
            array[k++] = temp[j++];
        }
    }

    public static void main(String[] args) {

        int[] data = new int[100_000_000];

        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }

        int[] copy = data.clone();

        // Sequential sort
        long start = System.currentTimeMillis();
        Arrays.sort(copy);
        System.out.println("Sequential sort: " + (System.currentTimeMillis() - start) + " ms");

        // Parallel sort
        start = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new ParallelMergeSort(data));
        pool.shutdown();
        System.out.println("Parallel sort:   " + (System.currentTimeMillis() - start) + " ms");

        System.out.println(Arrays.equals(data, copy));
    }
}
