package spells;

public class Fire extends Spell{
	protected double burnRate;
	
	public Fire() {
		super("Fire");
		this.setHitRate(0.70);
		this.setSpecialRate(0.35);
	}
}
