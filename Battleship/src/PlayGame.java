
public class PlayGame
	{
	static int row = 0;
	static int column = 0;
	public static void main(String[] args)
		{
		Layout.createLayout();
		Layout.display();
		Ship.shipData();
		PlaceShipsMethod.placeShips();
		System.out.println("Welcome to Battleship!");
		Choosing.inputFirstChoice();
		}
		
		public static boolean isValidMove()
			{
			System.out.println(Layout.layout [Choosing.firstRowChoice][Choosing.firstColumnChoice]);
			if (! Layout.layout [Choosing.firstRowChoice][Choosing.firstColumnChoice].equals("    "))
					
				{
				return true;
				}
			return false;
			}
		


		}

	
