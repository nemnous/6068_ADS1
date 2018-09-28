import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Stack<Character> stk = new Stack<Character>();
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			while(n-- > 0) {
				boolean check = true;
				String str = scan.nextLine();
				int len = str.length();
				char[] charA= str.toCharArray();
				for(int i = 0; i < len; i++) {
					if(charA[i] == '[' || charA[i] == '(' ||charA[i] == '[')
						stk.push(charA[i]);
					if(charA[i] == ']' || charA[i] == ')' || charA[i] == '}') {
						if(stk.pop() != charA[i]) {
							check = false;
							break;
						}
					}
				}
				System.out.println(check);
			}
	}
}