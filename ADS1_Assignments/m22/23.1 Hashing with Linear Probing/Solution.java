import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		LinearProbingHashST<Character, Integer> LPHST= new LinearProbingHashST<Character, Integer>();
		Scanner scan = new Scanner(System.in);
		int testcases = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < testcases; i++) {
			String[] inp = scan.nextLine().split(" ");
			switch(inp[0]) {
				case "put":
					LPHST.put(inp[1].charAt(0),Integer.parseInt(inp[2]));
					break;
				case "get":
					System.out.println(LPHST.get(inp[1].charAt(0)));
					break;

				case "display":
					String str = "{";
					for (char s : LPHST.keys()) {
            			str += (s + ":" + LPHST.get(s) + ", ");
					}
					str = str.replaceAll(", $", "");
					System.out.println(str+"}");
					break;
				case "delete":
					LPHST.delete(inp[1].charAt(0));
					break;
				// case ""
			}
		}
	}
}