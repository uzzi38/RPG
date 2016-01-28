package crystals;

public class IceCrystal extends Crystal{
	protected double freezeRate;
	protected double iceMultiplier;

	public IceCrystal() {
		super("IceCrystal");
		iceMultiplier = 1.20;
	}

}
