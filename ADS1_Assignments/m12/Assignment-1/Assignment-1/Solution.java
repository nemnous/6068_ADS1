import java.util.*;
import java.text.*;
// implements Comparable<Student>
class Student {
	String name, res;
	Date dob;

	int s1, s2, s3,total;
	Student(String name, String dobStr, int s1, int s2, int s3, int total, String res) {
		this.name = name;
		// this.dob = dob;
		this.res = res;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.total = total;
		String dateInString = dobStr;
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	try {
	    Date date = formatter.parse(dateInString);
	    // System.out.println(date);
	    this.dob = date;
	    // System.out.println(formatter.format(date));
	} catch (ParseException e) {
	    //handle exception if date is not in "dd-MMM-yyyy" format
	}
	}
	public String toString() {
		return this.name +"," + this.total + "," + this.res;
	}
}
class SortbyMerit implements Comparator<Student> 
{ 
    // Used for sorting in ascending order
    public int compare(Student thi, Student that) 
    { 
    	// System.out.println(thi.total +" " +that.total);
        int result = that.total- thi.total;
        // return result;
		if(result != 0) {
			return result;
		}
		result = that.s3 - thi.s3;
		if(result != 0) {
			return result;
		}
		result = that.s2 - thi.s2;
		if(result != 0 ) {
			return result;
		}
		return that.dob.compareTo(thi.dob);
	}
}

// class StudentMerit {
// 	Student[] stdData;
// 	int size;
// 	public StudentMerit() {
// 		stdData = new Student[50];
// 		size = 0;
// 	}
// 	public void addStudent(Student Obj) {
// 		stdData[size++] = Obj;
// 	}
// 	public Student[] getArray() {
// 		return stdData;
// 	}
// }
// class MergeSort<T> {
//     private  T[] aux;

//     public  void sort(T[] a, Comparator<T> cp) {
//         aux = (T[]) new Object[a.length];
//         sort(a, 0, a.length - 1, cp);
//     }

//     private void merge(T[] a, int lo, int mid, int hi, Comparator<T> cp) {
//         int i = lo, j = mid + 1;
        
//         for (int k = lo; k <= hi; k++)
//             aux[k] = a[k];

//         for (int k = lo; k <= hi; k++)
//             if      (i > mid)              a[k] = aux[j++];
//             else if (j > hi )              a[k] = aux[i++];
//             else if (less(aux[j], aux[i], cp)) a[k] = aux[j++];
//             else                           a[k] = aux[i++];
//     }

//     private boolean less(T a, T b, Comparator<T> cp) {
//         return cp.compare(a,b) < 0;
//     } 

//     private void sort(T[] a, int lo, int hi, Comparator<T> cp) {
//         if (hi <= lo) return;
//         int mid = lo + (hi - lo) / 2;
//         sort(a, lo, mid, cp);
//         sort(a, mid + 1, hi, cp);
//         merge(a, lo, mid, hi, cp);
//     }
// }

// public class Solution {
// 	public static void main(String[] args) {
// 		Student a = new Student("Ajay","12-06-1993",32,33,11,76,"Open");
// 		Student b = new Student("priya","13-08-1993",21,40,11,72,"SC");
// 		Student c = new Student("divya","29-07-1993",40,39,20,99,"ST");
// 		Student[] arr = {a,b,c};
// 		for(Student i : arr) {
// 			System.out.println(i);
// 		}
// 		// MergeSort<Student> nani = new MergeSort();
// 		// nani.sort(arr);
// 		Arrays.sort(arr,new SortbyCriteria() );
// 		// System.out.println(arr);
// 		for(Student i : arr) {
// 			System.out.println(i);
// 		}
// 	}

// }
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int vacancy = scan.nextInt();
		int unreserve = scan.nextInt();
		int bc = scan.nextInt();
		int sc = scan.nextInt();
		int st = scan.nextInt();
		int reserve = bc + sc + st;
		Student[] arr = new Student[N];
		int size = 0;
		scan.nextLine();
		Student[] resArr = new Student[reserve];
		int resSize = 0;
		for(int i = 0; i < N; i++) {
			String inp = scan.nextLine();
			// System.out.println(inp);
			String[] str = inp.split(",");
			Student obj = new Student(str[0], str[1],Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5]), str[6]);
			arr[size++] = obj;
			if(str[6].equals("bc") || str[6].equals("st") || str[6].equals("sc"))
				resArr[resSize++] = obj;
		}
		Arrays.sort(arr, new SortbyCriteria()); 
		Arrays.sort(resArr, new SortbyCriteria());
		Student[] finalArr  = new Student[vacancy];
		int finalsize = 0;
		for(int i = 0; i < unreserve; i++) {
			finalArr[finalsize++] = arr[i];
		}
		if(finalsize < vacancy) {
			for(int i =0; i < reserve; i ++) {
				finalArr[finalsize++] = resArr[i];
			}
		}

		for(int k= 0; k < size; k++) {
			System.out.println(arr[k]);
		}
		System.out.println();
		// for(int i = 0)
		for(int i = 0; i < vacancy; i++) {
			System.out.println(finalArr[i]);
		}
		

	}
}

