import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for selection sort.
 */
final class SelectionSort {
    /**
     * Constructs the object.
     */
    private SelectionSort() {
        //unused.
    }
    /**
     * SORT THE ARRAY.
     * @param arr : array
     * @return sorted array
     */
    public static int[] sort(final int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first
            // element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // Unused
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        String[] str;
        scan.nextLine();
        if (size1 != 0) {
            str = (scan.nextLine() + "," + scan.nextLine()).split(",");
        } else {
            scan.nextLine();
            str = scan.nextLine().split(",");
        }
        int[] array = new int[size1 + size2];
        for (int i = 0; i < size1 + size2; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        array = SelectionSort.sort(array);

        String outStr = Arrays.toString(array).replaceAll("[^0-9,]", "");
        System.out.println(outStr);
    }
    // public static int[] sort(final int[] array) {
    //     for(int i : array) {
    //         int min = i;
    //         for(int j : array) {
    //             if(min>j) {
    //                 min = j;
    //                 int t = i;
    //                 i = j;
    //                 j = t;
    //             }
    //         }
    //     }
    //     return array;
    //     }

}
