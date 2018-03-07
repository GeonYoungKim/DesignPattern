package myDecorator;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import UI.MainFrame;
import UI.ToppingFrame;
import UI.AbstrackFrame;

import myDecorator.Topping.Cheeze;
import myDecorator.Topping.MushRoom;
import myDecorator.Topping.Peparony;

public class ToppingDecoratorCreator extends Order {
	//토핑 선택 시 마다 피자의 가격을 받아올 그릇
	private int topping_price = 0;
	
	
	public int getTopping_price() {
		return topping_price;
	}

	public void setTopping_price(int topping_price) {
		this.topping_price = topping_price;
	}

	//토핑마다의 가격에 대해서 또한 데코레이트 패턴을 적용 시키기 위한 중간 부모 객체 역할
	private ToppingDecoratorCreator Topping;
	//자기 자신을 가리키는 객체
	private Order topping_order;
	//인자로 받은 Order객체
	private Order super_order;
	
	//얕은복사물 Order인스턴스 전달 받음.
	public ToppingDecoratorCreator(Object ob) {
		
		super();
		//각각 자신과 부모 객체 할당
		topping_order=this;
		super_order=(Order)ob;
	}

	//데코레이터 패턴으로 자신만의 메소드 꾸미기(메소드 오버라이드)
	@Override
	public int getPriceTotal(Order order) {		
		order.setTotal(order.getPriceTotal(order) + getToppingPriceDeco());
		return super_order.getTotal();
	};

	//ToppingDecoratorCreator에 데코레이터를 위한 기본 메소드
	public int getToppingPriceDeco() {
		return getTopping_price();
	}
	
	//토핑 메뉴 프레임 생성 메소드
	@Override
	public void show() {
		// TODO Auto-generated method stub
		AbstrackFrame toppingframe=new ToppingFrame(topping_order,super_order);
		//부모 클래스의 메소드인 create를 호출하여 각각 나눈 메소드들을 한번에 실행시킨다.
		toppingframe.create();
	}
	//토핑 종류 버튼 선택시 각각에 맞도록 실행하는 메소드
	@Override
	public void amount_price_increase(Order order,int number) {
		if(number==1) {
			System.out.println("치즈 토핑를 추가하셨습니다.");
			
		}else if(number==2) {
			System.out.println("버섯 토핑를 추가하셨습니다.");
			
		}else if(number==3){
			System.out.println("페퍼로니 토핑를 추가하셨습니다.");
			
		}else {
			System.out.println("해당 토핑은 없습니다.");
		}
		// TODO Auto-generated method stub
		Topping = (ToppingDecoratorCreator) order;
		topping_price += Topping.getToppingPriceDeco();
		topping_order.getPriceTotal(super_order);
		topping_price = 0;
	}

	
}
