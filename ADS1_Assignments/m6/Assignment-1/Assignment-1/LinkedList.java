class LinkedList<E> {
	class Node {
		E data;
		Node next = null;
	}

	int size = 0;
	Node head = new Node();
	public void insertAt(E data, int pos) {
		Node newNode = new Node();
		if (pos > size || pos < 0) return;
		if (pos == 0) {
			head.data = data;
			size++;
			return;
		}
		Node temp = head;
		int tcount = 0;
		while (tcount++ < pos - 1)
			temp = temp.next;
		newNode.data = data;
		newNode.next = temp.next;
		temp.next = newNode;
		size++;
	}
	public void insertEnd(E data) {
		insertAt(data, size);
	}
	public void delAt(int pos) {
		if(pos > size-- && pos < 0) return;
		Node temp = head;
		int tcount = 0;
		if(pos == 0) {
			head.next = null;
			return;
		}
		while(tcount++ < pos - 1)
			temp = temp.next;
		temp.next = temp.next.next;
	}
	public void delEnd() {
		delAt(size - 1);
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public E dataAt(int pos) {
		if(pos > size && pos < 0) return null;
		Node temp = head;
		int tcount = 0; 
		while(tcount++ < pos)
			temp = temp.next;
		return temp.data;
	}
	public E dataEnd() {
		return dataAt(size -1);
	}
	public void print() {
		Node temp = head;
		int tcount = 0;
		while (tcount++ < size) {
			System.out.print(temp.data + " ");
			temp  = temp.next;
		}
	}
}