package factory;

import java.util.Date;

public class MpCreator extends ItemCreator{

	@Override
	public void selectPotion() {
		System.out.println("마력 물약 정보 조회");
		
	}

	@Override
	public void createLogPotion() {
		System.out.println("마력 물약 생성 날짜"+new Date());
		
	}

	@Override
	public Potion createPotion() {
		
		return new MpPotion();
	}
}
