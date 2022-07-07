// Accept 1 no.from user & on its first 4 bits then return modified value.
// Input:- 37
//Output:- 79
// 0000 0000 0000 0000 0000 0000 0000 1111
//   0    0    0    0    0    0    0    1  

import java.lang.*;
import java.util.*;

class Bitwise
{
	public int OnBit(int iNo)
	{
		int iResult = 0;
		int iMask = 0X00000001;
		
		iResult = iNo ^ iMask;
		return iResult;
	}
}

class LB155
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int value = sobj.nextInt();
		
		 Bitwise bobj = new Bitwise();
		 int iret = bobj.OnBit(value);
		 
		 System.out.println("Modified Value is :"+iret);
	}
}
