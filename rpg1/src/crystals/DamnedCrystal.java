package crystals;

public class DamnedCrystal extends Crystal {
	protected double poisonRate, poisonMultiplier;
	
	public DamnedCrystal() {
		super("DamnedCrystal");
		poisonRate = 0.40;
		poisonMultiplier = 1.20;
	}
}
