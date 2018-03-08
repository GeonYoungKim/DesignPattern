package chain;

public class OddSuport extends Support{

	public OddSuport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean resolve(Trouble trouble) {
		if(trouble.getNumber()%2==1) {
			return true;
		}else {
			return false;
			
		}
	}

	
}
