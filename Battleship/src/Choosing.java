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
			}
		case "F":
		case "f":
			{
			firstRowChoice = 5;
			}
		case "G":
		case "g":
			{
			firstRowChoice = 6;
			}
		}
	
	firstColumnChoice = Integer.parseInt(firstChoice.substring(1)) - 1;
	System.out.println();
	
		while (PlayGame.isValidMove());
}
		}
	

