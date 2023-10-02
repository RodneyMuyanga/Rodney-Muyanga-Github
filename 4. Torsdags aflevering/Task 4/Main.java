import java.util.ArrayList;

public class Main //client class.
{
	public static void main(String[] args)
	{
		ArrayList<String> actions = new ArrayList<String>();

		GameMenu gameMenu = new GameMenu(actions); /*Still in the main method, instantiate the GameMenu class with the actions 
		reference as an argument to the constructor.*/

		/*create an ArrayList of type String called actions.*/
		actions.add("Start game");
		actions.add("Resume game");
		actions.add("Pause game");
		actions.add("End game");

		//Test print:
		System.out.println(actions.get(2));
		
		gameMenu.displayMenu();
	}
}