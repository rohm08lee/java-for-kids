import java.util.*;


public class G20
{                                                                                 
	public static void main(String[] args)
	{
		int i, j, k, size, end, number, temp;
		int x, y, direction, direction_temp;
		int[] a;
		int[][] spiral;//declaration
		boolean coincide;
		Random r;
		final int None = -1;
		final int Right = 10;
		final int Left = 20;
		final int Up = 30;
		final int Down = 40;
		r = new Random();
		a = new int [100];
		number = r.nextInt(200 + 1);
		
		for (size = 10; size <= 10; size = size + 1)
		{
			spiral = new int[size][size];// construction
			
			for (i = 0; i < size; i = i + 1)// initialization
			{
				for (j = 0; j < size; j = j + 1)
				{
					spiral[i][j] = None;
				}
			}
			
			for (i = 0; i <= 99; i = i + 1) // filling up and making sure there is no coincide
			{
				for ( ; true; )
				{
					coincide = false;
					number = r.nextInt(199) + 1;
					
					for (j = 0; j <= i - 1; j = j + 1)
					{
						if (number == a[j])
						{
							coincide = true;
						}
					
						
					}
					
					if (!coincide)
					{
						a[i] = number;
						
						
						break;
					}
				}
			}	
			
			// Sorting
			for (i = 0; i <= 99; i = i + 1)
			{
				for (j = i + 1; j <= 99; j = j + 1)
				{
					if (a[i] > a[j])
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
				number = a[i];
			}	
			// Spiral
			x = 0;
			y = 0;
			spiral[y][x] = number;
			direction = Right;
			end = size * size;

			
			//for (number = end; number >= 1; number = number - 1)// numbering station
			for (i = 0; i <= 99; i = i + 1)
			{
				spiral[y][x] = a[i];
				direction_temp = direction;
						
				if (direction == Right)
				{
					x = x + 1;
					
					
					
					if ((x > size - 1) || (spiral[y][x] != None))
					{
						x = x - 1;
						y = y + 1;
						direction_temp = Down;
					}
				}

				if (direction == Down)
				{
					y = y + 1;
					
					if ((y > size - 1) || (spiral[y][x] != None))
					{
						y = y - 1; 
						x = x - 1;
						direction_temp = Left;
					}
				}
				
				if (direction == Left)
				{
					x = x - 1;
					
					if ((x < 0) || (spiral[y][x] != None))
					{
						x = x + 1;
						y = y - 1;
						direction_temp = Up;
					}
				}
				
				if (direction == Up)
				{
					y = y - 1;
					
					if ((y < 0) || (spiral[y][x] != None))
					{
						y = y + 1;
						x = x + 1;
						direction_temp = Right;
					}
				}
				
				direction = direction_temp;
			}
			
			for (i = 0; i < size; i = i + 1)// spacing & printing logic
			{
				for (j = 0; j < size; j = j + 1)
				{
					if (spiral[i][j] < 10)
					{
						System.out.print(" ");
					}
					if (spiral[i][j] < 100)
					{
						System.out.print(" ");
					}
					
					System.out.print("(" + spiral[i][j] + ")"); 
					System.out.print(" ");
				}
				System.out.println();
				System.out.println();
			}
			
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println();
		}
	}
}
