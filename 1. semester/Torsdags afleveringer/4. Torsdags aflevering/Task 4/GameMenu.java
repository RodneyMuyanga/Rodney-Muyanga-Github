import java.util.ArrayList;

public class GameMenu //entity class (behide the scenes).
{
	private ArrayList<String> actions; //Add a private instance variable, actions of type ArrayList<String>
	public GameMenu(ArrayList<String> actions)
	{
		this.actions = actions;
	}
	
	public void displayMenu()
	{
		System.out.println("Game Menu");
		for (int i = 0; i < actions.size(); i++)
		{
			System.out.println((i+1) + ". " + actions.get(i));
		}

	}
}