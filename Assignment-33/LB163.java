// Accept one no. from user & check 9th & 12th bit is ON or OFF.
// Input:- 257
// Output:- TRUE
// 0000 0000 0000 0000 0000 1001 0000 0000
//  0     0    0    0    0    9    0    0

import java.lang.*;
import java.util.*;

class Bitwise
{
	public boolean CheckBit(int iNo)
	{
		int iMask1 = 0X00000001;
		int iMask2 = 0X00000001;
		int iResult1 = 0, iResult2 = 0;
	
		iMask1 = iMask1 << (iPos1);
		iMask2 = iMask2 << (iPos2);
	
		iResult1 = iNo1 & iMask1;
		iResult2 = iNo1 & iMask2;

        if((iResult1 == iMask1) || (iResult2 == iMask2))
		{
			return true;
		}
        else
		{
			return false;
		}				
	}
}

class LB163
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int value = sobj.nextInt();
		
		Bitwise bobj = new Bitwise();
		boolean bret = bobj.CheckBit(value);
		
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