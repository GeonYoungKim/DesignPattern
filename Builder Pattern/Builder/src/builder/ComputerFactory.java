package builder;

public class ComputerFactory {

	private BluePrint print;
	public void setBluePrint(BluePrint print) {
		this.print=print;
	}
	
	public void make() {
		// TODO Auto-generated method stub
		print.setCpu();
		print.setRam();
		print.setStorage();
	}

	public Computer getComputer() {
		// TODO Auto-generated method stub
		return print.getComputer();
	}
}
