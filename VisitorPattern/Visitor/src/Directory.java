import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry{
	private String name;
	List<Entry> dir;
	
	public Directory(String name) {
		super();
		this.name=name;
		dir=new ArrayList<Entry>();
	}
	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getSize() {
		int size=0;
		
		for(int i=0;i<dir.size();i++) {
			size+=dir.get(i).getSize();
		}
		return size;
	}

	@Override
	public void add(Entry entry) {
		dir.add(entry);
		
	}

	@Override
	public Iterator<Entry> iterate() {
		return dir.iterator();
	}
}
