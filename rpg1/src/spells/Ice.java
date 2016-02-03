package spells;

public class Ice extends Spell{
	protected double freezeRate;
	
	public Ice() {
		super();
		name = "Ice";
		this.setHitRate(0.75);
		this.setSpecialRate(0.40);
	}
}
