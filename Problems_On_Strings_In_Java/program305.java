// Random Problems in Java.& Accept string from user & count no. of words replace 2 or more whitespace with 1 whitespace.
import java.lang.*;
import java.io.*;
import java.util.*;

class program305
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String str = sobj.nextLine();
		
		String newstr = str.replaceAll("\\s+"," ");
		String newstr2 = newstr.trim();
		
		String arr[] = newstr2.split(" ");
		
		System.out.println("Number of words are :"+arr.length);
	}
} 