// public class Percolation {
//    public Percolation(int n)                // create n-by-n grid, with all sites blocked
//    public    void open(int row, int col)    // open site (row, col) if it is not open already
//    public boolean isOpen(int row, int col)  // is site (row, col) open?
//    public boolean isFull(int row, int col)  // is site (row, col) full?
//    public     int numberOfOpenSites()       // number of open sites
//    public boolean percolates()              // does the system percolate?
// }

import java.util.Scanner;

class Percolation {

	private boolean[][] grid;
	private int size;
	private WeightedQuickUnionUF qUnion;
	private int vTop;
	private int vBottom;

	Percolation(int n) {
		grid = new boolean[n][n];
		qUnion = new WeightedQuickUnionUF((n * n) + 2);
		size = n;
		vTop = n * n;
		vBottom = n * n + 1;
	}

	public int myIndex(int row, int col) {
		return row * size + col;
	}

	public void open(int row, int col) {

		grid[row][col] = true;
		// bottom
		if (row + 1 < size && grid[row + 1][col]) {
			qUnion.union(myIndex(row + 1, col), myIndex(row, col));
		}
		// top
		if (row - 1 >= 0 && grid[row - 1][col]) {
			qUnion.union (myIndex(row - 1, col), myIndex(row, col));
		}
		// left
		if (col - 1 >= 0 && grid[row][col - 1]) {
			qUnion.union(myIndex(row, col - 1), myIndex(row, col));
		}
		// right
		if (col + 1 < size && grid[row][col + 1]) {
			qUnion.union(myIndex(row, col + 1), myIndex(row, col));
		}
		if (row == 0) {
			qUnion.union(vTop, myIndex(row, col));
		}
		if (row == size - 1) {
			qUnion.union(vBottom, myIndex(row, col));
		}
	}

	public boolean percolates() {
		return qUnion.connected(vTop, vBottom);
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// System.out.println(n);
		Percolation percObj = new Percolation(n);
		while (scan.hasNext()) {
			int a= scan.nextInt() - 1;
			int b = scan.nextInt() - 1;	
			// System.out.println("a = " + a + " b = " + b);
			percObj.open(a, b);
		}
		System.out.println(percObj.percolates());
	}
}