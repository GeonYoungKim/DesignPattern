package my;

import java.util.ArrayList;
import java.util.List;

import inflearn.Component;

public class Battlelion extends Component {
	
	List<Component> army=new ArrayList<Component>();

	public Battlelion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void addArmy(Component component) {
		army.add(component);
	}
	public void removeArmy(Component component) {
		army.remove(component);
	}

	public List<Component> getArmy() {
		return army;
	}

}
