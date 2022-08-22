// Accept no. & position from user and toggel at that position and see his from last is ON or OFF.
// using Dynamic mask.
// Template.
import java.lang.*;
import java.util.*;
// 0000 0000 0000 0000 0000 0000 0000 0000
//  0     0    0    0    0    0   0    0

class Bitwise
{
   	public int ToggelBit(int iNo,int iPos)
	{
	   int iMask = 0X00000001;
	   int iResult = 0;
	   
	   iMask = iMask << (iPos -1);
	   
	   iResult = iNo ^ iMask;
	   return iResult;
         
	}
}

class program202
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int value = sobj.nextInt();
		
		System.out.println("Enter position :");
		int ipos = sobj.nextInt();
		
		Bitwise bobj = new Bitwise();
		int iRet = bobj.ToggelBit(value,ipos);
		System.out.println("Updated number is :"+iRet);
	}
}