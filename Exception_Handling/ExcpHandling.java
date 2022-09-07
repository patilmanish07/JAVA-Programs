// Code used to demonstrate the EXception Handling in java

/*
   Exception Prone Code
  
   class ExcpHandling
{
	public static void main(String args[])
	{
		try
		{
			Scanner sobj = new Scanner(System.in);
			System.out.println("Enter the First number:");
			int no1 = sobj.nextInt();
		
			System.out.println("Enter the second number:");
			int no2 = sobj.nextInt();
			int ans = no1/no2 ;
		}
		catch(IOException obj)
		{
			System.out.println("Exception Occured Over here......")
		}	
		System.out.println("Division is:"+ans);
		sobj.close();
	}
}

*/

import java.lang.*;
import java.util.*;

class ExcpHandling
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the First number:");
		int no1 = sobj.nextInt();
		
		System.out.println("Enter the second number:");
		int no2 = sobj.nextInt();
		
		int ans = no1/no2 ;
		
		System.out.println("Division is:"+ans);
		sobj.close();
	}
}



     