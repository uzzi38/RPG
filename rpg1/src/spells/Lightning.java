package spells;

public class Lightning extends Spell {
	protected double paralyseRate;
	
	public Lightning() {
		super();
		name = "Lightning";
		hitRate = 0.60;
		paralyseRate = 0.30;
	}

}
