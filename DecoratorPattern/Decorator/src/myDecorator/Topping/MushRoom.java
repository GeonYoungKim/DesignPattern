package myDecorator.Topping;

import myDecorator.ToppingDecoratorCreator;
import myDecorator.Pizza.Pinterface;

public class MushRoom extends ToppAbsClass{

	public MushRoom(Pinterface pinterface) {
		super(pinterface);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "버섯 토핑 + "+pinterface.getName();
	}
//	public MushRoom(Object ob) {
//		super(ob);
//		// TODO Auto-generated constructor stub
//	}
//	//데코레이터 패턴으로 자신만의 메소드 꾸미기(메소드 오버라이드)
//	public int getToppingPriceDeco() {
//		return super.getToppingPriceDeco()+500;
//	}

}
