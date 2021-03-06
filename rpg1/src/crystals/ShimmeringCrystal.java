package crystals;

public class ShimmeringCrystal extends Crystal {
	protected double freezeRate, iceMultiplier;

	public ShimmeringCrystal() {
		super("ShimmeringCrystal");
		freezeRate = 0.40;
		iceMultiplier = 1.20;
	}
}
