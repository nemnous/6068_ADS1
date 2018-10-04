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
    public static int[] sort(final int[] array) {
        for(int i : array) {
            int min = i;
            for(int j : array) {
                if(min>j) {
                    min = j;
                    int t = i;
                    i = j;
                    j = t;
                }
            }
        }
        return array;
        }
}
