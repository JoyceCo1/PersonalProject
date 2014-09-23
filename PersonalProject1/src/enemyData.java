import java.util.Scanner;

public class enemyData
	{
	public static int levelCount = 0;
    String[] dungeonMonsters;
    dungeonMonsters = new String[4];
    dungeonMonsters[0] = "Skeleton Warrior";
    dungeonMonsters[1] = "Night Demon";
    dungeonMonsters[2] = "Ogre";
    dungeonMonsters[3] = "Great Demon";
    		
	
	public static void dungeon()
	{
		System.out.println("You have entered the dungeon to face your destiny. There will be five floors and you can not run away from the monsters.");
		{
		for(int i = 0; i<5; i++)
			{
			Scanner keyboard1 = new Scanner(System.in);
			if(levelCount == 3)
				{
				System.out.println("Congratulations you have reached the final level of the dungeon. Prepare to face the final monster on your quest.");
				System.out.println("Would you like to heal your character?");
				String heal = keyboard1.next();
				if(heal.equals("yes"))
					{
					textAdventure.health = 25;
					System.out.println("You have been healed to your full strength.");
					System.out.println("The final monster approaches you.");
					System.out.println("Prepare to fight, Gursev Master of the Dugneon.");
		            Scanner keyboard = new Scanner(System.in);		
					System.out.println("The monster attacks! Will you fight with attacks, magic, or try to counter it?");
					boolean fightContinues = true;
					do
					{
					String fightDecision = keyboard.next();
					if(fightDecision.equals ("magic"))
					{
						textAdventure.bossHealth = textAdventure.bossHealth - GameData.data.get(textAdventure.statCounter).getAbility();
						if(textAdventure.bossHealth <= 0)
						{
							System.out.println("You have summoned all of your magical ability and struck a killing blow on the Master of the Dungeon.");
							System.out.println("Congratulations, you have rid the world of this evil and embraced your destiny.");
							System.out.println("You have beaten the dungeon ending.");
							System.out.println("THE END");
							System.exit(0);
							fightContinues = false;
							textAdventure.bossHealth = -1;
		
							
						}
						if(textAdventure.bossHealth >= 0)
						{
							System.out.println("The monster now has " + textAdventure.bossHealth + " health remaining. It now attacks you!");
							textAdventure.health = textAdventure.health - textAdventure.bossAttack;
							System.out.println("The monster hits you for " + textAdventure.bossAttack + " damage. You now have " + textAdventure.health + " remaining");
							if(textAdventure.health <=0)
							{
								System.out.println("You have been slain");
								System.out.println("The Master of the Dungeon has finished you, and sets his sights on the rest of the world");
								System.out.println("GAME OVER");
								System.exit(0);
							}
						}
					}
					if(fightDecision.equals("attacks"))
						{
						textAdventure.bossHealth = textAdventure.bossHealth - GameData.data.get(textAdventure.statCounter).getAttack();
						if(textAdventure.bossHealth <= 0)
							{
							System.out.println("You use your superior strength and speed to dart around the Dungeon Master eventually finishing him.");
							System.out.println("You have finished the Dugneon Master and fulfilled your destiny. Congratulations");
							System.out.println("You finished the dungeon ending.");
							System.out.println("THE END");
							System.exit(0);
							fightContinues = false;
							textAdventure.bossHealth = -1;
							}
						if(textAdventure.bossHealth >=0)
							{
							System.out.println("The monster now has " + textAdventure.bossHealth + " health remaining. It now attacks you!");
							textAdventure.health = textAdventure.health - textAdventure.bossAttack;
							System.out.println("The monster hits you for " + textAdventure.bossAttack + " damage. You now have " + textAdventure.health + " remaining.");
							if(textAdventure.health <= 0)
								{
								System.out.println("The monster has struck back, fatally wounding you. You have been slain.");
								System.out.println("You were unable to fulfill your destiny.");
								System.out.println("GAME OVER");
								System.exit(0);
								}
							}
						}
					if(fightDecision.equals("counter"))
						{
						int dodgeChance = (int)(Math.random()*5+1);
						if(dodgeChance == (3))
							{
							System.out.println("You successfully evade the monster's attack and strike back, killing it instantly.");
							System.out.println("The Dungeon Master was no match for your incredibly quick reflexes. He was taken unawares and fell to your strength.");
							System.out.println("Congratulations you have beaten the dungeon ending.");
							System.out.println("THE END");
							System.exit(0);
							
							fightContinues = false;
							}
						else{
						System.out.println("You try to counter the monster's attack but fail to time it correctly, before you can recover the monster strings attacks one after the other on you until you finally die.");
						System.out.println("You were unable to match the Dungeon Master's reflexes and fell to him in battle");
						System.out.println("GAME OVER");
						System.exit(0);
						}
					}
					}
					
				while(fightContinues);
				}
					
				if(heal.equals("no"))
					{
					System.out.println("You have decided to fight the final monster in your weakened state, he will not be any easier.");
					System.out.println("The final monster approaches you.");
					System.out.println("Prepare to fight, Gursev Master of the Dugneon.");
		            Scanner keyboard = new Scanner(System.in);		
					System.out.println("The monster attacks! Will you fight with attacks, magic, or try to counter it?");
					boolean fightContinues = true;
					do
					{
					String fightDecision = keyboard.next();
					if(fightDecision.equals ("magic"))
					{
						textAdventure.bossHealth = textAdventure.bossHealth - GameData.data.get(textAdventure.statCounter).getAbility();
						if(textAdventure.bossHealth <= 0)
						{
							System.out.println("You have summoned all of your magical ability and struck a killing blow on the Master of the Dungeon.");
							System.out.println("Congratulations, you have rid the world of this evil and embraced your destiny.");
							System.out.println("You have beaten the dungeon ending without healing your character.");
							System.out.println("THE END");
							System.exit(0);
							fightContinues = false;
							textAdventure.bossHealth = -1;
		
							
						}
						if(textAdventure.bossHealth >= 0)
						{
							System.out.println("The monster now has " + textAdventure.bossHealth + " health remaining. It now attacks you!");
							textAdventure.health = textAdventure.health - textAdventure.bossAttack;
							System.out.println("The monster hits you for " + textAdventure.bossAttack + " damage. You now have " + textAdventure.health + " remaining");
							if(textAdventure.health <=0)
							{
								System.out.println("You have been slain");
								System.out.println("The Master of the Dungeon has finished you, and sets his sights on the rest of the world");
								System.out.println("GAME OVER");
								System.exit(0);
							}
						}
					}
					if(fightDecision.equals("attacks"))
						{
						textAdventure.bossHealth = textAdventure.bossHealth - GameData.data.get(textAdventure.statCounter).getAttack();
						if(textAdventure.bossHealth <= 0)
							{
							System.out.println("You use your superior strength and speed to dart around the Dungeon Master eventually finishing him.");
							System.out.println("You have finished the Dugneon Master and fulfilled your destiny. Congratulations");
							System.out.println("You finished the dungeon ending without healing your character.");
							System.out.println("THE END");
							System.exit(0);
							fightContinues = false;
							textAdventure.bossHealth = -1;
							}
						if(textAdventure.bossHealth >=0)
							{
							System.out.println("The monster now has " + textAdventure.bossHealth + " health remaining. It now attacks you!");
							textAdventure.health = textAdventure.health - textAdventure.bossAttack;
							System.out.println("The monster hits you for " + textAdventure.bossAttack + " damage. You now have " + textAdventure.health + " remaining.");
							if(textAdventure.health <= 0)
								{
								System.out.println("The monster has struck back, fatally wounding you. You have been slain.");
								System.out.println("You were unable to fulfill your destiny.");
								System.out.println("GAME OVER");
								System.exit(0);
								}
							}
						}
					if(fightDecision.equals("counter"))
						{
						int dodgeChance = (int)(Math.random()*5+1);
						if(dodgeChance == (3))
							{
							System.out.println("You successfully evade the monster's attack and strike back, killing it instantly.");
							System.out.println("The Dungeon Master was no match for your incredibly quick reflexes. He was taken unawares and fell to your strength.");
							System.out.println("Congratulations you have beaten the dungeon ending without healing your character.");
							System.out.println("THE END");
							System.exit(0);
							
							fightContinues = false;
							}
						else{
						System.out.println("You try to counter the monster's attack but fail to time it correctly, before you can recover the monster strings attacks one after the other on you until you finally die.");
						System.out.println("You were unable to match the Dungeon Master's reflexes and fell to him in battle");
						System.out.println("GAME OVER");
						System.exit(0);
						}
						}
					
					
				}
				while(fightContinues);
				}
					}
				
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
					System.out.println("You move from this level down to the next level.");
					levelCount++;
					
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
					System.out.println("You have slain this monster but more await. You move towards the next level of the dungeon");
					levelCount++;
					
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
					System.out.println("You have slain this monster, but more await you deeper in the dungeon. You go now to face them.");
					levelCount++;
					
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
	}
}
	


