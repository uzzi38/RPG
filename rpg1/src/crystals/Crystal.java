package crystals;

public class Crystal {
	protected String name;

	public Crystal(String name) {
		this.name = name;
	}
	
	public String returnName() {
		return name;
	}
	
	public Crystal returnCrystal(Crystal c) {
		return c;
	}
}
