package builder;

public class LgGramBluePrint extends BluePrint {

	
	private Computer computer;
	public LgGramBluePrint() {
		// TODO Auto-generated constructor stub
		computer=new Computer("default", "default", "default");
	}
	@Override
	public void setCpu() {
		// TODO Auto-generated method stub
		computer.setCpu("17");
	}

	@Override
	public void setRam() {
		// TODO Auto-generated method stub
		computer.setRam("8g");
	}

	@Override
	public void setStorage() {
		// TODO Auto-generated method stub
		computer.setStorage("256g ssd");
	}
	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return computer;
	}

}
