// Accept no.& range from user & check wheather bits are On or not.
import java.lang.*;
import java.util.*;

// 0000 0000 0000 0000 1111 1111 0000 0000
// Range:- 9-16

class program349
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number :");
		long iNo = sobj.nextLong();
		
		System.out.println("Enter starting point :");
		int iStart = sobj.nextInt();
		
		System.out.println("Enter ending point :");
		int iEnd = sobj.nextInt();
		
		long iMask1 = 0xffffffff;
		long iMask2 = 0xffffffff;
		long iMask = 0;
		
		iMask1 = iMask1 << (iStart-1);
		iMask2 = iMask2 >> (32 - iEnd);
		
		iMask = iMask1 & iMask2;
		
		long iResult = 0;
		iResult = iNo & iMask;
		
		if(iResult == iMask)
		{
			System.out.println("Bits are ON");
		}
		else
		{
			System.out.println("Bits are OFF");
		}
		
	}
}