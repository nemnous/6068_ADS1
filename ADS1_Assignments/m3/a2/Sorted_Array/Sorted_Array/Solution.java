import java.util.Scanner;
import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size1 = scan.nextInt();
		int size2 = scan.nextInt();
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		String str3 = str1 + "," + str2;	
		System.out.println(str3);	
		String[] str = str3.split(",");
		for(String i : str) {
			System.out.print(i + " ");
		}

		int[] Array = new int[size1 + size2];
		for(int i = 0; i < size1 + size2; i++) {
			Array[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(Array);
		System.out.println(Arrays.toString(Array));
	}
}