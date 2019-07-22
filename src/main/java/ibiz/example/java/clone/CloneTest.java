package ibiz.example.java.clone;

public class CloneTest implements Cloneable {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
