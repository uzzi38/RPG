package archetypes;

public class Character {
	protected String name;
	protected int archetype;
	protected int strength, levelUpStrengthBoost;
	protected int magic, levelUpMBoost;
	protected int defence, levelUpDefenceBoost;
	protected int speed, levelUpSpeedBoost;
	protected int health, levelUpHPBoost;
	protected int mana, levelUpMPBoost;
	protected int level;
	protected int exp;
	protected int expToLevelUp;

	public Character() {
		exp = 0;
	}
	public void setName(String n){
		name = n;
	}
	public String returnName() {
		return name;
	}
	public void levelUp()
	{
		strength += levelUpStrengthBoost;
		magic += levelUpMBoost;
		speed += levelUpSpeedBoost;
		health += levelUpHPBoost;
		mana += levelUpMPBoost;
		defence += levelUpDefenceBoost;
		level++;
	}
	public int returnLevel()
	{
		return level;
	}
	@Override
	public String toString () {
		return "Name: "+ name +"       Status: Health = " + health + " Mana " + mana;
	}
	protected void setStats (int str, int def, int mag, int spd, int hp, int mp) {
		strength = str;
		magic = mag;
		speed = spd;
		health = hp;
		mana = mp;
		defence = def;
	}
}
