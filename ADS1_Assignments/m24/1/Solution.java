import java.util.Scanner;
import java.util.*;
class Student {
	String name;
	int rollNumber;
	Double marks;

	Student(int rollNumber, String name, Double marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	} 
}



class Solution {
	public static void main(String[] args) {
		LinearProbingHashST<Integer, Student > linearST = new LinearProbingHashST<Integer, Student>();

		Scanner scan = new Scanner(System.in);

		int testCases = scan.nextInt();
		scan.nextLine();

		for(int i = 0; i < testCases; i++) {
			String[] temp = scan.nextLine().split(",");

			Student stu = new Student(Integer.parseInt(temp[0]), temp[1], Double.parseDouble(temp[2]));

			linearST.put(Integer.parseInt(temp[0]), stu);

		}

		int noQuery = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < noQuery; i++) {
			String[] query = scan.nextLine().split(" ");
			// System.out.println(Arrays.toString(query));
			switch(query[2]) {
				case "1":
					System.out.println(linearST.get(Integer.parseInt(query[1])).name);
					break;
				case "2":
					System.out.println(linearST.get(Integer.parseInt(query[1])).marks);

			}
		}
	}
}