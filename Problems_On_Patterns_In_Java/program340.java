// Pattern printing.
import java.lang.*;
import java.util.*;
import MarvellousMatrix.Matrix;

// Input :- Hello
/*

H e l l o 
H e l l
H e l
H e
H 

*/

class program340
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String str = sobj.nextLine();
		
		char Arr[] = str.toCharArray();       //Converted string into character array.
		
		for(int i = Arr.length-1; i >= 0; i--)
		{
			for(int j = 0; j<= i; j++)
			{
				System.out.print(Arr[j]+" ");
			}
			System.out.println();
		}

	}    
}