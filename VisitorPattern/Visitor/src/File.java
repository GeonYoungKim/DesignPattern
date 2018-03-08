
public class File extends Entry {
	
	private String name;
	private int size;
	
	
	public File(String name, int size) {
		super();
		this.name = name;
		this.size = size;
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
		// TODO Auto-generated method stub
		return this.size;
	}

}
