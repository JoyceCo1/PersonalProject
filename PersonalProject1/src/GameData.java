import java.util.ArrayList;
public class GameData
	{
	int Attack;
	int Ability;
	
public GameData(int a, int ab)
	{
	Attack = a;
	Ability = ab;
	}

public int getAttack()
	{
	return Attack;
	}

public int getAbility()
	{
	return Ability;
	}

public void setAttack(int attack)
	{
	Attack = attack;
	}

public void setAbility(int ability)
	{
	Ability = ability;
	}

static ArrayList <GameData> data = new ArrayList<GameData>();
	
	}
