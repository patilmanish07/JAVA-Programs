// Write a program accepts one number from user and toggel 1st & last nibble.

import java.lang.*;
import java.util.*;

class Bitwise
{
	public int ToggelNibble(int iNo,int iPos)
	{
		int iMask = 0X00000000F;
		int iResult = 0;
		
		iResult = iNo ^ iMask;
		return iResult;
	}
}

class LB158
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int value = sobj.nextInt();
		
		System.out.println("Enter position :");
		int ipos = sobj.nextInt();
		
		Bitwise bobj = new Bitwise();
		int iret = bobj.ToggelNibble(value,ipos);
		System.out.println("Updated No. is :"+iret);
	}
}