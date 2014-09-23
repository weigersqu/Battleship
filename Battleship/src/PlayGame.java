
public class PlayGame
	{
	static int row = 0;
	static int column = 0;
	public static void main(String[] args)
		{
		Layout.createLayout();
		Layout.display();
		Choosing.inputFirstChoice();
		}
		
		public static boolean isValidMove()
			{
			if (! Layout.layout [Choosing.firstRowChoice][Choosing.firstColumnChoice].equals("    "))
					
				{
				return true;
				}
			return false;
			}
		


		}

	
