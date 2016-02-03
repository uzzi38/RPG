package archetypes;

public class Character {
	protected String name;
	protected int archetype;
	protected int strength, levelUpStrength;
	protected int magic, levelUpMagic;
	protected int defence, levelUpDefence;
	protected int speed, levelUpSpeed;
	protected int health, levelUpHP;
	protected int mana, levelUpMP;
	protected int level;
	protected int exp;
	protected int expToLevelUp;

	public Character(String n) {
		exp = 0;
		name = n;
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
		strength += levelUpStrength;
		magic += levelUpMagic;
		speed += levelUpSpeed;
		health += levelUpHP;
		mana += levelUpMP;
		defence += levelUpDefence;
		level++;
		expToLevelUp = (level*level)*10;
	}
	public int returnLevel()
	{
		return level;
	}
	@Override
	public String toString () {
		return "Name: "+ name +"       Status: Level = " + level +" Health = " + health + " Mana " + mana;
	}
	protected void setStats (int str, int def, int mag, int spd, int hp, int mp) {
		strength = str;
		levelUpStrength = str;
		magic = mag;
		levelUpMagic = mag;
		speed = spd;
		levelUpSpeed = spd;
		health = hp;
		levelUpHP = hp;
		mana = mp;
		levelUpMP = mp;
		defence = def;
		levelUpDefence = def;
	}
}
