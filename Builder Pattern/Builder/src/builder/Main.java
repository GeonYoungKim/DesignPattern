package builder;

import builder2.ComputerBuilder;

public class Main {

	public static void main(String[] args) {
		
		//강좌 첫번째
		/*ComputerFactory factory=new ComputerFactory();
		factory.setBluePrint(new LgGramBluePrint());
		factory.make();
		Computer computer=factory.getComputer();
		
		System.out.println(computer.toString());*/
		
		
		//강좌 두번째
		builder2.Computer computer=ComputerBuilder
				.start()
				.setCpu("a")
				.setRam("asdf")
				.build();
		
		
		System.out.println(computer.toString());
		
	}

}
