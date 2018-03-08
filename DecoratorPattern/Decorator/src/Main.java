import java.util.ArrayList;
import java.util.Scanner;

import UI.MainFrame;
import myDecorator.Order;
import myDecorator.PizzaDecorator;
import myDecorator.ToppingDecorator;

public class Main {
	
	public static void main(String[] args) {
		// 프로그램의 시작 하나의 메인 프레임 객체를 사용하여 사용자마다의 인스턴스를 관리하기 위하여 싱글톤 패턴으로 셍성 
		MainFrame.start();
	}

}
