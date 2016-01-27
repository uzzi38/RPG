package mainFiles;
import archetypes.Character;
public class Main {
	public static void main(String[] args) {
		characterCreation one = new characterCreation();
		Party party = new Party();
		System.out.println("Create your first character!!!");
		party.addPartyMember(0, one.createCharacter());
		System.out.println("Now your second");
		party.addPartyMember(1, one.createCharacter());
		System.out.println("Time to create your third");
		party.addPartyMember(2, one.createCharacter());
		System.out.println("And your final character");		
		party.addPartyMember(3, one.createCharacter());
		System.out.println(party.toString());
	}

}
