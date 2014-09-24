import java.util.Scanner;
public class Choosing
	{
	static String firstChoice;
	static String secondChoice;
	static int firstRowChoice, firstColumnChoice;
	public static void inputFirstChoice()
		{
		System.out.println("Please enter the row and column of your move (e.g. A1)");
		Scanner input = new Scanner(System.in);
		firstChoice = input.nextLine();
		switch (firstChoice.substring(0,1))
		{
		case "A":
		case "a":
			{
			firstRowChoice = 0;
			break;
			}
		case "B":
		case "b":
			{
			firstRowChoice = 1;
			break;
			}
		case "C": 
		case "c":
			{
			firstRowChoice = 2;
			break;
			}
		case "D": 
		case "d":
			{
			firstRowChoice = 3;
			break;
			}
		case "E":
		case "e":
			{
			firstRowChoice = 4;
			break;
			}
		case "F":
		case "f":
			{
			firstRowChoice = 5;
			break;
			}
		case "G":
		case "g":
			{
			firstRowChoice = 6;
			break;
			}
		}
	System.out.println("hi1");
	firstColumnChoice = Integer.parseInt(firstChoice.substring(1)) - 1;
	System.out.println();
		 
		
		
				
				System.out.println("hi2");
				System.out.println(Layout.layout[firstColumnChoice][firstRowChoice]);
				if (Layout.layout[firstRowChoice][firstColumnChoice].equals("X"))
					{
					System.out.println("hi3");
					System.out.println("You hit something");
					}
				else
					{
					System.out.println("hi4");
					System.out.println("You Missed! Try again");
					}
				
				System.out.println("hi5");
			
	}
}

		
	

