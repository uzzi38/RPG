package crystals;

public class BlessedCrystal extends Crystal{
	protected double healRate, healMultiplier;

	public BlessedCrystal() {
		super("BlessedCrystal");
		healRate = 0.60;
		healMultiplier = 1.20;
	}

}
