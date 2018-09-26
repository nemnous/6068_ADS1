/**
 * author: @nemnous.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * Constructs the object.
	 */
	Solution() {
		/**
		 * does nothing.
		 */
	}
	/**
	 * the main function reading input.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
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