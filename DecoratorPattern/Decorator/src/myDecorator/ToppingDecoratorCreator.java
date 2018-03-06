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
	ToppingDecoratorCreator Topping;
	Order order;
	Order order2;
	MainFrame main=MainFrame.getInstance();
	public ToppingDecoratorCreator(Object ob) {
		// TODO Auto-generated constructor stub
		order=this;
		order2=(Order)ob;
	}

	@Override
	public int getPriceTotal() {
		
		order2.setTotal(order2.getPriceTotal() + getToppingPrice());
		
		System.out.println(order2.getTotal()+"토핑 추가");
		return order2.getTotal();
	};

	public int getToppingPrice() {
		return this.toppingtotal;
	}

	private int addToppingPrice() {
		new ToppingFrame();
		return toppingtotal;

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
					Topping = new Cheeze(order2);
					toppingtotal += Topping.getToppingPrice();
					order.getPriceTotal();
					toppingtotal = 0;
				}
			});

			Button mushroom_btn = new Button("mushroom");
			mushroom_btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Topping = new MushRoom(order2);
					toppingtotal += Topping.getToppingPrice();
					order.getPriceTotal();
					toppingtotal = 0;
					
				}
			});

			Button paperony_btn = new Button("paperony");
			paperony_btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Topping = new Peparony(order2);
					toppingtotal += Topping.getToppingPrice();
					order.getPriceTotal();
					toppingtotal = 0;
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

	@Override
	public void show() {
		// TODO Auto-generated method stub
		new ToppingFrame();
	}
}
