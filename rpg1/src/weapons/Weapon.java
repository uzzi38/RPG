package weapons;

public class Weapon {
		protected String name;
		protected int weaponStrength;
		protected int magicStrength;
		protected double hitRate;

		public Weapon() {
		}

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
}