
public class ListVisitor extends Visitor{

//	private String currentdir;
	@Override
	public void visit(File file) {
		System.out.println("/"+file.getName());
		
	}

	@Override
	public void visit(Directory directory) {
		System.out.println("/"+directory.getName());
//		while(directory.iterate())
		
		directory.accept(this);
	}

}
