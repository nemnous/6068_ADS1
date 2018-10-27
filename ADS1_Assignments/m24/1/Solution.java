/**
 * this problem uses Linear Probing hash Symbol.
 * table.
 * The time complexity of Linear Probing ST in worst case is:
 * for Search O(n)
 * for Insert O(n)
 * for Delete O(n).
 * The time complexity of Linear Probing ST in average case is:
 * the insertion deletion and search has 1. with Uniform hashing assumption.
 *
 */

import java.util.Scanner;

/**
 * Class for student.
 * this class  contains the student information.
 * Such as roll, name and marks.
 */
class Student {
    /**
     * variables name, roll, marks.
     */
    private String name;
    /**
     * roll number.
     */
    private int rollNumber;
    /**
     * marks.
     */
    private Double marks;

    /**
     * Constructs the object.
     *
     * @param      roll  The roll
     * @param      nme   The nme
     * @param      mrks  The mrks
     */
    Student(final int roll, final String nme, final Double mrks) {
        this.name = nme;
        this.rollNumber = roll;
        this.marks = mrks;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    String getName() {
        return this.name;
    }
    /**
     * Gets the marks.
     *
     * @return     The marks.
     */
    Double getMarks() {
        return this.marks;
    }
    /**
     * Gets the roll.
     *
     * @return     The roll.
     */
    int getRoll() {
        return this.rollNumber;
    }
}


/**
 * Class for solution.
 * this is the solution class.
 * handles the main function.
 */
final class Solution {

    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * unused constructor
         */
    }
    /**
     * this is main fucntion and this
     * handles the input from the cosole aned
     * displays the output to the console.
     * The time complexity of the main function is O(N).
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        LinearProbingHashST<Integer, Student> linearST
            = new LinearProbingHashST<Integer, Student>();

        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < testCases; i++) {
            String[] temp = scan.nextLine().split(",");
            final Double marks = Double.parseDouble(temp[2]);

Student stu = new Student(Integer.parseInt(temp[0]), temp[1], marks);

            linearST.put(Integer.parseInt(temp[0]), stu);

        }

        int noQuery = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < noQuery; i++) {
            String[] query = scan.nextLine().split(" ");
            int roll = Integer.parseInt(query[1]);
            if (!linearST.contains(roll)) {
                System.out.println("Student doesn't exists...");
                continue;
            }
            switch (query[2]) {
            case "1":
                System.out.println(linearST.get(roll).getName());
                break;
            case "2":
                System.out.println(linearST.get(roll).getMarks());
            default:
                break;
            }
        }
    }
}
