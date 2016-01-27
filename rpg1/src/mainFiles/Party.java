package mainFiles;
import archetypes.Character;

public class Party {
	private Character[] party = new Character[4];
	public void addPartyMember(int i, Character c) {party[i] = c;}
	public Party (){}
	public String toString () {
		return  party[0].toString() + System.getProperty("line.separator") +
				party[1].toString() + System.getProperty("line.separator") +
				party[2].toString() + System.getProperty("line.separator") +
				party[3].toString();
	}
}
