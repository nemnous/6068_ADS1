class test {
	public static void main(String[] args) {
		HeapSort<String> obj = new HeapSort<String>();
		// obj.add(2);
		// obj.add(1);
		// obj.add(5);
		// obj.add(3);
		// obj.add(4);
		// obj.print();
		// obj.remove();xzQ
		// obj.print();
		String str = "N,J,F,E,B,A";
		String[] str1 = str.split(",");
		for(int i = 0; i < str1.length; i++) {
			obj.add(str1[i]);
		}
		obj.print();
		System.out.println(obj.compareThese(str1));
	}
}