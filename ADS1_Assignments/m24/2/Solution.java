import java.util.Scanner;
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

final class Solution {

    public static void main(String[] args) {
        BinarySearchST<Double, Student> binST
            = new BinarySearchST<Double, Student>();

        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < testCases; i++) {
            String[] temp = scan.nextLine().split(",");
            final Double marks = Double.parseDouble(temp[2]);

Student stu = new Student(Integer.parseInt(temp[0]), temp[1], marks);

            binST.put(marks, stu);
        }

        int noQuery = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < noQuery; i++) {
            String[] str = scan.nextLine().split(" ");

            switch(str[0]) {
                case "BE":
                    Double t1 = Double.parseDouble(str[1]);
                    Double t2 = Double.parseDouble(str[2]);
                    for(Double d : binST.keys(t1, 100.0)) {
                        System.out.println(binST.get(d).getName());
                    }
                    for(Double d : binST.keys(0.0, t2)) {
                        System.out.println(binST.get(d).getName());
                    }
            }

        }

    }


}