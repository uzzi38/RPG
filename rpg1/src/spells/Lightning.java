package spells;

public class Lightning extends Spell {
	protected double paralyseRate;
	
	public Lightning() {
		super();
		name = "Lightning";
		this.setHitRate(0.60);
		this.setSpecialRate(0.30);
	}
}
