
public class Layout
	{
	static String [][] layout;
	
	public static void createLayout()
		{
			layout = new String [7][7];
			for(int i = 0; i < 7; i++)
				{
				for(int j =0; j < 7; j++)
					{
					layout [i][j] = "    ";
					}
				}
		}

	public static void display()
		{
		System.out.println("       1       2       3       4       5       6       7");
		System.out.println("   ---------------------------------------------------------");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("A  |  " + layout [0][0] +  " |  "  + layout [0][1] + " |  "   + layout [0][2] + " |  " + layout [0][3] + " |  " + layout [0][4] + " |  " + layout [0][5] + " |  " + layout [0][6] + " |  ");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("   ---------------------------------------------------------");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("B  |  " + layout [1][0] +  " |  "  + layout [1][1] + " |  "   + layout [1][2] + " |  " + layout [1][3] + " |  " + layout [1][4] + " |  " + layout [1][5] + " |  " + layout [1][6] + " |  ");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("   ---------------------------------------------------------");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("C  |  " + layout [2][0] +  " |  "  + layout [2][1] + " |  "   + layout [2][2] + " |  " + layout [2][3] + " |  " + layout [2][4] + " |  " + layout [2][5] + " |  " + layout [2][6] + " |  ");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("   ---------------------------------------------------------");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("D  |  " + layout [3][0] +  " |  "  + layout [3][1] + " |  "   + layout [3][2] + " |  " + layout [3][3] + " |  " + layout [3][4] + " |  " + layout [3][5] + " |  " + layout [3][6] + " |  ");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("   ---------------------------------------------------------");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("E  |  " + layout [4][0] +  " |  "  + layout [4][1] + " |  "   + layout [4][2] + " |  " + layout [4][3] + " |  " + layout [4][4] + " |  " + layout [4][5] + " |  " + layout [4][6] + " |  ");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("   ---------------------------------------------------------");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("F  |  " + layout [5][0] +  " |  "  + layout [5][1] + " |  "   + layout [5][2] + " |  " + layout [5][3] + " |  " + layout [5][4] + " |  " + layout [5][5] + " |  " + layout [5][6] + " |  ");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("   ---------------------------------------------------------");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("G  |  " + layout [6][0] +  " |  "  + layout [6][1] + " |  "   + layout [6][2] + " |  " + layout [6][3] + " |  " + layout [6][4] + " |  " + layout [6][5] + " |  " + layout [6][6] + " |  ");
		System.out.println("   |       |       |       |       |       |       |       |");
		System.out.println("   ---------------------------------------------------------");
		System.out.println();
		}	
	}