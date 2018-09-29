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
    	for(int i = 0; i < list.size; i++) {
    		str += String.valueOf(list.dataAt(i));
    	}
    	return str;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	Stack<Integer> stk1 = new Stack<Integer>();
    	Stack<Integer> stk2 = new Stack<Integer>();
    	Stack<Integer> stk3 = new Stack<Integer>();
    	System.out.println(list1.size);
    	for(int i = 0; i < list1.size; i++) {
    		int a = (Integer)(list1.dataAt(i));
    		stk1.push(a);
    	}
    	for(int i = 0; i < list2.size; i++) {
    		int a = (Integer)(list2.dataAt(i));
    		stk2.push(a);
    	}
    	int carry = 0;
    	while(!stk1.isEmpty() && !stk2.isEmpty()) {
    		// int a = stk1.pop();
    		// System.out.println(a);
    		int a = stk1.pop() + stk2.pop() + carry;
    		// list.insertBeg( a % 10);
    		stk3.push(a%10);
    		// list.print();
    		// System.out.println();
    		carry = (a/10) % 10;
    		//     	stk1.print();


    	}
    	if(list1.size < list2.size) {
    		for(int i = list1.size; i < list2.size; i++) {
    			stk3.push(stk2.pop() + carry);
    		}
    	}
    	while(!stk3.isEmpty()) {
    		list.insertEnd(stk3.pop());
    	}
    	return list;
    }
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

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
