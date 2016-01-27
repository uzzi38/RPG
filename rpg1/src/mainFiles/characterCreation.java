package mainFiles;

import java.util.Scanner; import archetypes.*; import archetypes.Character;

public class characterCreation {
	public characterCreation(){};
	
	public Character createCharacter(){
		int p = chooseCharacter();
		while (p == 0){
			System.out.println("Please choose a class again, taking into acount spelling and capital letters.");
			p = chooseCharacter();
		}
		return nameCharacter(p);
	}
	private int chooseCharacter() {
		System.out.println(
				"Knight - A proud knight skilled in swordplay and supporting his allies. Whenever they mess up, they tend to have a nervous breakdown.");
		System.out.println(
				"Mage - One who commands the dark arts, bring ruin to all in their path. Known to have incredibly flashy 'Dark arts'"); // I'm cringing here >.<
		System.out.println(
				"Ranger - A recluse that has become one with the forest. In other words, a loner with only animal friends.");
		System.out.println(
				"Assasssin - Masters of stealth often noticed far too late. Easily lose-able in large crowds.");
		System.out.println(
				"Seer - A skilled brewer of all sorts of concoctions and user of magic. Lost their sanity from drinking the wrong potion too many times.");
		System.out.println(
				"Berserker - One who has traded their sanity for brute strength. An excellent conversationalist.");
		System.out.println(
				"Lancer - The knights launch themselves into the air before impaling enemies brutally. Missing a soft landing tends to break a few bones");
		System.out.println(
				"Monk - For years these monks would train in the mountain; honing their skills and focus. They also enjoy showing off their facial hair");
		@SuppressWarnings("resource")
		Scanner n = new Scanner(System.in);
		switch (n.nextLine()) {
			case "Knight":
				return 1;
			case "Mage":
				return 2;
			case "Ranger":
				return 3;
			case "Assassin":
				return 4;
			case "Seer":
				return 5;
			case "Berserker":
				return 6;
			case "Lancer":
				return 7;
			case "Monk":
				return 8;
			default:
				return 0;
		}
	}
	private Character nameCharacter(int c) {
		System.out.println("What do you want them to be called?");
		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
		switch (c) {
		case 1:
			return new Knight(k.nextLine());
		case 2:
			return new Mage(k.nextLine());
		case 3:
			return new Ranger(k.nextLine());
		case 4: 
			return new Assassin(k.nextLine());
		case 5:
			return new Seer(k.nextLine());
		case 6: 
			return new Berserker(k.nextLine());
		case 7:
			return new Lancer(k.nextLine());
		default:
			return new Monk(k.nextLine());
		}
	}
}
