package myDecorator;

public class SingleTon {
    private static SingleTon singleTon = null;
    private int pizza_count;
    
    public SingleTon() {
    	pizza_count=0;
	}
    
    public static SingleTon getInstance() {
        if (singleTon == null) {
        	singleTon = new SingleTon();
        }
        return singleTon;
    }
    
    
	public int getPizza_count() {
		return pizza_count;
	}
	public void setPizza_count(int pizza_count) {
		this.pizza_count = pizza_count;
	}

    public void plus() {
    	this.pizza_count++;
    	
    }

}
