package spells;

public class Poison extends Spell {
	double poisonRate;

	public Poison() {
		super("Poison");
		this.setHitRate(0.65);
		this.setSpecialRate(0.40);
	}
}
