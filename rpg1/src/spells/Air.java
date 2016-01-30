package spells;

public class Air extends Spell{
	protected double buffetRate;

	public Air() {
		super();
		name = "Air";
		spellStrength = 2;
		hitRate = 0.85;
		buffetRate = 0.70;
	}
}
