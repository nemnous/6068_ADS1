import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner scan = new 	Scanner(System.in);
		PasswordCheck pcheck= new PasswordCheck();
		if(pcheck.isGood(scan.nextLine())){
			System.out.println("Good");
		}
		else
			System.out.println("Bad");
	}
}