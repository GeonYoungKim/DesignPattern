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
	int pizzatotal = 0;
	Order order;
	Order o;
	public Order pizzaclone() {
		o=super.clone();
		System.out.println(o);
		return o;
	}
	
	
	public PizzaDecoratorCreator() {
		
		order=this;
	}
	public void show(){
		new MenuFrame();
	}
	PizzaDecoratorCreator Pizza;
	SingleTon singleton=SingleTon.getInstance();
	MainFrame main=MainFrame.getInstance();
	
	@Override
	public int getPriceTotal() {
		
		super.setTotal( super.getPriceTotal() + getPizzaPrice());
		System.out.println(super.getTotal()+"pizza 추가");
		
		return super.getTotal();
	};
	public int getPizzaPrice() {
		return this.pizzatotal;
	}
	
	
	private int getSuperTotal() {
		return super.getTotal();
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
					System.out.println("콤비");
					Pizza=new Combination();
					pizzatotal+=Pizza.getPizzaPrice();
					singleton.plus();
					order.getPriceTotal();
					pizzatotal=0;
					main.topping_frame(pizzaclone());
					
				}
			});
			
			Button potato_btn=new Button("Potato");
			potato_btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Pizza=new Potato();
					pizzatotal+=Pizza.getPizzaPrice();
					singleton.plus();
					order.getPriceTotal();
					pizzatotal=0;
					main.topping_frame(pizzaclone());
					
				}
			});
			
			Button sweetpotato_btn=new Button("Sweet_potato");
			sweetpotato_btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Pizza=new SweetPotato();
					pizzatotal+=Pizza.getPizzaPrice();
					singleton.plus();
					order.getPriceTotal();
					pizzatotal=0;
					main.topping_frame(pizzaclone());
				}
			});
			
			Button exit_btn=new Button("Quit");
			exit_btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("총 주문 금액은 무엇입니다."+o.getPriceTotal());
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
