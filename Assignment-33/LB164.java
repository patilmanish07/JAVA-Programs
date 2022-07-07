// Accept one number & two positions from user & check wheather bit at first or bit at second position is ON or OFF.
// Input :-  10  3 7
// Output :- TRUE
// 0000 0000 0000 0000 0000 0000 0100 0100
//  0     0    0    0    0    0   4    4

import java.lang.*;
import java.util.*;

class Bitwise
{
	public boolean ChkBit(int iNo,int iPos1,int iPos2)
	{
		int iResult = 0;
		int iMask = 0X00000044;
		
		iResult = iNo ^ iMask;
		
		if((iPos1 == 0) && (iPos2 == 0))
		{
			return false;
		}
        else
		{
			return true;
		}
	}	
			
}


class LB164
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int value = sobj.nextInt();
		
		System.out.println("Enter positions :");
		int ipos1 = sobj.nextInt();
		int ipos2 = sobj.nextInt();
		
		Bitwise bobj = new Bitwise();
	    boolean bret = bobj.ChkBit(value,ipos1,ipos2);
		
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