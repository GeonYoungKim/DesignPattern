package myDecorator.Topping;

import myDecorator.ToppingDecoratorCreator;
import myDecorator.Pizza.Pinterface;

public class Cheeze extends ToppAbsClass{

	public Cheeze(Pinterface pinterface) {
		super(pinterface);
		// TODO Auto-generated constructor stub
	}
//	public Cheeze(Object ob) {
//		super(ob);
//		// TODO Auto-generated constructor stub
//	}
//	//데코레이터 패턴으로 자신만의 메소드 꾸미기(메소드 오버라이드)
//	public int getToppingPriceDeco() {
//		return super.getToppingPriceDeco()+1000;
//	}

	@Override
	public String getName() {
		
		return "치즈 토핑 + "+pinterface.getName();
	}
}
