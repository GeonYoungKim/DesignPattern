package mediator;

public class ConcreateMediator extends Mediator{

	@Override
	public void mediate(String data) {
		
		for(int i=0;i<getColleagues().size();i++) {
			getColleagues().get(i).handle(data);
		}
		
	}

}
