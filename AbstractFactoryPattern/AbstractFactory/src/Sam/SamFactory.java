package Sam;

import abs.BikeFactory;
import abs.Body;
import abs.Wheel;

public class SamFactory implements BikeFactory{

	@Override
	public Body createBody() {
		
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		
		return new SamWheel();
	}

}
