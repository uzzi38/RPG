package mainFiles;
import java.util.Arrays;
import java.util.Scanner;

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
	public void emptyParty() {
		Arrays.fill(party, null);
	}
	public void createParty() {
		characterCreation one = new characterCreation();
		System.out.println("Create your first character!!!");
		party[0] = one.createCharacter();
		System.out.println("Now your second");
		party[1] = one.createCharacter();
		System.out.println("Time to create your third");
		party[2] = one.createCharacter();
		System.out.println("And your final character");		
		party[3] = one.createCharacter();
		System.out.println(toString());
		System.out.println("Are you satisfied with this party? (Yes/No)");
		Scanner n = new Scanner(System.in);
		if (n.nextLine().equals("No")){
			emptyParty();
			createParty();
		}
	}
}
