package crystals;

public class FireCrystal extends Crystal {
	protected double burnRate;
	protected double fireMultiplier;

	public FireCrystal() {
		super("FireCrystal");
		fireMultiplier = 1.20;
	}
}
