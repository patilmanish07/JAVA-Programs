// Check wheather 5th & 18th bit from last is ON or OFF.
// 0000 0000 0000 0000 0000 0000 0000 0000
//   0    0    0    2    0    0     6    0


import java.lang.*;
import java.util.*;

class Bitwise
{
  public boolean ChkBit(int iNo)
  {
	  int iResult = 0;
	  
	  iMask1 = 0X20000;           //16 & 131072
	  iMask2 = 0X10;  

	  int iMask = 0;
	  
	  iMask = iMask1 | iMask2;

	  iResult = iNo & iMask;

	  
      if(iResult == iMask)
		{
			return true;
		}
		else
		{
			return false;
		}  
  }  
}

class LB147
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
		 System.out.println("Bit are OFF");
	   }
	}
}