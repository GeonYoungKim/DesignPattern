package chain;

public class SpecialSupport extends Support{

	public SpecialSupport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	final static int Special=24;
	
	
	@Override
	boolean resolve(Trouble trouble) {
		if(Special==trouble.getNumber()) {
			return true;
		}else {
			return false;
			
		}
	}

}
