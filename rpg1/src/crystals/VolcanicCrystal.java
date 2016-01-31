package crystals;

public class VolcanicCrystal extends Crystal {
	protected double burnRate, fireMultiplier;

	public VolcanicCrystal() {
		super("VolcanicCrystal");
		burnRate = 0.35;
		fireMultiplier = 1.20;
	}
}
