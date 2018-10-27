import java.util.Scanner;
import java.util.*;

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

    public String toString() {
        return name + " " + rollNumber + " " + marks;
    }
}
/**
 * in this section I want to take marks as key
 * and Student array as an integer.
 * so that  students having same marks can be stored in an array.
 *
 */
final class Solution {
    /**
     * this is the maih function all the inputs are taken from the console.
     * and the output i sprinted.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        BinarySearchST<Double, Student[]> binST
            = new BinarySearchST<Double, Student[]>();

        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();
        scan.nextLine();
        Double[] stArr = new Double[testCases];
        int index = 0;

        for (int i = 0; i < testCases; i++) {
            String[] temp = scan.nextLine().split(",");
            final Double marks = Double.parseDouble(temp[2]);

            Student stu = new Student(Integer.parseInt(temp[0]), temp[1], marks);
            if (!binST.contains(marks)) {
                Student[] stuArr = new Student[2];
                stuArr[0] = stu;
                binST.put(marks, stuArr);
            } else {
                binST.get(marks)[1] = stu;
            }
        }


        int noQuery = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < noQuery; i++) {
            String[] str = scan.nextLine().split(" ");

            switch (str[0]) {
            case "BE":
                Double t1 = Double.parseDouble(str[1]);
                Double t2 = Double.parseDouble(str[2]);
                for (Double d : binST.keys(t1, t2)) {
                    System.out.println(binST.get(d)[0].getName());
                    if (binST.get(d)[1] != null)
                        System.out.println(binST.get(d)[1].getName());
                }
                break;
            case "LE":
                for (Double d : binST.keys(binST.min(), Double.parseDouble(str[1]))) {
                    // System.out.println(Arrays.toString(binSt.get(d));
                    System.out.println(binST.get(d)[0].getName());
                    if (binST.get(d)[1] != null)
                        System.out.println(binST.get(d)[1].getName());
                }
                break;

            case "GE":

                for (Double d : binST.keys(Double.parseDouble(str[1]), binST.max())) {
                    // System.out.println(Arrays.toString(binSt.get(d));
                    System.out.println(binST.get(d)[0].getName());
                    if (binST.get(d)[1] != null)
                        System.out.println(binST.get(d)[1].getName());
                }
                break;
            }

        }

    }


}