package mediator;

public class Main {
	public static void main(String[] args) {
		Mediator mediator=new ConcreateMediator();
		
		Colleague colleague1=new ConcreateColleague1();
		Colleague colleague2=new ConcreateColleague2();
		Colleague colleague3=new ConcreateColleague3();
		
		colleague1.registerMediator(mediator);
		colleague2.registerMediator(mediator);
		colleague3.registerMediator(mediator);
		
		colleague1.send("하잇!!!!");
		colleague1.send("원격이 아닌 클래스들간의 혹은 컴포넌트들간의 멀티 태스킹이 필요한 경우!!!!!!!!!!!!사용!!!!!");
		
		
	}
}
