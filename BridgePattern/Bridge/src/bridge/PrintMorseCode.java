package bridge;

public class PrintMorseCode extends Morsecode {

	public PrintMorseCode(MorseCodeFunc morseCodeFunc) {
		super(morseCodeFunc);
		// TODO Auto-generated constructor stub
	}

	public PrintMorseCode g() {
		dash();
		dash();
		dot();
		space();
		return this;
	}

	public PrintMorseCode a() {
		dot();
		dash();
		space();
		return this;
	}

	public PrintMorseCode r() {
		dot();
		dash();
		dot();
		space();
		return this;
	}

	public PrintMorseCode m() {
		dash();
		dash();
		space();
		return this;
	}

}
