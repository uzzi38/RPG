package spells;

import archetypes.Character;

public class Heal extends Spell{
	protected double healRate;
	
	public Heal() {
		super();
		name = "Heal";
		hitRate = 0.80;
		healRate = 0.60;
		
	}
	
}
