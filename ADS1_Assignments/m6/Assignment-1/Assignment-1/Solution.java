import java.util.Scanner;
class AddLargeNumbers {
    public static LinkedList numberToDigits(String number) {
    	LinkedList<Integer> list = new LinkedList<Integer>();
		char[] charA = number.toCharArray();
		for (Character i : charA) {
				list.insertEnd(Character.getNumericValue(i));
    	}
    	return list;
    }
    public static String digitsToNumber(LinkedList list) {
    	String str = "";
    	int i = 0;
    	while(!list.isEmpty()) {
    		str += String.valueOf(list.dataAt(i));
    		// list.delAt(i++);
    	}
    	return str;
    }

    // public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    // 	Stack<Integer> stk1 = new Stack<Integer>();
    // 	Stack<Integer> stk2 = new Stack<Integer>();
    // 	for(int i = 0; !list1.isEmpty(); i++) {
    // 		stk1.push(list1.dataAt(i));
    // 	}
    	// while(!list1.isEmpty()) {
    	// }
    // }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            // case "addLargeNumbers":
            //     LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
            //     LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
            //     LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            //     System.out.println(AddLargeNumbers.digitsToNumber(result));
            //     break;
        }
    }
    
}
