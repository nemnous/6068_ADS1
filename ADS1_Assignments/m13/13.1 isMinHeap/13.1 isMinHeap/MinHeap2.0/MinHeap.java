import java.util.Arrays;
import java.util.Scanner;
class MinHeap<E extends Comparable<E>> {
	E[] array;
	int size;
	MinHeap() {
		array = (E[]) new Comparable[1000];
		size  =0;
	}
	void add(E element) {
		array[++size] = element;
		swim();
	}
	void exchange(int index1, int index2) {
		E temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	void swim() {
		int index = size;

		while(index > 1 && array[index].compareTo(array[index/2]) < 0) {
			exchange(index, index/2);
			index /= 2;
		}
	}
	void print() {
		for(int i =1; i <= size; i++)
			System.out.print(array[i] + " ");
	}

	E remove() {
		E temp = array[1];
		array[1] = array[size];
		array[size--] = null;
		sink();
		return temp;
	}
	boolean hasleftChild(int i) {
		return array[2*i] != null;
	}
	boolean hasRightChild(int i) {
		return array[2*i +1] != null;
	}
	void sink() {
		int index = 1;
		int leftChild = 2*index;
		int rightChild = 2*index +1;
		while(index < size) {
		// System.out.println("lol");

		// if(hasRightChild(index) && array[leftChild].compareTo(array[rightChild]) > 0) {
		// 	exchange(leftChild, rightChild);
		// }

		// if(array[index].compareTo(array[leftChild]) < 0) {
		// 	exchange(index, leftChild);
		// }
		// index *= 2;
		// System.out.println("index " + index);
	} 
}
}