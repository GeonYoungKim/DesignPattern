import java.util.Iterator;

public abstract class Entry implements Element {
	
	abstract public String getName();
	abstract public int getSize();
	public void add(Entry entry) {
		System.out.println("여기 추상클래스야 add");
	}
	
	public Iterator<Entry> iterate() {
		System.out.println("여기 추상클래스야 iterate");
		return null;
	}
}
