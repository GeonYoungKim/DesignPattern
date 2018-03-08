package myDecorator;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JFrame;
import javax.swing.JPanel;

import UI.MainFrame;
import UI.MenuFrame;
import UI.AbstrackFrame;
import myDecorator.Pizza.Combination;
import myDecorator.Pizza.Potato;
import myDecorator.Pizza.SweetPotato;



public class PizzaDecorator extends Order {
	
	//피자 선택 시 마다 피자의 가격을 받아올 그릇
	private int pizzaPrice = 0;
	
	
	//자기 자신을 가리키는 객체
	private Order orderPizza;
	//부모 객체를 가리키는객체
	public Order orderSuper;
	
	//피자마다의 가격에 대해서 또한 데코레이트 패턴을 적용 시키기 위한 중간 부모 객체 역할
	private PizzaDecorator pizzaDecorator;
	
	//총 피자의 판매량을 위한 싱글톤 객체
	SingleTon singleTon;
	MainFrame mainFrame;
	
	
	public PizzaDecorator() {
		super();
		//각각 자신과 부모 객체 할당
		orderPizza=this;
		orderSuper=super.clone();
		singleTon=SingleTon.getInstance();
		mainFrame=MainFrame.getInstance();
	}
	
	//피자 메뉴 프레임 생성 메소드
	public void show(){
		AbstrackFrame menuframe=new MenuFrame(orderPizza,orderSuper);
		//부모 클래스의 메소드인 create를 호출하여 각각 나눈 메소드들을 한번에 실행시킨다.
		menuframe.create();
	}
	
	//데코레이터 패턴으로 자신만의 메소드 꾸미기(메소드 오버라이드)
	@Override
	public int getPriceTotal(Order order) {
		
		super.setTotal(super.getPriceTotal(order) + getPizzaPriceDeco());
		
		return order.getTotal();
	};
	
	//PizzaDecoratorCreator에 데코레이터를 위한 기본 메소드
	public int getPizzaPriceDeco() {
		return this.pizzaPrice;
	}
	
	//부모의 현재 총합 메소드
	private int getSuperTotal() {
		return super.getTotal();
	}
	
	//피자 종류 버튼 선택시 각각에 맞도록 실행하는 메소드
	public void amount_price_increase(Order order,int number) {
		
		choice(number);
		pizzaDecorator=(PizzaDecorator) order;
		//데코레이터 메소드 이용
		pizzaPrice+=pizzaDecorator.getPizzaPriceDeco();
		//피자 누적 총계 증가
		singleTon.plus();
		//PizzaDecoratorCreator의 데코레이터 메소드 수행
		orderPizza.getPriceTotal(orderSuper);
		//0으로 만듬 -> 누적은 Order에서 계산하기 때문에 클릭 시마다의 값만 누적해줌
		pizzaPrice=0;
		//토핑 프레임 실행, 부모(Order)객체 인자값 전달
		mainFrame.topping_frame(super.clone());
		
	}

	@Override
	public void choice(int number) {
		// TODO Auto-generated method stub
		if(number==1) {
			System.out.println("콤비네이션 피자를 선택하셨습니다. 해당 피자에 추가하고픈 토핑들을 추가하세요");
			
		}else if(number==2) {
			System.out.println("포테이토 피자를 선택하셨습니다. 해당 피자에 추가하고픈 토핑들을 추가하세요");
			
		}else if(number==3){
			System.out.println("고구마 피자를 선택하셨습니다. 해당 피자에 추가하고픈 토핑들을 추가하세요");
			
		}else {
			System.out.println("해당 피자는 없습니다.");
		}
	}
	
}
