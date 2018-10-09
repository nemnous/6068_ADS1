import java.util.*;

class HeapSort<E extends Comparable<E>> {

	E[] array;
	int size;
	HeapSort() {
		array = (E[]) new Comparable[15];
		size = 0;
	}

	void swim() {
		int index = size;

		while ((index > 1) && (array[index / 2].compareTo(array[index]) > 0)) {
			E t = array[index / 2];
			array[index / 2] = array[index];
			array[index] = t;
			index /= 2;
		}
	}

	E remove() {
		E temp = array[1];
		array[1] = array[size--];
		sink();
		return temp;
	}

	void sink() {
		int index = 1;
		int left = index * 2;
		int right = index * 2 + 1;
		while (left <= size) {
			int minIndex = left;
			if (right >= size && array[left].compareTo(array[right]) > 0) {
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

	void add(E i) {
		// size++;
		// System.out.println("main " + Arrays.toString(array));
		array[++size] = i;
		swim();
	}

	void print() {

		System.out.println(Arrays.toString(array));

	}
	boolean compareThese(E[] arr) {
		boolean temp = true;
		for(int i = 0; i < size; i++) {
			if(!this.array[i+1].equals(arr[i])) {
				temp = false;
				break;
			}
		}
		return temp;
	}
	void clear() {
		for(E i : array){
			i = null;
		}
		size = 0;
	}
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String type = scan.nextLine();
		switch(type) {
			case "String":
				HeapSort<String> obj = new HeapSort();
				int testcases = scan.nextInt();
				scan.nextLine();
				for(int i =0; i < testcases; i++) {
					String[] arr = scan.nextLine().split(",");
					// System.out.println(Arrays.toString(arr));
					for(String x : arr) {
						obj.add(x);
					}

				System.out.println(obj.compareThese(arr));
				// obj.clear();
				Arrays.fill(obj.array, null);
				obj.size = 0;
				// System.out.println(Arrays.toString(obj.array));
				}
				break;


		}
	}
}
