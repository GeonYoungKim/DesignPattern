package factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemCreator creator=new HpCreator();
		Potion potion;
		potion=creator.create();
		potion.use();
		
		creator=new MpCreator();
		
		potion=creator.create();
		potion.use();
		
	}

}
