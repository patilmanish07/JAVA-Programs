// Accept no.& count no.bits are oN
import java.lang.*;
import java.util.*;

// 0000 0000 0000 0000 0000 0000 0000 0001

class program350
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number :");
		int iNo = sobj.nextInt();
		
		int iMask = 0x00000001;
		int iResult = 0;
		
		for(int i = 1; i<= 32; i++)
		{
			iResult = iNo & iMask;
			if(iResult == iMask)
			{
				
			}
			imask = imask << 1;
		}
		
	}
}