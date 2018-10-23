class test {
	public static void main(String[] args) {
		MinHeap<Integer> obj = new MinHeap<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(9);
		obj.add(6);
		obj.add(0);
		obj.print();
		System.out.println();
		obj.remove();
		obj.print();

	}
}