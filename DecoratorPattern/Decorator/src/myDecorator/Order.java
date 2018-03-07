package myDecorator;

abstract public class Order {
	
	//고객마다의 주문 총 가격의 그릇
	private int total=0;
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getTotal() {
		return total;
	};
	
	
	//데코레이터 패턴을 하기위한 기본 메소드, 또한 Composite을 하기위하여 인자로 Order를 두어 피자, 토핑 둘다 가능하게 구현(사실상 피자-폴더, 토핑-파일)
	public int getPriceTotal(Order order) {
		return order.getTotal();
	}

	//각 자식인 토핑과 피자객체에 프레임이 있기 때문에 추상 메소드 선언
	abstract public void show();
	//각 선택시 해야할 사항이 있어 추상 메소드 선언
	abstract public void amount_price_increase(Order order,int number);
	//얕은 복사 메소드 - 프로토타입 패턴
	public Order clone() {
		return this;
	};
}
