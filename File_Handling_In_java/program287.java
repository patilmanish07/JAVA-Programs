//check size of file.

import java.lang.Exception;
import java.util.*;
import java.io.*;

class program287
{
	public static void main(String args[])
	{
		try 
		{
			Scanner sobj = new Scanner(System.in);
		
		    System.out.println("Please enter file name :");
		    String Filename = sobj.nextLine();
		
	    	File fobj = new File(Filename);
		
			if(fobj.exists())
			{
				long size = fobj.length();
				System.out.println("File size is :"+size);
			}
			else
			{
				System.out.println("There is no such file");
			}
		}
        catch(Exception obj)		
		{
			System.out.println(obj);
		}
	}
}