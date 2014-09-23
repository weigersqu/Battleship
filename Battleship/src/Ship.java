import java.util.ArrayList;
import java.util.Scanner;
public class Ship
	{
	int shipValue;
	String shipName;
	static ArrayList <Ship> data = new ArrayList <Ship>();
	public Ship(String sn, int sv)
		{
		shipValue = sv;
		shipName = sn;
		}
		
	public static void main(String[] args)
		
		
			{
		data.add(new Ship("Aircraft carrier" , 4));
		data.add(new Ship("Battleship", 3));
		data.add(new Ship("Submarine", 2));
		
		
			}
	}
