import java.util.Scanner;

/**

 * Class for solution.

 */

public final class Solution {

    /**

     * Constructs the object.

     */

    private Solution() {



    }

    /**

     * main method to drive the program.

     * @param      args  The arguments

     */

    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        int testcases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < testcases; i++) {

            Steque<Integer> st = new Steque<Integer>();

            while (sc.hasNext()) {

                String tmp = sc.nextLine();

                if (tmp.equals("")) {

                    break;

                }

                String[] tokens = tmp.split(" ");

                switch (tokens[0]) {

                case "push":

                    st.push(Integer.parseInt(tokens[1]));

                    st.display();

                    break;

                case "pop":

                    st.pop();

                    st.display();

                    break;

                case "enqueue":

                    st.insertAtEnd(

                        Integer.parseInt(tokens[1]));

                    st.display();

                    break;

                default:

                    break;

                }

            }

            System.out.println();

        }

    }

}