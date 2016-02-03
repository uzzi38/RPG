package spells;

public class Barrier extends Spell {
	protected double defenceMultiplier;

	public Barrier() {
		name = "Barrier";
		defenceMultiplier = 1.30;
		this.setHitRate(0.80);
		
	}

}
