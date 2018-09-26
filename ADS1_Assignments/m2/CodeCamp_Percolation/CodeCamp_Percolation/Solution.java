/**
 * author: @nemnous.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * does nothing.
         */
    }
    /**
     * the main function reading input.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // System.out.println(n);
        Percolation percObj = new Percolation(n);
        while (scan.hasNext()) {
            percObj.open(scan.nextInt() - 1, scan.nextInt() - 1);
        }
        System.out.println(percObj.percolates());
    }
}
