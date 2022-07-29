// Dynamic way of accepting the input of HashCode() in java.

import java.lang.*;
import java.util.*;
import java.io.*;

class Hello
{}

class HashCode1 
{
	public static void main(String arg[]) throws Exception
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the First String :");
		String str1 = sobj.nextLine();
		
		System.out.println("Enter the second String :");
		String str2 = sobj.nextLine();
		
		System.out.println("HashCode of Str1 :"+str1.hashCode());
		System.out.println("HashCode of Str2 :"+str2.hashCode());
	}
	
}