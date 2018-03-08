package myDecorator.Pizza;

import myDecorator.PizzaDecorator;

public class SweetPotato extends PizzaDecorator {
	
	//데코레이터 패턴으로 자신만의 메소드 꾸미기(메소드 오버라이드)
	public int getPizzaPriceDeco() {
		return 9000;
	}

}
