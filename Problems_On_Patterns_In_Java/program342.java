// Pattern printing on strings.
import java.lang.*;
import java.util.*;
import MarvellousMatrix.Matrix;

// Input :- 78956
/*

7 8 9 5 6
7 8 9 5 6
7 8 9 5 6
7 8 9 5 6
7 8 9 5 6

*/

class program342
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int no = sobj.nextInt();
		
		String str = Integer.toString(no);
		char Arr[] = str.toCharArray();
		
		for(int i = 0; i< Arr.length; i++)
		{
			for(int j = 0; j< Arr.length; j++)
			{
				System.out.println(Arr[j]+"  ");
			}
		}
		System.out.println();
	
	}    
}