package factory;

import java.util.Date;

public class HpCreator extends ItemCreator{

	@Override
	public void selectPotion() {
		System.out.println("체력 물약 정보 조회");
		
	}

	@Override
	public void createLogPotion() {
		System.out.println("체력 물약 생성 날짜"+new Date());
		
	}

	@Override
	public Potion createPotion() {
		
		return new HpPotion();
	}

}
