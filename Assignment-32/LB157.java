// Accept one no.& position from user & off that bit.
// Input :- 10 2
// Output :- 8
// 0000 0000 0000 0000 0000 0000 0000 0010
//   0    0    0    0    0    0   0     1

import java.lang.*;
import java.util.*;

class Bitwise
{
	public int OffBit(int iNo,int iPos)
	{
		int iMask = 0X000000001;
		int iResult = 0;
		
	    iMask = iMask << (iPos -1);
		
		iResult = iNo ^ iMask;
		return iResult;
	}
}

class LB157
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int value = sobj.nextInt();
		
		System.out.println("Enter position :");
		int ipos = sobj.nextInt();
		
		Bitwise bobj = new Bitwise();
		int iret = bobj.OffBit(value,ipos);
		System.out.println("Updated No. is :"+iret);
	}
}