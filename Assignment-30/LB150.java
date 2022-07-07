// Check wheather 1st & 32th bit from last is ON or OFF.

import java.lang.*;
import java.util.*;

// 1000 0000 0000 0000 0000 0000 0000 0001
// 4      0    0    0    0    0    0     1

class Bitwise
{
	public boolean ChkBit(int iNo)
	{
		int iResult = 0;
		int iMask = 0X10000004;
		
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

class LB150
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