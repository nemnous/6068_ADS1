/**
 * added just to git push.
 * @author nemnous
 */
import java.util.Scanner;
import java.util.Arrays;
class NoOfPairs {
	private static int[] Array;
	private int n;
	NoOfPairs(int[] Array) {
		this.Array = Array;
		n = Array.length;
	}
	int Pairnumber() {
		Arrays.sort(Array);
		int globalCount = 0;
		for (int i = 0; i < n - 1; i++) {
			if (Array[i] != Array[i + 1]) {
				int t = count(Array[i]);
				globalCount += (t * (t - 1)) / 2;
			}
		}
		int t = count(Array[n - 1]);
		globalCount += (t * (t - 1)) / 2;
		return globalCount;
	}
	int count(int a) {
		int c = 0;
		for (int i : Array) {
			if (a == i) {
				c++;
			}
		}
		return c;
	}
}
class Solution {
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] Array = new int[n];
		for (int i = 0; i < n; i++) {
			Array[i] = scan.nextInt();
		}
		NoOfPairs pairObj = new NoOfPairs(Array);
		System.out.println(pairObj.Pairnumber());
	}
}