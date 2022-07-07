// Accept one no.from user & count no. of ON bits in it without using % and / operator. 
// Input :- 11
// Output :- 3

import java.lang.*;
import java.util.*;

class Bitwise
{
	public int CountOne(int iNo)
	{
		int iMask = 0X00000001;
		int iResult = 0;
		int i = 0;
		int iCount = 0;
	
		for ( i = 0; i < 32; i++)
		{
			iResult = iMask & iNo;
			if (iResult == iMask)
			{
				iCount++;
			}
			iMask = iMask << 1;        
		}
		return iCount;
	}
}

class LB161
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter no :");
		int value = sobj.nextInt();
      
        Bitwise bobj = new Bitwise();	
        int iret = bobj.CountOne(value);
		System.out.println("Number of On bits are :%d",iret);

	}
}