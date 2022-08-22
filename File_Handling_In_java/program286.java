// Take name from user & open file
import java.lang.*;
import java.util.*;
import java.io.*;

class program286
{
	public static void main(String args[])
	{
		try 
		{
			Scanner sobj = new Scanner(System.in);
		
		    System.out.println("Please enter file name :");
		    String Filename = sobj.nextLine();
		
	    	File file = new File(Filename);
			boolean bobj = bobj.createNewFile();
		
			if(file == null)
			{
				System.out.println("file is succesfully created");
			}
			else
			{
				System.out.println("file is already existing");
			}
		}
        catch(IOException obj)		
		{
			System.out.println(obj);
		}
	}
}