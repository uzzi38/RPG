package spells;

public class Spell {
	protected String name;
	protected int spellStrength;
	protected double hitRate;
	protected double specialRate;
	
	public Spell(String name) {
		this.name = name;
		spellStrength = 5;
	}
	
	public String returnName() {
		return name;
	}

	protected void setHitRate(double hR) {
		hitRate = hR;
	}
	
	protected void setSpecialRate(double sR) {
		specialRate = sR;
	}
}
