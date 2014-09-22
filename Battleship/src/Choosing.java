import java.util.Scanner;
public class Choosing
	{
	static String firstChoice;
	static int firstRowChoice, firstColumnChoice;
	public static void inputFirstChoice()
		{
		System.out.println("Please enter the row and column of your move (e.g. A1)");
		Scanner input = new Scanner(System.in);
		firstChoice = input.nextLine();
		int randomNumber = (int) (Math.random() * 2) + 1;
		switch (randomNumber)
		{
		
		case 1:
			{
			Layout.layout[1][2] = "X";
			Layout.layout[1][3] = "X";
			Layout.layout[1][4] = "X";		
			break;
			}
		case 2:
			{
			Layout.layout[2][2] = "X";
			Layout.layout[2][3] = "X";
			Layout.layout[2][4] = "X";
			break;
			}
		case 3:
			{
			Layout.layout[3][2] = "X";
			Layout.layout[3][3] = "X";
			Layout.layout[3][4] = "X";
			break;
			}
		
		}
		

	}
	
	}
