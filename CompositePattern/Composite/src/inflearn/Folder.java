package inflearn;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{

	
	private List<Component> child_component=new ArrayList<Component>();
	public Folder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void addComponent(Component component) {
		child_component.add(component);
	}
	public void removeComponent(Component component) {
		child_component.remove(component);
	}

	public List<Component> getChild_component() {
		return child_component;
	}

	
	
	

}
