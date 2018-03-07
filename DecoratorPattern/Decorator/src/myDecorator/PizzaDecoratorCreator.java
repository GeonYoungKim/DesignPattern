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
import myDecorator.Pizza.Combination;
import myDecorator.Pizza.Potato;
import myDecorator.Pizza.SweetPotato;



public class PizzaDecoratorCreator extends Order {
	
	//피자 선택 시 마다 피자의 가격을 받아올 그릇
	private int pizza_price = 0;
	
	public int getPizza_price() {
		return pizza_price;
	}

	public void setPizza_price(int pizza_price) {
		this.pizza_price = pizza_price;
	}

	//자기 자신을 가리키는 객체
	private Order pizza_order;
	//부모 객체를 가리키는객체
	private Order super_order;
	
	//피자마다의 가격에 대해서 또한 데코레이트 패턴을 적용 시키기 위한 중간 부모 객체 역할
	private PizzaDecoratorCreator Pizza;
	
	//총 피자의 판매량을 위한 싱글톤 객체
	SingleTon singleton=SingleTon.getInstance();
	MainFrame main=MainFrame.getInstance();
	
	
	public PizzaDecoratorCreator() {
		super();
		//각각 자신과 부모 객체 할당
		pizza_order=this;
		super_order=super.clone();
	}
	
	//피자 메뉴 프레임 생성 메소드
	public void show(){
		new MenuFrame();
	}
	
	//데코레이터 패턴으로 자신만의 메소드 꾸미기(메소드 오버라이드)
	@Override
	public int getPriceTotal(Order order) {
		
		super.setTotal(super.getPriceTotal(order) + getPizzaPriceDeco());
		
		return order.getTotal();
	};
	
	//PizzaDecoratorCreator에 데코레이터를 위한 기본 메소드
	public int getPizzaPriceDeco() {
		return getPizza_price();
	}
	
	//부모의 현재 총합 메소드
	private int getSuperTotal() {
		return super.getTotal();
	}
	
	//피자 종류 버튼 선택시 각각에 맞도록 실행하는 메소드
	public void amount_price_increase(Order order,int number) {
		if(number==1) {
			System.out.println("콤비네이션 피자를 선택하셨습니다. 해당 피자에 추가하고픈 토핑들을 추가하세요");
			
		}else if(number==2) {
			System.out.println("포테이토 피자를 선택하셨습니다. 해당 피자에 추가하고픈 토핑들을 추가하세요");
			
		}else if(number==3){
			System.out.println("고구마 피자를 선택하셨습니다. 해당 피자에 추가하고픈 토핑들을 추가하세요");
			
		}else {
			System.out.println("해당 피자는 없습니다.");
		}
		
		Pizza=(PizzaDecoratorCreator) order;
		//데코레이터 메소드 이용
		pizza_price+=Pizza.getPizzaPriceDeco();
		//피자 누적 총계 증가
		singleton.plus();
		//PizzaDecoratorCreator의 데코레이터 메소드 수행
		pizza_order.getPriceTotal(super_order);
		//0으로 만듬 -> 누적은 Order에서 계산하기 때문에 클릭 시마다의 값만 누적해줌
		pizza_price=0;
		//토핑 프레임 실행, 부모(Order)객체 인자값 전달
		main.topping_frame(super.clone());
		
	}
	
	class MenuFrame extends JFrame{
		
		public MenuFrame() {
			// TODO Auto-generated constructor stub
			super("메뉴 프레임");
			JPanel panel=new JPanel();
			
			Button combination_btn=new Button("Combination");
			combination_btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e){
					//Combination 버튼 클릭 시 수행
					amount_price_increase(new Combination(),1);
					
				}
			});
			
			Button potato_btn=new Button("Potato");
			potato_btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//Potato 버튼 클릭 시 수행
					amount_price_increase(new Potato(),2);
					
				}
			});
			
			Button sweetpotato_btn=new Button("Sweet_potato");
			sweetpotato_btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//Sweet_potato 버튼 클릭 시 수행
					amount_price_increase(new SweetPotato(),3);
				}
			});
			
			Button exit_btn=new Button("Quit");
			exit_btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//피자를 그만 고른다는것은 주문이 끝났다는 것을 의미
					System.out.println("총 판매 피자 갯수는 "+singleton.getPizza_count());
					System.out.println("총 주문 금액은 무엇입니다."+super_order.getPriceTotal(super_order));
					dispose();
					
				}
			});
			panel.add(combination_btn);
			panel.add(potato_btn);
			panel.add(sweetpotato_btn);
			panel.add(exit_btn);
			this.add(panel);
			setBounds(300, 300, 800, 200);
			setVisible(true);
			
		}
		
	}
}
