package UI;

import javax.swing.JFrame;

//템플릿 패턴을 적용시키기 위한 추상 클래스
public abstract class AbstrackFrame extends JFrame{
	public AbstrackFrame(String name) {
		super(name);
	}
	
	//조각조각 나눈 메소드를 모두 실행시키는 메소드
	public void create() {
		makePanel();
		makeButton1();
		makeButton2();
		makeButton3();
		makeButton4();
		settingFrame();
	}
	//자식클래스에서 정의해야할 메소드 무리
	abstract public void makePanel();
	abstract public void makeButton1();
	abstract public void makeButton2();
	abstract public void makeButton3();
	abstract public void makeButton4();
	abstract public void settingFrame();

}
