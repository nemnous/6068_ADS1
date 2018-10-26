import java.util.Scanner;
/**
 * Class for solution.
 * this takes the input from the console.
 * And return the output.
 */
final class Solution {

    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * unused constructor.
         */
    }

    /**
     * this is the main function and the excecution starts here.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        LinearProbingHashST<Character, Integer> linearObj
            = new LinearProbingHashST<Character, Integer>();
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < testcases; i++) {
            String[] inp = scan.nextLine().split(" ");
            switch (inp[0]) {
            case "put":
                linearObj.put(inp[1].charAt(0), Integer.parseInt(inp[2]));
                break;

            case "get":
                System.out.println(linearObj.get(inp[1].charAt(0)));
                break;

            case "display":
                String str = "{";
                for (char s : linearObj.keys()) {
                    str += (s + ":" + linearObj.get(s) + ", ");
                }
                str = str.replaceAll(", $", "");
                System.out.println(str + "}");
                break;
            case "delete":
                linearObj.delete(inp[1].charAt(0));
                break;

            default:
                break;
            }
        }
    }
}
