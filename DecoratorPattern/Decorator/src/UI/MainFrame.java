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
	
	//주문 시작 버튼이 있는 프레임 생성 부분
	public MainFrame() {
		
		super("주문 창");
		Button btn = new Button("Order");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Order버튼을 클릭하면 Order 객체를 상속받은 PizzaDecoratorCreator 인스턴스 생성
				order = new PizzaDecoratorCreator();
				//생성 후 피자 선택 프레임을 보여지게 하는 메소드 실행
				order.show();
			}
		});
		btn.setSize(500, 500);
		this.add(btn);

		setBounds(100, 100, 200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void topping_frame(Object ob) {
		//이 부분은 피자를 선택하게 되면 계산 로직이 끝난 후 PizzaDecoratorCreator 인스턴스에서 호출하는 메소드
		//ToppingDecoratorCreator 인스턴스를 생성 인자값은 하나의 주문으로 피자와 토핑들의 총 가격을 누적해야 하기 때문에 첫 인스턴스인 PizzaDecoratorCreator의 부모클래스를 인자로 받는다.
		order = new ToppingDecoratorCreator(ob);
		//토핑 선택 프레임 생성 메소드
		order.show();
		
	}

}
