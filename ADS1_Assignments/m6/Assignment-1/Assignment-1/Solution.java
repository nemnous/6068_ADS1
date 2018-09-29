import java.util.Scanner;
/**
 * author @nemnous.
 */
/**
 * Class for add large numbers.
 */
final class AddLargeNumbers {
    /**
     * Constructs the object.
     */
    private AddLargeNumbers() {
        // unused constructor.
    }
    /**
     * converts String number to digits.
     *
     * @param      number  The number
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList numberToDigits(final String number) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        char[] charA = number.toCharArray();
        for (Character i : charA) {
            list.insertEnd(Character.getNumericValue(i));
        }
        return list;

    }
    /**
     * converts list digits to string number.
     *
     * @param      list  The list
     *
     * @return     { description_of_the_return_value }
     */
    public static String digitsToNumber(final LinkedList list) {
        String str = "";
        for (int i = 0; i < list.size; i++) {
            str += String.valueOf(list.dataAt(i));
        }
        return str;
    }
    /**
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     returns list of addition sum.
     */
public static LinkedList addLargeNumbers(final LinkedList list1,
                                         final LinkedList list2) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Stack<Integer> stk1 = new Stack<Integer>();
        Stack<Integer> stk2 = new Stack<Integer>();
        Stack<Integer> stk3 = new Stack<Integer>();
        // System.out.println(list1.size);
        for (int i = 0; i < list1.size; i++) {
            int a = (Integer) (list1.dataAt(i));
            stk1.push(a);
        }
        for (int i = 0; i < list2.size; i++) {
            int a = (Integer) (list2.dataAt(i));
            stk2.push(a);
        }
        int carry = 0;
        final int ten = 10;
        while (!stk1.isEmpty() && !stk2.isEmpty()) {
            int a = stk1.pop() + stk2.pop() + carry;
            // list.insertBeg( a % 10);
            stk3.push(a % ten);
            // list.print();
            // System.out.println();
            carry = a / ten;
            //      stk1.print();


        }

        if (list1.size < list2.size) {
            for (int i = list1.size; i < list2.size; i++) {
                // stk3.push(stk2.pop() + carry);
                int a = stk2.pop() + carry;
                stk3.push(a % ten);
                carry = a / ten;
            }
        } else if (list2.size < list1.size) {
            for (int i = list2.size; i < list1.size; i++) {
                // stk3.push(stk1.pop() + carry);
                int a = stk1.pop() + carry;
                stk3.push(a % ten);
                carry = a / ten;
            }
        }
        if (carry > 0) {
            stk3.push(carry);
        }
        while (!stk3.isEmpty()) {
            list.insertEnd(stk3.pop());
        }
        return list;
    }
}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor.
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();

        switch (input) {
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
        default:
            break;
        }
    }

}

