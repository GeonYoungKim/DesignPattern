package myDecorator;

abstract public class Order {
	
	private int total=0;
	
	
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getTotal() {
		return total;
	};
	
	public int getPriceTotal(Order order) {
		return order.getTotal();
	}

	abstract public void show();
	abstract public void amount_price_increase(Order order,int number);
	public Order clone() {
		return this;
	};
}
