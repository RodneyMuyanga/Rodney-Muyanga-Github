import java.util.ArrayList;
import java.util.Scanner;

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

	public String getAction()
	{
		System.out.println("Type a number to choose an action: ");
		for (int i = 0; i <options.size(); i++)
		{
			System.out.println((i+1) + ". " + options.get(i));
		}
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();

		return choice;
	}

	public static void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting the game...");
                break;
            case 2:
                System.out.println("Starting the game now");
                break;
            case 3:
                System.out.println("Fetching prevoisly saved game data");
                break;
            case 4:
                System.out.println("Game paused");
                break;
            default:
                System.out.println("Ending game");
        }
}