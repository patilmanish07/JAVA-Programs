import java.lang.*;
import java.io.*;       //Accepting the I/P

class Input1
{
	public static void main(String arg[])   //throws IOException(we can write this also to solve errors) 
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.println("Enter your name");
		String name = bobj.readLine();
		
		System.out.println("Your name is :"+name);
	}
}	