package myDecorator.Topping;

import myDecorator.ToppingDecoratorCreator;
import myDecorator.Pizza.Pinterface;

public class Peparony extends ToppAbsClass{

	public Peparony(Pinterface pinterface) {
		super(pinterface);
		// TODO Auto-generated constructor stub
	}
//	public Peparony(Object ob) {
//		super(ob);
//		
//	}
//	//데코레이터 패턴으로 자신만의 메소드 꾸미기(메소드 오버라이드)
//	public int getToppingPriceDeco() {
//		return super.getToppingPriceDeco()+2000;
//	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "페퍼로니 + "+pinterface.getName();
	}

}
