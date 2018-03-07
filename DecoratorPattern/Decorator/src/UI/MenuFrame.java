package UI;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import myDecorator.Order;
import myDecorator.SingleTon;
import myDecorator.Pizza.Combination;
import myDecorator.Pizza.Potato;
import myDecorator.Pizza.SweetPotato;

//템플릿 패턴의 자식 클래스 -> 조각조각인 추상 메소드들 작성해야 한다.
public class MenuFrame extends AbstrackFrame{
	JPanel panel;
	Button combination_btn;
	Button potato_btn;
	Button sweetpotato_btn;
	Button exit_btn;
	Order pizza_order,super_order;
	SingleTon singleton=SingleTon.getInstance();
	
	//생성자
	public MenuFrame(Order pizza_order,Order super_order) {
		// TODO Auto-generated constructor stub
		super("메뉴 프레임");
		this.pizza_order=pizza_order;
		this.super_order=super_order;
		
		
	}
	//패널 생성 메소드
	@Override
	public void makePanel() {
		// TODO Auto-generated method stub
		panel=new JPanel();
	}
	
	//버튼1 생성 및 기능 할당 메소드
	@Override
	public void makeButton1() {
		// TODO Auto-generated method stub
		combination_btn=new Button("Combination - 7000");
		combination_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				//Combination 버튼 클릭 시 수행
				pizza_order.amount_price_increase(new Combination(),1);
				
			}
		});
	}

	//버튼2 생성 및 기능 할당 메소드
	@Override
	public void makeButton2() {
		// TODO Auto-generated method stub
		potato_btn=new Button("Potato - 8000");
		potato_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Potato 버튼 클릭 시 수행
				pizza_order.amount_price_increase(new Potato(),2);
				
			}
		});
	}

	//버튼3 생성 및 기능 할당 메소드
	@Override
	public void makeButton3() {
		// TODO Auto-generated method stub
		sweetpotato_btn=new Button("Sweet_potato - 9000");
		sweetpotato_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Sweet_potato 버튼 클릭 시 수행
				pizza_order.amount_price_increase(new SweetPotato(),3);
			}
		});
	}

	//버튼4 생성 및 기능 할당 메소드
	@Override
	public void makeButton4() {
		// TODO Auto-generated method stub
		exit_btn=new Button("Quit");
		exit_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//피자를 그만 고른다는것은 주문이 끝났다는 것을 의미
				System.out.println("총 판매 피자 갯수는 "+singleton.getPizza_count());
				System.out.println("총 주문 금액은 무엇입니다."+super_order.getPriceTotal(super_order));
				dispose();
				
			}
		});
	}

	//생성한 버튼 및 패널을 프레임에 등록 후 Viserble시키는 메소드
	@Override
	public void settingFrame() {
		// TODO Auto-generated method stub

		panel.add(combination_btn);
		panel.add(potato_btn);
		panel.add(sweetpotato_btn);
		panel.add(exit_btn);
		this.add(panel);
		setBounds(300, 300, 800, 200);
		setVisible(true);
	}
	
}