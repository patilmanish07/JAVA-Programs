// Accept one no.from user & range positions from user.Toggel all bits from that range.	
// Input :-  897
// Range :- 9-13
// 0000 0000 0000 0000 0001 1111 0000 0000
//  0     0    0    0    1    4   0    0

import java.lang.*;
import java.util.*;

class Bitwise
{
	public int ToggelBitRange(int iNo,int iStart,int iEnd)
	{
		int iMask1 = 0XFFFFFFFF;
		int iMask2 = 0XFFFFFFFF;
		
		iMask1 = iMask1 << (iStart - 1);
		iMask2 = iMask2 >> (32 - 1);

		int iMaskF = iMask1 & iMask2;
		
		iNo = iNo ^ iMaskF;
		return iNo;
	}
}

class LB165
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int value = sobj.nextInt();
		
		System.out.println("Enter range :");
		int istart = sobj.nextInt();
		int iend = sobj.nextInt();
		
		Bitwise bobj = new Bitwise();
	    int iret = bobj.ToggelBitRange(value,istart,iend);
		System.out.println("Updated number is :"+iret);
	}
}