// Accept 1 no.from user & toggel 7th bit of that no.& return modified value.
// Input:- 137
//Output:- 201
// 0000 0000 0000 0000 0000 0000 0100 0000
// 0     0    0    0    0     0    4     0

import java.lang.*;
import java.util.*;

class Bitwise
{
	public int ToggelBit(int iNo)
	{
		int iResult = 0;
		int iMask = 0X00000040;
		
		iResult = iNo ^ iMask;
		return iResult;
	}
}

class LB153
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int value = sobj.nextInt();
	
        Bitwise bobj = new Bitwise();
        int iret = bobj.ToggelBit(value);

        System.out.println("Modified value is :"+iret);		
	}
}