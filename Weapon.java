import java.util.Scanner;
public class Weapon {
	private int weapon;
	private int weaponStrength;
	private int magicStrength;
	private int hindrance;
	private String name;
	
	public Weapon(){}
	
	public void setName (String n) {name = n;}
	
	public String returnName () {return name;}
	public int pickWeapon(String w)
	{
		w = weapon;
		
		return weapon;
	}
	
	public int getWeaponStrength()
	{
		return weaponStrength;
	}
	
	public int setWeaponStrength(int x)
	{
		return weaponStrength;
	}
	
	public int getMagicStrength()
	{
		return magicStrength;
	}
	
	public int setMagicStrength(int y)
	{
		return magicStrength;
	}
	
	public int getHindrance()
	{
		return hindrance;
	}
	
	public void setHindrance(int z)
	{
		return hindrance;
	}
}
