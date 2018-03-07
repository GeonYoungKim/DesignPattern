package myDecorator.Topping;

import myDecorator.ToppingDecoratorCreator;

public class MushRoom extends ToppingDecoratorCreator{
	public MushRoom(Object ob) {
		super(ob);
		// TODO Auto-generated constructor stub
	}
	//데코레이터 패턴으로 자신만의 메소드 꾸미기(메소드 오버라이드)
	public int getToppingPriceDeco() {
		return super.getToppingPriceDeco()+500;
	}

}
