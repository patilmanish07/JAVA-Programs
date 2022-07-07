// Accept two no.from user & display position of common ON bits of that no.
// Input :-  10   15
// Output :- 2    4
// 0000 0000 0000 0000 1111 1010 0000 0000
//  0     0    0    0    4    2    0    0

import java.lang.*;
import java.util.*;

class Bitwise
{
	public void CommonBits(int iNo1,int iNo2)
	{
		int iMask1 = 0X00000001;
        int iMask2 = 0X00000001;

        int iResult1 = 0;
        int iResult2 = 0;

     for (int i = 1; i <= 32; i++)
    {
        iResult1 = iMask1 & iNo1;
        iResult2 = iMask2 & iNo2;

        if ((iResult1 == iMask1)  && (iResult2 == iMask2))
        {
            System.out.println("%d\t",i);
        }
        iMask1 = iMask1 << 1;
        iMask2 = iMask2 << 1;
		
	}
}

class LB162
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter numbers :");
		int value1 = sobj.nextInt();
		int value2 = sobj.nextInt();
		
		Bitwise bobj = new Bitwise();
	    bobj.CommonBits(value1,value2);
	}
}