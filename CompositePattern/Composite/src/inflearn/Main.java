package inflearn;

import my.Battlelion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Folder root=new Folder("root");
//		Folder home=new Folder("home");
//		Folder usr=new Folder("usr");
//		Folder gunyoung=new Folder("gunyoung");
//		Folder music=new Folder("music");
//		Folder picture=new Folder("picture");
//		Folder doc=new Folder("doc");
//		
//		File java=new File("java");
//		File track1=new File("track1");
//		File track2=new File("track2");
//		File pic1=new File("pic1");
//		File doc1=new File("doc1");
//		
//		root.addComponent(home);
//		root.addComponent(usr);
//		
//		usr.addComponent(java);
//		
//		home.addComponent(gunyoung);
//		
//		gunyoung.addComponent(music);
//		gunyoung.addComponent(picture);
//		gunyoung.addComponent(doc);
//		
//		music.addComponent(track1);
//		music.addComponent(track2);
//		
//		picture.addComponent(pic1);
//		
//		doc.addComponent(doc1);
		
		Battlelion pb_61=new Battlelion("pb_61");
		Battlelion dd_78=new Battlelion("dd_78");
		Battlelion dd_91=new Battlelion("dd_91");
		Battlelion dd_70=new Battlelion("dd_70");
		Battlelion dd_69=new Battlelion("dd_69");
		pb_61.addArmy(dd_69);
		pb_61.addArmy(dd_91);
		pb_61.addArmy(dd_70);
		pb_61.addArmy(dd_69);
		
		
		show(pb_61);
		
		
	}

	private static void show(Component root) {
		// TODO Auto-generated method stub
		
		System.out.println(root.getName());
		if(root instanceof /*Folder*/ Battlelion) {
			for(Component c: ((/*Folder*/Battlelion) root)./*getChild_component*/getArmy()) {
				show(c);
			}
		}
		
	}

}
