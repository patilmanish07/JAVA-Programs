// Accept one no.& position from user & Toggel that bit.
// Input :- 10 3
// Output :- 14

import java.lang.*;
import java.util.*;

class Bitwise
{
	public int ToggelBit(int iNo,int iPos)
	{
		if((iPos <= 0) || (iPos > 32))
		{
			System.out.println("Invalid Position");
			return 0;
		}
		
		int iMask = 0X000000001;
		int iResult = 0;
		
	    iMask = iMask << (iPos-1);
		
		iResult = iNo | iMask;
		return iResult;
	}
}

class LB159
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int value = sobj.nextInt();
		
		System.out.println("Enter position :");
		int ipos = sobj.nextInt();
		
		Bitwise bobj = new Bitwise();
		int iret = bobj.ToggelBit(value,ipos);
		System.out.println("Updated No. is :"+iret);
	}
}