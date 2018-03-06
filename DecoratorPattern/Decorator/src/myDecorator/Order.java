package myDecorator;

abstract public class Order {
	private int total=0;
	private boolean exit=false;
	

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}

	
	public int getTotal() {
		return total;
	};
	
	public int getPriceTotal() {
		return getTotal();
	}

	abstract public void show();
	public Order clone() {
		return this;
	};
}
