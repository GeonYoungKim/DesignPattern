import java.util.ArrayList;
import java.util.Scanner;

import UI.MainFrame;
import myDecorator.Order;
import myDecorator.PizzaDecoratorCreator;
import myDecorator.ToppingDecoratorCreator;

public class Main {
	
	public static void main(String[] args) {
		
		MainFrame main=MainFrame.getInstance();
		
		//스스로 생각한 데코레이터 방식
		
		
		
		
//		//동영상에 나와 있는 데코레이터 패턴 방식
//		Scanner sc=new Scanner(System.in);
//		
//		IBeverage beverage=new Base();
//		boolean done=false;
//		
//		while(!done) {
//			System.out.println("음료 현재 가격: "+beverage.getTotalPrice());
//			System.out.println("선택 1. 샷추가 / 2. 우유 추가");
//			
//			switch(sc.nextInt()) {
//			case 0: done=true;
//				break;
//			case 1:
//				beverage=new Espresso(beverage);
//				break;
//			case 2:
//				beverage=new Milk(beverage);
//				break;
//				
//			}
//		}
//		System.out.println("음료가격 : "+beverage.getTotalPrice());
//			
		

	}

}
