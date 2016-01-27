package spells;

public class Fire extends Spell{
	protected double burnRate;
	
	public Fire() {
		super();
		name = "Fire";
		hitRate = 0.70;
		burnRate = 0.35;
	}

}
