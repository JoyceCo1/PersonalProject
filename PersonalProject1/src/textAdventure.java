import java.util.Scanner;
import java.util.ArrayList;
public class textAdventure
	{
	public static int startingGold = 500;
	public static void main(String[] args)
		{
		Character();
		location();
		townOptions();
		}

	public static void Character()
		{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Would you please enter your name?");
		String name = keyboard.next();
		System.out.println("Thank you " + name + " would you like to be a warrior or a mage?");
		String class1 = keyboard.next();
			if(class1.equals("mage"))
				{
				GameData.data.add(new GameData (3, 10));
				System.out.println("Congratulations " + name + " you are a " + class1 + " with " + GameData.data.get(0).getAttack() + " attack skill and " + GameData.data.get(0).getAbility() + " ability power!");
		
				}
			if(class1.equals("warrior"))
				{
				GameData.data.add(new GameData (10, 3));
				System.out.println("Congratulations " + name + " you are a " + class1 + " with " + GameData.data.get(0).getAttack() + " attack skill and " + GameData.data.get(0).getAbility() + " ability power!");
			
				}
			
		}
	
	public static void location()
		{
		Scanner keyboard = new Scanner(System.in);
		String[] newLocation = {"Grimlock", "Arior", "Turnol", "Orios", "Skaren", "Toro", "Ryuus",};
		int locationRandomizer = (int)(Math.random()*7);
		
		System.out.println("You seem to be close to a town, would you like to go to " + newLocation[locationRandomizer] + "?");
		String decision = keyboard.next();
		
		if(decision.equals ("yes"))
			{
			int fightRandomizer1 = (int)(Math.random()*2+1);
			if(fightRandomizer1 == 2)
				{
				int fightDetermine = 1;
				fightScreen();
				}
			if(fightRandomizer1 == 1)
				{
				System.out.println("You have arrived at " + newLocation[locationRandomizer] + ".");
				}
			}
		if(decision.equals(("no")))
					{
					System.out.println("Would you like to explore the area around you?");
					Scanner keyboard3 = new Scanner(System.in);
					String explore = keyboard3.next();
					if(explore.equals("yes"));
						{
						System.out.println("You have decided to wander into the Grim Woods, opposite the nearest town. This is a place of evil magic, to defeat the darkness here you have to clear out 4 different Dark Shrines and fight the greater Dark Mage. Will you enter?");
						Scanner keyboard4 = new Scanner(System.in);
						String enterWoods = keyboard4.next();
						if(enterWoods.equals("yes"))
							{
							System.out.println("You are swallowed into the darkness of the woods, seeking to destroy the evil there, and meet your destiny.");
							// run the forest method which will be similar to the dungeon except only 4 areas, not 10, use different monsters, make them stronger, less chance of healing fountain. 
							}
						if(enterWoods.equals("no"))
							{
							System.out.println("You have avoided successfully avoided your destiny, however the evil in the world will continue to grow until it over-runs the last citadels for good.");
							System.out.println("You have allowed evil to triumph. Will you play again?");
							Scanner keyboard5 = new Scanner(System.in);
							String playAgain = keyboard5.next();
							if(playAgain.equals("yes"))
								{
								Character();
								location();
								townOptions();
								}
							if(playAgain.equals("no"))
								{
								// put the method that exits the program here 
								}
							}
						}
						if(decision.equals("no"))
							{
							System.out.println("You have decided against doing anything at all. Probably safe, as it would be dangerous to move from this location. You decide to live a life of woeful inadaquecy until you pass away without leaving this trusty safe spot.");
							//insert method that exits the program here
							}
					}
		}
		
		public static void townOptions()
			{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Would you like to train, buy, or explore?");
			String options = keyboard.next();
			if(options.equals("train"))
				{
				System.out.println("You have decided to go to the town battle hall would you like to train abilities or attack?");
				String train = keyboard.next();
				if(train.equals("abilities"))
					{
					GameData.data.add(new GameData (3, GameData.data.get(0).getAbility()+1));
					System.out.println("Congratulations your ability power is now " + GameData.data.get(1).getAbility() + " this has costed you 100 of your " + startingGold + " gold.");
					startingGold = startingGold - 100; 
					townOptions();
					}
				if(train.equals("attack"))
					{
					GameData.data.add(new GameData (GameData.data.get(0).getAttack()+1, GameData.data.get(0).getAttack()) + "this has costed you 100 of your " + startingGold + " gold.");
					System.out.println("Congratulations your attack power is now " + GameData.data.get(1).getAttack());
					startingGold = startingGold - 100; 
					townOptions();
					}
				}
			if(options.equals("buy"))
				{
				Scanner keyboard1 = new Scanner(System.in);
				System.out.println("You arrive at the town market, would you like to shop for magic or physical items?");
				String buy = keyboard1.next();
				if(buy.equals("physical"));
					{
					System.out.println("You make your way over to the physical item salesman, who is showing you three items.");
					String[] newBuy = {"Sword", "Rapier", "Axe", "Mace", "Halberd", "Big Club", "Dagger",};
					int buyRandomizer = (int)(Math.random()*7);
					int buyRandomizer2 = (int)(Math.random()*7);
					int buyRandomizer3 = (int)(Math.random()*7);
					// consider having set items that cost different prices with set stats. 
					System.out.println("He shows you the " + newBuy[buyRandomizer]);
					System.out.print(", the " + newBuy[buyRandomizer2]);
					System.out.print(", and the " + newBuy[buyRandomizer3]);
					}
				}
			if(options.equals("explore"))
				{
				Scanner keyboard2 = new Scanner(System.in);
				System.out.println("You find yourself wandering the town when you come across a giant pit in the middle of the town square. Someone explains to you that this is the legendary Dungeon of Horrors. It descends ten floors and on each floor more powerful monsters will attack you, but you will also find better treasure. Will you enter the dungeon?");
				String dungeonDecision = keyboard2.next();
				if(dungeonDecision.equals("yes"));
					{
					System.out.println("You descend into the Dungeon of Horrors, eager to seek your destiny.");
					// insert dungeon method here 
					}
				}
			}
		
		public static void fightScreen()
			{
			Scanner keyboard = new Scanner(System.in);
			String[] newFight = {"Goblin", "Wolf", "Bandit", "Demon", "Golem", "Ancient Warrior", "Shadow Beast",};
			int enemyRandomizer = (int)(Math.random()*7);
			System.out.println("You have encountered a " + newFight[enemyRandomizer] + " will you fight or run?");
			String decision = keyboard.next();
			if(decision.equals ("run"))
				{
				//create a consequence for running
				}
			if(decision.equals ("fight"))
				{
				// make sure the creature can attack and you can lose health, and vice versa. Gold is randomly dropped by creatures. After 5 fights a stat will increase by one. 
				}
			
			}
		}
	
