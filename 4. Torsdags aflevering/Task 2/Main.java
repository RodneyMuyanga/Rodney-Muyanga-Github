import java.util.Scanner;

public class Main
{
	String name;
	int age;
	int yearsLeft;


	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

			System.out.println("Plaese type your name.");
			String input = scanner.nextLine();


			System.out.println("Plaese type your age.");
			String age = scanner.nextLine();
				int i = Integer.parseInt(age);
			
			int yearsLeft = 67 - i;
			if(i < 67)
			{
				
				System.out.println("You have " + yearsLeft + " years left, before retirement.");
			
			}else if(i == 67)
			{
				System.out.println("Your age is: " + i + ". You can retire, thanks for your service.");

			}else{
				System.out.println("You're retired, enjoy life.");
			}

	}

}