// Check wheather 15th bit from last is ON or OFF.

import java.lang.*;
import java.util.*;

class Bitwise
{
	public boolean ChkBit(int iNo)
	{
		int iMask = 0;
		int iResult = 0;
		
		iMask = 0X4000;
		
		iResult = iNo & iMask;
		
		if(iResult == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}


class LB146
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
		   System.out.println(" 15th Bit is ON");
	    }
	    else
	   {
		  System.out.println("Bit is OFF");
	   }	
	}
}
