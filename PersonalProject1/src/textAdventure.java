import java.util.Scanner;
import java.util.ArrayList;
public class textAdventure
	{
	public int startingGold = 500;
	public static void main(String[] args)
		{
		Character();
		location();
		townOptions();
			{
			
			}

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
				System.out.println("You have arrived at your desired location.");
				}
			}
		if(decision.equals(("no")))
					{
					System.out.println("Would you like to explore the area around you?");
					
					}
		}
		
		public static void townOptions()
			{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("You have arrived at a town, would you like to train or buy?");
			String options = keyboard.next();
			if(options.equals("train"))
				{
				System.out.println("You have decided to go to the town battle hall would you like to train abilities or attack?");
				String train = keyboard.next();
				if(train.equals("abilities"))
					{
					GameData.data.add(new GameData (3, GameData.data.get(0).getAbility()+1));
					System.out.println("Congratulations your ability power is now " + GameData.data.get(1).getAbility());
					}
				if(train.equals("attack"))
					{
					GameData.data.add(new GameData (GameData.data.get(0).getAttack()+1, GameData.data.get(0).getAttack()));
					System.out.println("Congratulations your attack power is now " + GameData.data.get(1).getAttack());
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
					System.out.println("He shows you the " + newBuy[buyRandomizer]);
					System.out.print(", the " + newBuy[buyRandomizer2]);
					System.out.print(", and the " + newBuy[buyRandomizer3]);
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
				
				}
			
			}
		}
	
