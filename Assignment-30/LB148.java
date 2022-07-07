// Check wheather 7th,15th,21st & 28th bit from last is ON or OFF.
// 0000 1000 0001 0000 0100 0000 0100 0000
//   0    8    6    0    4    0    4     0

import java.lang.*;
import java.util.*;

class Bitwise
{
	 public boolean ChkBit(int iNo)
	{
		int iResult = 0;
		int iMask = 0X08604040;                //7-15-21-28th position.
		
		iResult = iNo ^ iMask;
		
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

class LB148
{
	public static void main(String arg[])
    {
	     Scanner sobj = new Scanner(System.in);
	
	     System.out.println("Enter the Value :");
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