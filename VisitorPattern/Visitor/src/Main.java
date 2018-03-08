
public class Main {

	public static void main(String[] args) {
		Directory rootdir=new Directory("root");
		Directory bindir=new Directory("bin");
		Directory tmpdir=new Directory("tmp");
		Directory usrdir=new Directory("usr");
		
		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(usrdir);

		
		bindir.add(new File("vi", 10));
		bindir.add(new File("latex", 20));
		
		rootdir.accept(new ListVisitor());
	}

}
