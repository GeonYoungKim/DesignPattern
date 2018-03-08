package mediator;

public abstract class Colleague {

	private Mediator mediator;
	
	public void registerMediator(Mediator mediator) {
		this.mediator=mediator;
		mediator.addColleague(this);
	}
	
	public void send(String data) {
		mediator.mediate(data);
	}
	public abstract void handle(String data);

}
