// Accept no.from user and toggel that no.& see his 4th & 7th bit from last is ON or OFF.
import java.lang.*;
import java.util.*;
// 0000 0000 0000 0000 0000 0000 0100 1000
//  0     0    0    0    0    0   4   8

class Bitwise
{
   	public int OnBit(int iNo)
	{
	   	int iMask = 0X00000048;
        int iResult = 0; 	
  
        iResult = iNo ^ iMask;
		return iResult;
         
	}
}

class program201
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int value = sobj.nextInt();
		
		Bitwise bobj = new Bitwise();
		int iret = bobj.OnBit(value);
		System.out.println("Updated number is :"+iret);
	}
}