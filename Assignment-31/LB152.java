// Accept 1 no.from user & off 7th  & 10th bit of that no.& return modified value.
// Input:- 577
//Output:- 1
// 0000 0000 0000 0000 0000 0010 0100 0000
// 0     0    0    0    0     2    4     0

import java.lang.*;
import java.util.*;

class Bitwise
{
	public int OffBit(int iNo)
	{
		int iResult = 0;
		int iMask = 0X00000240;
		
		iResult = iNo ^ iMask;
		return iResult;
	}
}

class LB152
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int value = sobj.nextInt();
	
        Bitwise bobj = new Bitwise();
        int iret = bobj.OffBit(value);

        System.out.println("Modified value is :"+iret);		
	}
}