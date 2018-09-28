class Stack<E>{
	LinkedList<E> stackList = new LinkedList<E>();
	public void push(E data) {
		stackList.insertEnd(data);
	}
	public E pop() {
		E t = stackList.dataEnd();
		stackList.delEnd();
		return t;
	}
	public boolean isEmpty() {
		return stackList.isEmpty();
	}
	public void print() {
		stackList.print();
	}
}