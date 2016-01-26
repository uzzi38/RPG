package weapons;

public class Crossbow extends Weapon{
	public Crossbow() {
		super();
		weaponStrength = 6;
		name = "Crossbow";
		hitRate = 0.8;
		/** Archer skills can only be used with crossbow */
	}
}
