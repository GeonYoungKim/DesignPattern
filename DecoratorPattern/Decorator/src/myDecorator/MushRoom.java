package myDecorator;
public class MushRoom extends ToppingDecoratorCreator{
	public MushRoom(Object ob) {
		super(ob);
		// TODO Auto-generated constructor stub
	}

	public int getToppingPrice() {
		return super.getToppingPrice()+500;
	}

}
