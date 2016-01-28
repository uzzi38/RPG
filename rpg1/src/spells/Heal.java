package spells;

public class Heal extends Spell{
	protected double healRate;
	
	public Heal() {
		super();
		name = "Heal";
		hitRate = 0.99;
		healRate = 0.60;
		
	}

}
