package UI;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import myDecorator.Order;
import myDecorator.PizzaDecoratorCreator;
import myDecorator.SingleTon;
import myDecorator.ToppingDecoratorCreator;

public class MainFrame extends JFrame {
	
	
	Order order;
	
	private static MainFrame mainFrame = null;
	public static synchronized MainFrame getInstance() {
        if (mainFrame == null) {
        	mainFrame = new MainFrame();
        }
        return mainFrame;
    }
	public MainFrame() {
		// TODO Auto-generated constructor stub
		
		super("주문 창");

		Button btn = new Button("Order");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				order = new PizzaDecoratorCreator();
				order.show();
			}
		});
		btn.setSize(500, 500);
		this.add(btn);

		setBounds(500, 500, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void topping_frame(Object ob) {
		order = new ToppingDecoratorCreator(ob);
		order.show();
		
	}

}
