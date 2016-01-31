package weapons;

import crystals.Crystal;
import java.util.List;

public class Weapon {
		protected String name;
		protected int weaponStrength, magicStrength;
		protected double hitRate;
		protected List<Crystal> cslot;

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
		
		public Crystal crystalSlot(Crystal c){
			if(cslot.size() < 2) {
				cslot.add(c);
			}
			else {
				return null;
			}
			return c;
		}
}
