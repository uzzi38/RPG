package spells;

public class Ice extends Spell{
	protected double freezeRate;
	
	public Ice() {
		super();
		name = "Ice";
		hitRate = 0.75;
		freezeRate = 0.40;
	}

}