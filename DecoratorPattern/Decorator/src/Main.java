import java.util.Scanner;

import myDecorator.Order;
import myDecorator.PizzaDecoratorCreator;
import myDecorator.ToppingDecoratorCreator;

public class Main {
	
	public static void main(String[] args) {
		
		
		//스스로 생각한 데코레이터 방식
//		Order order;
//		System.out.println("주문해 주세요");
//		
//		while(true) {
//			order=new PizzaDecoratorCreator();
//			order.gettotal();
//			if(order.exit==true) {
//				break;
//			}
//			order=new ToppingDecoratorCreator();
//			order.gettotal();
//			
//		}
//		order=new Order();
//		System.out.println("총가격은"+order.gettotal());
		
		
		//동영상에 나와 있는 데코레이터 패턴 방식
		Scanner sc=new Scanner(System.in);
		
		IBeverage beverage=new Base();
		boolean done=false;
		
		while(!done) {
			System.out.println("음료 현재 가격: "+beverage.getTotalPrice());
			System.out.println("선택 1. 샷추가 / 2. 우유 추가");
			
			switch(sc.nextInt()) {
			case 0: done=true;
				break;
			case 1:
				beverage=new Espresso(beverage);
				break;
			case 2:
				beverage=new Milk(beverage);
				break;
				
			}
		}
		System.out.println("음료가격 : "+beverage.getTotalPrice());
			
		

	}

}
