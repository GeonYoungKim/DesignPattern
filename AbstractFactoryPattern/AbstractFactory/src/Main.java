import Sam.SamFactory;
import abs.BikeFactory;
import abs.Body;
import abs.Wheel;

public class Main {
	public static void main(String[] args) {
		BikeFactory factory=new SamFactory();
		
		Body body= factory.createBody();
		Wheel wheel=factory.createWheel();
		
		
	}

}
