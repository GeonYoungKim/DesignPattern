package factory;

abstract public class ItemCreator {
	
	public Potion create() {
		selectPotion();
		createLogPotion();
		Potion potion=createPotion();
		return potion;
		
	}
	abstract public void selectPotion();
	abstract public void createLogPotion();
	abstract public Potion createPotion();
	
}
