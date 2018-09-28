import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Stack<Character> stk = new Stack<Character>();
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			// scan.nextLine();
			while(n-- > 0) {
				boolean check = true;
				String str = scan.nextLine();
				// System.out.println(str);
				int len = str.length();
				char[] charA= str.toCharArray();
				// for(Character i : charA) {
				// 	System.out.print(i + " ");
				// }
				for(int i = 0; i < len; i++) {
					if(charA[i] == '[' || charA[i] == '(' ||charA[i] == '[')
						stk.push(charA[i]);
					// stk.print();
					if(charA[i] == ']' || charA[i] == ')' || charA[i] == '}') {
						if(!stk.isEmpty() && stk.pop() != charA[i]) {
							check = false;
							break;
						}
					}
				}
				String out;
				if(check) out = "YES";
				else out = "NO";
				System.out.println(out);
			}
	}
}