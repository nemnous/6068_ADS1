class Stock implements Comparable<Stock>{
	String StockName;
	Double StockFreq;
	Stock() {

	}
	Stock(String StockName, Double StockFreq) {
		this.StockName = StockName;
		this.StockFreq = StockFreq;
	}
	public int compareTo(Stock that) {
		if(this.StockFreq > that.StockFreq)
			return 1;
		if(this.StockFreq < that.StockFreq)
			return -1;
		return this.StockName.compareTo(that.StockName);
	}

}