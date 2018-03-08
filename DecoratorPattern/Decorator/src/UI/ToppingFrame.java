package UI;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import myDecorator.Order;
import myDecorator.Topping.Cheeze;
import myDecorator.Topping.MushRoom;
import myDecorator.Topping.Peparony;

//템플릿 패턴의 자식 클래스 -> 조각조각인 추상 메소드들 작성해야 한다.
public class ToppingFrame extends AbstrackFrame {
	JPanel panel;
	Button btnCheeze;
	Button btnMushroom;
	Button btnPaperony;
	Button btnExit;
	Order orderTopping,orderSuper;
	
	//생성자
	public ToppingFrame(Order orderTopping,Order orderSuper) {
		// TODO Auto-generated constructor stub
		super("토핑프레임 ");
		this.orderTopping=orderTopping;
		this.orderSuper=orderSuper;
		
	}

	//패널 생성 메소드
	@Override
	public void makePanel() {
		panel = new JPanel();
	}

	//버튼1 생성 및 기능 할당 메소드
	@Override
	public void makeButton1() {
		// TODO Auto-generated method stub
		btnCheeze = new Button("cheeze - 1000");
		btnCheeze.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// cheeze버튼 클릭 시 수행
				orderTopping.amount_price_increase(new Cheeze(orderSuper),1);
			}
		});
	}

	//버튼2 생성 및 기능 할당 메소드
	@Override
	public void makeButton2() {
		// TODO Auto-generated method stub
		btnMushroom = new Button("mushroom - 500");
		btnMushroom.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// mushroom버튼 클릭 시 수행
				orderTopping.amount_price_increase(new MushRoom(orderSuper),2);
				
			}
		});
	}

	//버튼3 생성 및 기능 할당 메소드
	@Override
	public void makeButton3() {
		// TODO Auto-generated method stub
		btnPaperony = new Button("paperony - 2000");
		btnPaperony.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// paperony버튼 클릭 시 수행
				orderTopping.amount_price_increase(new Peparony(orderSuper),3);
			}
		});

	}

	//버튼4 생성 및 기능 할당 메소드
	@Override
	public void makeButton4() {
		// TODO Auto-generated method stub
		btnExit = new Button("Quit");
		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//토핑 선택 끝 버튼 수행
				dispose();

			}
		});
	}
	//생성한 버튼 및 패널을 프레임에 등록 후 Viserble시키는 메소드
	@Override
	public void settingFrame() {
		// TODO Auto-generated method stub
		panel.add(btnCheeze);
		panel.add(btnMushroom);
		panel.add(btnPaperony);
		panel.add(btnExit);
		this.add(panel);
		setBounds(500, 500, 800, 200);
		setVisible(true);
	}

}