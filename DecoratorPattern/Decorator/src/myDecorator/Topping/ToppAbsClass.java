package myDecorator.Topping;

import myDecorator.Pizza.Pinterface;

public abstract class ToppAbsClass implements Pinterface{
	protected Pinterface pinterface;
	
	public ToppAbsClass(Pinterface pinterface) {
		this.pinterface=pinterface;
	}

	
	
}
