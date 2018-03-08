package mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
	
	private List<Colleague> colleagues;
	
	public Mediator() {
		colleagues=new ArrayList<Colleague>();
	}
	
	
	
	public List<Colleague> getColleagues() {
		return colleagues;
	}



	public void setColleagues(List<Colleague> colleagues) {
		this.colleagues = colleagues;
	}



	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
	}
	
	public abstract void mediate(String data);
	
}
