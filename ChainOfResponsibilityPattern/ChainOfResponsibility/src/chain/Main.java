package chain;

public class Main {
	public static void main(String[] args) {
		Support s1=new NoSupport("no");
		
		s1.setNext(new SpecialSupport("special")).setNext(new OddSuport("odd")).setNext(new LimitSupport("limit"));
		
		for(int i=0;i<25;i++) {
			s1.support(new Trouble(i));
		}
	}

}
