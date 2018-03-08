package chain;

public class LimitSupport extends Support{
	
	public LimitSupport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	final static int LIMIT=10;
	
	@Override
	boolean resolve(Trouble trouble) {
		if(LIMIT>trouble.getNumber()) {
			return true;
		}else {
			return false;
			
		}
	}

}
