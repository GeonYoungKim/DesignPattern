package myDecorator;

public class Combination extends PizzaDecoratorCreator {
	


	@Override
	public int getPizzaPrice() {
		return super.getPizzaPrice()+7000;
	}
	

}
