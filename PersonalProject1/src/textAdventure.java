import java.util.Scanner;
import java.util.ArrayList;
public class textAdventure
	{
	public static int startingGold = 500;
	public static int health = 25;
	public static int monHealth = 10; 
	public static int bossHealth = 25; 
	public static int monAttack = 4; 
	public static int bossAttack = 15;
	public static int statCounter = 0;
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
				System.out.println("Congratulations " + name + " you are a " + class1 + " with " + GameData.data.get(statCounter).getAttack() + " attack skill and " + GameData.data.get(statCounter).getAbility() + " ability power!");
		
				}
			if(class1.equals("warrior"))
				{
				GameData.data.add(new GameData (10, 3));
				System.out.println("Congratulations " + name + " you are a " + class1 + " with " + GameData.data.get(statCounter).getAttack() + " attack skill and " + GameData.data.get(statCounter).getAbility() + " ability power!");
			
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
							        System.exit(0);
								}
							}
						}
						if(explore.equals("no"))
							{
							System.out.println("You have decided against doing anything at all. Probably safe, as it would be dangerous to move from this location. You decide to live a life of woeful inadaquecy until you pass away without leaving this trusty safe spot.");
							System.exit(0);
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
				if(startingGold < 100)
					{
					System.out.println("I'm sorry but you can't train without at least 100 gold.");
					townOptions();
					}
				System.out.println("You have decided to go to the town battle hall would you like to train abilities or attack?");
				String train = keyboard.next();
				if(train.equals("abilities"))
					{				
					GameData.data.add(new GameData (3, GameData.data.get(statCounter).getAbility()+1));
					statCounter = statCounter + 1;
					System.out.println("Congratulations your ability power is now " + GameData.data.get(statCounter).getAbility() + " this has costed you 100 of your " + startingGold + " gold.");
					startingGold = startingGold - 100; 
					townOptions();
					}
				if(train.equals("attack"))
					{
					GameData.data.add(new GameData (GameData.data.get(statCounter).getAttack()+1, GameData.data.get(statCounter).getAbility()));
					statCounter = statCounter + 1; 
					System.out.println("Congratulations your attack power is now " + GameData.data.get(statCounter).getAttack() + " this has costed you 100 of your " + startingGold + " gold.");
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
					System.out.println("You make your way over to the physical item salesman, who is showing you three items. A dagger, sword, and mace.");
					
				}
			if(options.equals("explore"))
				{
				Scanner keyboard2 = new Scanner(System.in);
				System.out.println("You find yourself wandering the town when you come across a giant pit in the middle of the town square. Someone explains to you that this is the legendary Dungeon of Horrors. It descends 5 floors and on each floor more powerful monsters will attack you, but you will also find better treasure. Will you enter the dungeon?");
				String dungeonDecision = keyboard2.next();
				if(dungeonDecision.equals("yes"));
					{
					System.out.println("You descend into the Dungeon of Horrors, eager to seek your destiny.");
					// insert dungeon method here 
					}
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
				System.out.println("You have decided to run away from the " + newFight[enemyRandomizer] + " if you are successful you will escape, but drop half of your remaining gold in haste, if you are unsuccessful the monster will get a free attack on you.");
				int run = (int)(Math.random()*2 + 1);
				if(run == 1)
				{
					startingGold = startingGold/2;
					System.out.println("You have escaped the monster, however now you only have " + startingGold + " gold remaining.");
					location();
				}
				if(run == 2)
				{
					Scanner keyboard1 = new Scanner(System.in);
					System.out.println("You have failed to escape, the monster will now attack you.");
					health = health - monAttack;
					System.out.println("The monster has attacked you for " + monAttack + " damage, leaving you with " + health + " health remaining");
					combat();
				}
				}
			if(decision.equals ("fight"))
				{
				combat();
				}
			
			}
		
		public static void Dungeon()
		{
		System.out.println("You have entered the dungeon.");
		
		}
		
	public static void combat()
		{
            Scanner keyboard = new Scanner(System.in);		
			System.out.println("The monster attacks! Will you fight with attacks, magic, or try to counter it?");
			boolean fightContinues = true;
			do
			{
			String fightDecision = keyboard.next();
			if(fightDecision.equals ("magic"))
			{
				monHealth = monHealth - GameData.data.get(statCounter).getAbility();
				if(monHealth <= 0)
				{
					System.out.println("You have defeated the monster, it dropped some gold on the ground.");
					startingGold = startingGold + (int)(Math.random()*200);
					System.out.println("You now have " + startingGold + " gold.");
					fightContinues = false;
					//the fight continues even though the monster is dead
					
				}
				if(monHealth >= 0)
				{
					System.out.println("The monster now has " + monHealth + " health remaining. It now attacks you!");
					health = health - monAttack;
					System.out.println("The monster hits you for " + monAttack + " damage. You now have " + health + " remaining");
					if(health <=0)
					{
						System.out.println("You have been slain");
						System.exit(0);
					}
				}
			}
			if(fightDecision.equals("attacks"))
				{
				monHealth = monHealth - GameData.data.get(statCounter).getAttack();
				if(monHealth <= 0)
					{
					System.out.println("You have lashed out and killed the monster, it dropped gold on the ground in its death throes.");
					startingGold = startingGold + (int)(Math.random()*200);
					System.out.println("You now have " + startingGold + " gold.");
					fightContinues = false;
					}
				if(monHealth >=0)
					{
					System.out.println("The monster now has " + monHealth + " health remaining. It now attacks you!");
					health = health - monAttack;
					System.out.println("The monster hits you for " + monAttack + " damage. You now have " + health + " remaining.");
					if(health <= 0)
						{
						System.out.println("The monster has struck back, fatally wounding you. You have been slain.");
						System.exit(0);
						}
					}
				}
			if(fightDecision.equals("counter"))
				{
				int dodgeChance = (int)(Math.random()*5+1);
				if(dodgeChance == (3))
					{
					System.out.println("You successfully evade the monster's attack and strike back, killing it instantly. It dropped some gold on the ground before dying.");
					startingGold = startingGold + (int)(Math.random()*200+1);
					System.out.println("You now have " + startingGold + " gold.");
					fightContinues = false;
					}
				else{
				System.out.println("You try to counter the monster's attack but fail to time it correctly, before you can recover the monster strings attacks one after the other on you until you finally die.");
				System.exit(0);
				}
				}
			
			
		}
		while(fightContinues);
		}
	}
	
