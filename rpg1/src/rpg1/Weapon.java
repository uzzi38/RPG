package rpg1;

public class Weapon {
		protected int weaponStrength;
		protected int magicStrength;
		protected String name;
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
