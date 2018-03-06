package myDecorator;
import java.util.Scanner;

public class PizzaDecoratorCreator extends Order {
	int pizzatotal = 0;
	PizzaDecoratorCreator Pizza;
	@Override
	public int gettotal() {
		super.total=super.gettotal()+addPizzaPrice();
		return super.total;
	};
	public int getPizzaPrice() {
		return this.pizzatotal;
	}
	public int addPizzaPrice() {
		
			System.out.println("피자 메뉴는 1. 콤비네이션(7000원), 2. 포테이토(8000원), 3. 고구마(9000원) 4.종료로 구성되어있습니다.");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
	
			if(select==1) {
				Pizza=new Combination();
				pizzatotal+=Pizza.getPizzaPrice();
			}else if(select==2) {
				Pizza=new Potato();
				pizzatotal+=Pizza.getPizzaPrice();
				
			}else if(select==3) {
				Pizza=new SweetPotato();
				pizzatotal+=Pizza.getPizzaPrice();
			}else {
				super.exit=true;
			}
		
		return pizzatotal;
	}
}
