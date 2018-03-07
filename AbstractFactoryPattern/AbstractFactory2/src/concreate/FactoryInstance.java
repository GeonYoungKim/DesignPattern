package concreate;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;


public class FactoryInstance {

	public static GuiFactory getFactory() {
		switch (getOsCode()) {
		case 0:
			return new MacGuiFactory();
		case 1:
			return new LinuxGuiFactory();
		case 2:
			return new WinGuiFactory();
		}
		return null;
	}

	private static int getOsCode() {// TODO Auto-generated method stub
		
		if(System.getProperty("os.name").charAt(0)=='W') {
			return 2;
		}else if(System.getProperty("os.name").charAt(0)=='L') {
			return 1;
		}else {
			return 0;
		}
		
	}

}
class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("리눅스 버튼");
		
	}

}



class LinuxGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}

}
class LinuxTextArea implements TextArea{

	@Override
	public String getText() {
		
		return "리눅스 텍스트 에어리어";
	}

}
class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("맥 버튼 클릭");
		
	}

}
class MacGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new MacTextArea();
	}

}
class MacTextArea implements TextArea {

	@Override
	public String getText() {
		
		return "맥 텍스트 에어리어";
	}

}
class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("윈도우 버튼 클릭");
		
	}

}
class WinGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new WinTextArea();
	}

}
class WinTextArea implements TextArea {

	@Override
	public String getText() {
		
		return "윈도우 텍스트 에어리어";
	}

}

