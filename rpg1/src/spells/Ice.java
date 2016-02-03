package spells;

public class Ice extends Spell{
	protected double freezeRate;
	
	public Ice() {
		super("Ice");
		this.setHitRate(0.75);
		this.setSpecialRate(0.40);
	}
}
