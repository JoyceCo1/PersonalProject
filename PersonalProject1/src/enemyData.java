import java.util.Scanner;


public class enemyData
	{

	
	public static void dungeon()
	{
		System.out.println("You have entered the dungeon to face your destiny. There will be five floors and each will be more difficult, but each floor will have a different chance at random loot. In this dungeon you can not run away from the monsters that attack you.");
		{
            Scanner keyboard = new Scanner(System.in);		
			System.out.println("The monster attacks! Will you fight with attacks, magic, or try to counter it?");
			boolean fightContinues = true;
			do
			{
			String fightDecision = keyboard.next();
			if(fightDecision.equals ("magic"))
			{
				textAdventure.dungeonMonHealth = textAdventure.dungeonMonHealth - GameData.data.get(textAdventure.statCounter).getAbility();
				if(textAdventure.dungeonMonHealth <= 0)
				{
					System.out.println("You have defeated the monster, it dropped some gold on the ground.");
					textAdventure.startingGold = textAdventure.startingGold + (int)(Math.random()*200);
					System.out.println("You now have " + textAdventure.startingGold + " gold.");
					fightContinues = false;
					textAdventure.dungeonMonHealth = -1;
					//the fight continues even though the monster is dead
					
				}
				if(textAdventure.dungeonMonHealth >= 0)
				{
					System.out.println("The monster now has " + textAdventure.dungeonMonHealth + " health remaining. It now attacks you!");
					textAdventure.health = textAdventure.health - textAdventure.dungeonMonAttack;
					System.out.println("The monster hits you for " + textAdventure.dungeonMonAttack + " damage. You now have " + textAdventure.health + " remaining");
					if(textAdventure.health <=0)
					{
						System.out.println("You have been slain");
						System.exit(0);
					}
				}
			}
			if(fightDecision.equals("attacks"))
				{
				textAdventure.dungeonMonHealth = textAdventure.dungeonMonHealth - GameData.data.get(textAdventure.statCounter).getAttack();
				if(textAdventure.dungeonMonHealth <= 0)
					{
					System.out.println("You have lashed out and killed the monster, it dropped gold on the ground in its death throes.");
					textAdventure.startingGold = textAdventure.startingGold + (int)(Math.random()*200);
					System.out.println("You now have " + textAdventure.startingGold + " gold.");
					fightContinues = false;
					textAdventure.dungeonMonHealth = -1;
					}
				if(textAdventure.dungeonMonHealth >=0)
					{
					System.out.println("The monster now has " + textAdventure.dungeonMonHealth + " health remaining. It now attacks you!");
					textAdventure.health = textAdventure.health - textAdventure.dungeonMonAttack;
					System.out.println("The monster hits you for " + textAdventure.dungeonMonAttack + " damage. You now have " + textAdventure.health + " remaining.");
					if(textAdventure.health <= 0)
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
					textAdventure.startingGold = textAdventure.startingGold + (int)(Math.random()*200+1);
					System.out.println("You now have " + textAdventure.startingGold + " gold.");
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
	
	}
