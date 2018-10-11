import java.util.Arrays;
import java.util.Scanner;

/**
 * Class for heap sort.
 *
 * @param      <E>   Generic class.
 */
class HeapSort<E extends Comparable<E>> {
    /**
     * array of generic type.
     */
    private E[] array;
    /**
     * size variable.
     */
    private int size;
    /**
     * Constructs the object.
     */
    // array - new int[10]
    HeapSort() {
        final int tl = 200000;
        // array = new E[10];
        array = (E[]) new Comparable[tl];
        size = 0;
    }
/**
 * moves the node towards up to the correct position.
 */
    void swim() {
        int index = size;

        while ((index > 1) && (array[index / 2].compareTo(array[index]) > 0)) {
            E t = array[index / 2];
            array[index / 2] = array[index];
            array[index] = t;
            index /= 2;
        }
    }
/**
 * removes the object from the top.
 *
 * @return     returns element of the top node.
 */
    E remove() {
        E temp = array[1];
        array[1] = array[size--];
        sink();
        return temp;
    }
/**
 * moves the node downwards the tree.
 */
    void sink() {
        int index = 1;
        int left = index * 2;
        int right = index * 2 + 1;
        while (left <= size) {
            int minIndex = left;
            if (array[left].compareTo(array[right]) > 0) {
                minIndex = right;
            }
            if (array[index].compareTo(array[minIndex]) > 0) {
                E t = array[index];
                array[index] = array[minIndex];
                array[minIndex] = t;
            } else {
                break;
            }
        }

    }
/**
 * adds element to the heap.
 *
 * @param      i     the element to be added.
 */
    void add(final E i) {
        // size++;
        // System.out.println("main " + Arrays.toString(array));
        array[++size] = i;
        swim();
    }
/**
 * prints the head order.
 */
    void print() {

        System.out.println(Arrays.toString(array));

    }
/**
 * compares the this.array to the input array.
 *
 * @param      arr   The arr
 *
 * @return     returns false or true.
 */
    boolean compareThese(final E[] arr) {
        boolean temp = true;
        for (int i = 0; i < size; i++) {
            if (!this.array[i + 1].equals(arr[i])) {
                temp = false;
                break;
            }
        }
        return temp;
    }
    /**
     * clears the array.
     * "NOT WORKING"
     */
    void clear() {
        for (E i : array) {
            i = null;
        }
        size = 0;
    }
/**
 * Sets the array.
 */
    void setArray() {
        Arrays.fill(this.array, null);
    }
/**
 * Sets the size.
 */
    void setSize() {
        this.size = 0;
    }
}
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * unused constructor.
         */
    }
    /**
     * main function which drives the testcases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        int testcases = scan.nextInt();
        switch (type) {
        case "String":
            HeapSort<String> obj = new HeapSort();
            // int testcases = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < testcases; i++) {
                String[] arr = scan.nextLine().split(",");
                for (String x : arr) {
                    obj.add(x);
                }

                System.out.println(obj.compareThese(arr));
                obj.setArray();
                obj.setSize();
            }
            break;
        case "Float":
            HeapSort<Float> obj1 = new HeapSort();
            // int testcases = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < testcases; i++) {
                String[] arr = scan.nextLine().split(",");
                // System.out.println(arr.length);
                // System.out.println(Arrays.toString(arr));
                if (arr.length == 1 && arr[0].equals("")) {
                    System.out.println(false);
                    continue;

                } else {
Float[] floats = Arrays.stream(arr).map(Float::valueOf).toArray(Float[]::new);
                    for (Float x : floats) {
                        obj1.add(x);
                    }
                    System.out.println(obj1.compareThese(floats));
                    obj1.setArray();
                    obj1.setSize();
                }
            }
            break;
        case "Double":

            HeapSort<Double> obj2 = new HeapSort();
            // int testcases = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < testcases; i++) {
                String[] arr = scan.nextLine().split(",");
                // System.out.println(arr.length);
                // System.out.println(Arrays.toString(arr));
                if (arr.length == 1 && arr[0].equals("")) {
                    System.out.println(false);
                    continue;
                } else {
Double[] doubles;
doubles = Arrays.stream(arr).map(Double::valueOf).toArray(Double[]::new);
                    for (Double x : doubles) {
                        obj2.add(x);
                    }
                    System.out.println(obj2.compareThese(doubles));
                    obj2.setArray();
                    obj2.setSize();
                }
            }
            break;
        case "Integer":
            HeapSort<Integer> obj3 = new HeapSort();
            // int testcases = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < testcases; i++) {
                String[] arr = scan.nextLine().split(",");
                // System.out.println(arr.length);
                // System.out.println(Arrays.toString(arr));
                if (arr.length == 1 && arr[0].equals("")) {
                    System.out.println(false);
                    continue;
                } else {
Integer[] intArr;
intArr = Arrays.stream(arr).map(Integer::valueOf).toArray(Integer[]::new);
                    for (Integer x : intArr) {
                        obj3.add(x);
                    }
                    System.out.println(obj3.compareThese(intArr));
                    obj3.setArray();
                    obj3.setSize();
                }
            }
            break;
        default :
            System.out.println("Where's The Food!");
        }

    }
}
