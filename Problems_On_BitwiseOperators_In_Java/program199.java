// Accept no.from user and return that no.& see his 27th bit from last is ON or OFF.
import java.lang.*;
import java.util.*;
// 0000 0100 0000 0000 0000 0000 0000 0000
// 0     4    0    0    0    0    0     0

class Bitwise
{
   	public int OnBit(int iNo)
	{
	   	int iMask = 0X04000000;
        int iResult = 0; 	
  
        iResult = iNo | iMask;     //(OR operator)
		return iResult;
         
	}
}

class program199
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
