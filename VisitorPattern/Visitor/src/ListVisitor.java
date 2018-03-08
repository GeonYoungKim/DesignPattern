import java.util.Iterator;

public class ListVisitor extends Visitor{

	private String currentDir;
	
	public ListVisitor() {
		currentDir="";
	}
	@Override
	public void visit(File file) {
		System.out.println(currentDir+"/"+file.getName());
		
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(currentDir+"/"+directory.getName());
		
		String saveDir=currentDir;
		
		currentDir=currentDir+"/"+directory.getName();
		
		Iterator<Entry> entries=directory.iterate();
		
		while(entries.hasNext()) {
			entries.next().accept(this);
		}
		
		currentDir=saveDir;
		
	}

}
