package myDecorator;
import java.util.Scanner;

public class ToppingDecoratorCreator extends Order {
	int toppingtotal = 0;
	ToppingDecoratorCreator Topping;

	@Override
	public int gettotal() {
		super.total = super.gettotal() + addToppingPrice();
		return super.total;
	};

	public int getToppingPrice() {
		return this.toppingtotal;
	}

	private int addToppingPrice() {
		while (true) {
			System.out.println("토핑메뉴는 1. 치즈 추가(1000원), 2. 버섯 추가(500원), 3. 페퍼로니(2000), 4.종료로 구성되어있습니다.");
			Scanner sc = new Scanner(System.in);

			int select = sc.nextInt();

			if (select == 1) {

				Topping = new Cheeze();
				toppingtotal += Topping.getToppingPrice();
			} else if (select == 2) {

				Topping = new MushRoom();
				toppingtotal += Topping.getToppingPrice();
			} else if (select == 3) {

				Topping = new Peparony();
				toppingtotal += Topping.getToppingPrice();
			} else {
				break;
			}
			
		}
		return toppingtotal;

	}
}
