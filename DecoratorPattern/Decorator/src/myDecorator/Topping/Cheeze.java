package myDecorator.Topping;

import myDecorator.Order;
import myDecorator.ToppingDecorator;

public class Cheeze extends ToppingDecorator{
	public Cheeze(Order ob) {
		super(ob);
		// TODO Auto-generated constructor stub
	}
	//데코레이터 패턴으로 자신만의 메소드 꾸미기(메소드 오버라이드)
	public int getToppingPriceDeco() {
		return 1000;
	}
}
