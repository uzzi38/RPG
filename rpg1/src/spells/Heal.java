package spells;

public class Heal extends Spell{
	protected double healRate;
	
	public Heal() {
		super("Heal");
		this.setHitRate(0.99);
		this.setSpecialRate(0.60);
		
	}

}
