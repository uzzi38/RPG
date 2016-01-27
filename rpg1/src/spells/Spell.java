package spells;

public class Spell {
	protected String name;
	protected int spellStrength;
	protected double hitRate;

	public Spell() {
		spellStrength = 5;
	}
	
	public String returnName() {
		return name;
	}

	public double getHitRate() {
		return hitRate;
	}
	
}
