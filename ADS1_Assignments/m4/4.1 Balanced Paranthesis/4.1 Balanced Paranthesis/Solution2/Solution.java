import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Stack<Character> stk = new Stack<Character>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		while (n-- > 0) {
			boolean check = true;
			String str = scan.nextLine();
			int len = str.length();
			char[] charA = str.toCharArray();
			for (Character i : charA) {
				if (i == '[' || i == '(' || i == '[') {
					stk.push(i);
					continue;
					}
				if (i == ']' || i == ')' || i == '}') {
					if (stk.isEmpty()) {
						check = false;
						break;
					} else if (stk.pop() != i) {
						check = false;
						break;
					}
				}
			}
			String out;
			if (check) out = "YES";
			else out = "NO";
			System.out.println(out);
		}
	}
}