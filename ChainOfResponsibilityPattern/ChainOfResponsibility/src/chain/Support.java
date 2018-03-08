package chain;

public abstract class Support {
	private String name;
	private Support next;
	
	public Support(String name) {
		this.name=name;
		next=null;
	}
	
	public String getName() {
		return name;
	}
	
	public Support getNext() {
		return next;
	}
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	
	public void support(Trouble trouble) {
		if(resolve(trouble)) {
			System.out.println(getName()+"해결");
		}else if(next !=null) {
			next.support(trouble);
		}else {
			System.out.println("어느 객체도 해결하지 못한다.");
		}
	}
	
	abstract boolean resolve(Trouble trouble);
	

}
