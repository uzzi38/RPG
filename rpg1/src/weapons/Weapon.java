package weapons;

import crystals.Crystal;
import java.util.List;

public class Weapon {
		protected String name;
		protected int weaponStrength, magicStrength;
		protected double hitRate;
		protected Crystal cSlot;

		public Weapon() {}

		public String returnName() {
			return name;
		}

		public int getWeaponStrength() {
			return weaponStrength;
		}

		public int getMagicStrength() {
			return magicStrength;
		}
		
		public double returnHitRate() {
			return hitRate;
		}
		
		public void addCrystal(Crystal c) {
			c = cSlot;
		}
}
