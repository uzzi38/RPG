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
		level = 1;
		expToLevelUp = 20;
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
		expToLevelUp = (level*level)*10;
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
		levelUpStrengthBoost = str;
		magic = mag;
		levelUpMBoost = mag;
		speed = spd;
		levelUpSpeedBoost = spd;
		health = hp;
		levelUpHPBoost = hp;
		mana = mp;
		levelUpMPBoost = mp;
		defence = def;
		levelUpDefenceBoost = def;
	}
}
