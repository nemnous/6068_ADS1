import java.util.Scanner;




class Solution {
	
	public static void main(String[] args) {
		
		Stock[][] best5 = new Stock[6][5];
		Stock[][] worst5 = new Stock[6][5];
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
	    BinarySearchST<String, Double>[] bstEachHr = (BinarySearchST[])new Object[6];
	    // Stock[] 
	    Stock[][] StockArr = new Stock[N][6];
		MinPQ<Stock>[] minArray = (MinPQ[]) new Object[6];
		MaxPQ<Stock>[] maxArray = (MaxPQ[]) new Object[6];
		for(int i = 0; i <6; i++) {
			for(int j = 0; j < N; j++) {
				String[] inp = scan.nextLine().split(",");
				Stock stk = new Stock(inp[0], Double.parseDouble(inp[1]));
				StockArr[i][j] = stk;
				minArray[i].insert(stk);
				maxArray[i].insert(stk);
			}
		}
	for(int i = 0; i < 6; i++) {
		for(int j= 0; j < 5; j++) {
			// best5[i][j] = minArray[i].delMax();
			// worst5[i][j] = maxArray[i].delMin();
		}
	}

	}
	// int getIndex(Stock obj) {
	// 	// for(int i = 0; i < )
	// }
	// int getBestFreq(Stock obj) {
	// 	for(int i = 0; i < 6; i++) {
	// 		for(int j= 0; j < 5; j++) {
	// 			// if(obj.StockName.equals())

	// 		}
	// 	}
	// }
}
