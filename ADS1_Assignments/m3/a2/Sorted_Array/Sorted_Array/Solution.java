import java.util.Scanner;
import java.util.Arrays;
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
        array = sort(array);

    String nani = Arrays.toString(array).replaceAll("[^0-9,]", "");
        System.out.println(nani);
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
    static int[] sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        }
        return arr;
    }
}
