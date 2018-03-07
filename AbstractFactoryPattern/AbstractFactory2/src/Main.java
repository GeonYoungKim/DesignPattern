import abst.Button;
import abst.GuiFactory;
import abst.TextArea;
import concreate.FactoryInstance;

public class Main {

	public static void main(String[] args) {
		
		GuiFactory factory=FactoryInstance.getFactory();
		
		Button button=factory.createButton();
		TextArea area=factory.createTextArea();
		
		System.out.println(area.getText());
		button.click();
		
		
	}

}
