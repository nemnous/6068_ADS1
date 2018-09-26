import java.util.Scanner;
import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size1 = scan.nextInt();
		int size2 = scan.nextInt();
		String[] str;
		scan.nextLine();
		if (size1 != 0)
			str = (scan.nextLine() + "," + scan.nextLine()).split(",");
		else {
			scan.nextLine();
			str = scan.nextLine().split(",");
		}
		int[] Array = new int[size1 + size2];
		for(int i = 0; i < size1 + size2; i++) {
			Array[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(Array);
		String nani = Arrays.toString(Array).replaceAll("[^0-9,]", "");
		System.out.println(nani);
	}
}