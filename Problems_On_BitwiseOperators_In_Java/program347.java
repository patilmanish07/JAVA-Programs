// Accept no.from user & check wheather first & last nibbles are On or not.
import java.lang.*;
import java.util.*;

class program347
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number :");
		int iNo = sobj.nextInt();
		
		long iMask = 0Xf000000f;
		int iResult = 0;
		
		iResult = iNo & iMask;
		
		if(iResult == iMask)
		{
			System.out.println("First nibble & last nibble is completely on");
		}
		else
		{
			System.out.println("First nibble is off");
		}
	}
}

//Input:-4,026,531,855