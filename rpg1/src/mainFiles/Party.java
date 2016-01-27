package mainFiles;
import archetypes.Character;

public class Party {
	private Character[] party = new Character[4];
	public void addPartyMember(int i, Character c) {party[i] = c;}
	public Party (){}
	public String toString () {
		return  party[0].toString() +
				party[1].toString() +
				party[2].toString() +
				party[3].toString();
	}
}
