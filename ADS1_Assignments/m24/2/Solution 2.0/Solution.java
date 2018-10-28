import java.util.Scanner;

class Student implements Comparable<Student> {
	int roll;
	String name;
	Double marks;
	Student(int roll, String name, Double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int compareTo(Student stu) {
		int result = this.marks.compareTo(stu.marks);
		if (result != 0)
			return result;
		return this.roll - stu.roll;
	}
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int stdCases = scan.nextInt();
		// System.out.println(stdCases);
		scan.nextLine();

		BinarySearchST<Student, Integer> bs = new BinarySearchST<Student, Integer>();


		for(int i = 0; i < stdCases; i++) {
			String[] str = scan.nextLine().split(",");
			Student stu = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			bs.put(stu, stu.roll);		
		}

		// for(Student i : bs.keys()) {
		// 	System.out.println(i.marks);
		// }


		int noQuery = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < noQuery; i++) {
            String[] str = scan.nextLine().split(" ");

            switch (str[0]) {
            case "BE":
                Double t1 = Double.parseDouble(str[1]);
                Double t2 = Double.parseDouble(str[2]);
                for (Student s : bs.keys()) {
                	if(s.marks >= t1 && s.marks <= t2)
                    System.out.println(s.name);
                }
                break;
            case "LE":
            	Double p = Double.parseDouble(str[1]);
                for (Student s : bs.keys()) {
                	if(s.marks <= p)
                    System.out.println(s.name);
                }
                break;

            case "GE":

            	Double t = Double.parseDouble(str[1]);
                for (Student s : bs.keys()) {
                	if(s.marks <= t)
                    System.out.println(s.name);
                }
                break;
            default:
                break;
            }

		}
	}
}