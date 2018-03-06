package myDecorator;

public class SingleTon {
    private static SingleTon singleTon = null;
    public static synchronized SingleTon getInstance() {
        if (singleTon == null) {
        	singleTon = new SingleTon();
        }
        return singleTon;
    }
    private int pizza_count;
    
	public int getPizza_count() {
		return pizza_count;
	}
	public void setPizza_count(int pizza_count) {
		this.pizza_count = pizza_count;
	}

    public void plus() {
    	this.pizza_count++;
    	System.out.println(this.pizza_count);
    }

}
