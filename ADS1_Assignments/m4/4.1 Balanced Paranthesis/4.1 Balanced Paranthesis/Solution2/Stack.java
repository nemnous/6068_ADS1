class Stack<E>{
	LinkedList<E> stackList = new LinkedList<E>();
	public void push(E data) {
		stackList.insertEnd(data);
	}
	public E pop() {
		try {
			E t = stackList.dataEnd();
			stackList.delEnd();
			return t;
		}
		catch(Exception E) {
			System.out.println("FuckedUp XD");
		}
		return null;
	}
	public boolean isEmpty() {
		return stackList.isEmpty();
	}
	public void print() {
		stackList.print();
	}
}