// Check wheather 7th,8th,9th bit from last is ON or OFF.
// 0000 0000 0000 0000 0000 0001 1100 0000
//   0    0    0    0    0    6  84      0

import java.lang.*;
import java.util.*;

class Bitwise
{
	public boolean ChkBit(int iNo)
	{
		int iResult = 0;
		int iMask = 0X00000684;         //7-8-9th position.
		
		iResult = iNo | iMask;
		
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

class LB149
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int value = sobj.nextInt();
		
		Bitwise bobj = new Bitwise();
		boolean bret = bobj.ChkBit(value);
		
		if(bret == true)
		{
			System.out.println("Bit is ON");
		}
		else
		{
			System.out.println("Bit is OFF");
		}
	}
}