// Accept one no.& position from user & check wheather bit at that position,then return true else false.
// Input :- 10 2
// Output :- True
// 0000 0000 0000 0000 0000 0000 0000 0010
//   0    0    0    0    0    0   0     2

import java.lang.*;
import java.util.*;

class ChkBit
{
	public boolean ChkBit(int iNo,int iPos)
	{
		int iMask = 0X000000002;
		int iResult = 0;
		
		iResult = iNo & iMask;
		
		if(iResult == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

class LB156
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int value = sobj.nextInt();
		
		System.out.println("Enter position :");
		int pos = sobj.nextInt();
		
		Bitwise bobj = new Bitwise();
		boolean bret = bobj.ChkBit(value);
		
		if(bret == true)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
}