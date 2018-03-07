package bridge;

public class MorseCodeFuncCreator implements MorseCodeFunc{

	@Override
	public void dot() {
		System.out.print("*");
		
	}

	@Override
	public void dash() {
		System.out.print("-");
		
	}

	@Override
	public void space() {
		System.out.print(" ");
		
	}

}
