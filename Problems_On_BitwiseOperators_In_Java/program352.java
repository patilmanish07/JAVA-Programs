// Accept two no.& count common no.bits are oN
import java.lang.*;
import java.util.*;

// 0000 0000 0000 0000 0000 0000 0000 0000
// Input :-15 & 12

class program352
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first number :");
		int iNo1 = sobj.nextInt();
		
		System.out.println("Enter second number :");
		int iNo2 = sobj.nextInt();
		
		int iNo = iNo1 & iNo2;
		
		int iMask = 0x00000001;
		int iResult = 0;
		int iCnt = 0;
		
		for(int i = 1; i<= 32; i++)
		{
			iResult = iNo & iMask;
			if(iResult == iMask)
			{
				iCnt++;
			}
			iMask = iMask << 1;
		}
		System.out.println("Number of ON bits are :"+iCnt);
	}
}