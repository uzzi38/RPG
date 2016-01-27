package mainFiles;
import archetypes.Character;
public class Main {
	private static Character[] party = new Character[4];
	public static void main(String[] args) {
		characterCreation one = new characterCreation();
		System.out.println("Create your first character!!!");
		party[0] = one.createCharacter();
		
	}

}
