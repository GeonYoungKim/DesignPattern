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



public class PizzaDecoratorCreator extends Order {
	private int pizzatotal = 0;
	
	private Order pizza_order;
	private Order super_order;
	
	private PizzaDecoratorCreator Pizza;
	SingleTon singleton=SingleTon.getInstance();
	MainFrame main=MainFrame.getInstance();
	
	public int getPizzatotal() {
		return pizzatotal;
	}


	public void setPizzatotal(int pizzatotal) {
		this.pizzatotal = pizzatotal;
	}
	
	public PizzaDecoratorCreator() {
		super();
		pizza_order=this;
		super_order=super.clone();
	}
	public void show(){
		new MenuFrame();
	}
	
	@Override
	public int getPriceTotal(Order order) {
		
		super.setTotal(super.getPriceTotal(order) + getPizzaPrice());
		
		return order.getTotal();
	};
	public int getPizzaPrice() {
		return getPizzatotal();
	}
	
	private int getSuperTotal() {
		return super.getTotal();
	}
	
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
		pizzatotal+=Pizza.getPizzaPrice();
		singleton.plus();
		pizza_order.getPriceTotal(super_order);
		pizzatotal=0;
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
					// TODO Auto-generated method stub
					amount_price_increase(new Combination(),1);
					
				}
			});
			
			Button potato_btn=new Button("Potato");
			potato_btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					amount_price_increase(new Potato(),2);
					
				}
			});
			
			Button sweetpotato_btn=new Button("Sweet_potato");
			sweetpotato_btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					amount_price_increase(new SweetPotato(),3);
				}
			});
			
			Button exit_btn=new Button("Quit");
			exit_btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
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
			setBounds(500, 500, 500, 500);
			setVisible(true);
			
		}
		
	}
}
