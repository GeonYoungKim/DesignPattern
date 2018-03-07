package myDecorator;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import UI.MainFrame;
import myDecorator.PizzaDecoratorCreator.MenuFrame;

public class ToppingDecoratorCreator extends Order {
	private int toppingtotal = 0;
	private ToppingDecoratorCreator Topping;
	private Order topping_order;
	private Order clone_order;
	MainFrame main=MainFrame.getInstance();
	
	public ToppingDecoratorCreator(Object ob) {
		// TODO Auto-generated constructor stub
		super();
		topping_order=this;
		clone_order=(Order)ob;
	}

	@Override
	public int getPriceTotal(Order order) {
		
		order.setTotal(order.getPriceTotal(order) + getToppingPrice());
		
		return clone_order.getTotal();
	};

	public int getToppingPrice() {
		return getToppingtotal();
	}
	
	public int getToppingtotal() {
		return toppingtotal;
	}

	public void setToppingtotal(int toppingtotal) {
		this.toppingtotal = toppingtotal;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		new ToppingFrame();
	}

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
		toppingtotal += Topping.getToppingPrice();
		topping_order.getPriceTotal(clone_order);
		toppingtotal = 0;
	}

	class ToppingFrame extends JFrame {
		public ToppingFrame() {
			// TODO Auto-generated constructor stub
			super("토핑프레임 ");
			JPanel panel = new JPanel();

			Button cheeze_btn = new Button("cheeze");
			cheeze_btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					amount_price_increase(new Cheeze(clone_order),1);
				}
			});

			Button mushroom_btn = new Button("mushroom");
			mushroom_btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					amount_price_increase(new MushRoom(clone_order),2);
					
				}
			});

			Button paperony_btn = new Button("paperony");
			paperony_btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					amount_price_increase(new Peparony(clone_order),3);
				}
			});

			Button exit_btn = new Button("Quit");
			exit_btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					dispose();

				}
			});
			panel.add(cheeze_btn);
			panel.add(mushroom_btn);
			panel.add(paperony_btn);
			panel.add(exit_btn);
			this.add(panel);
			setBounds(500, 500, 500, 500);
			setVisible(true);

		}

	}

	
}
