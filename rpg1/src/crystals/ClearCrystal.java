package crystals;

public class ClearCrystal extends Crystal {
	protected double healRate;
	protected double healMultiplier;

	public ClearCrystal() {
		super("ClearCrystal");
		healMultiplier = 1.20;
	}
}
