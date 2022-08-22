// Accept string from user & display Frequency of each word in string.
import java.lang.*;
import java.util.*;

class program359
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string :");
		String str = sobj.nextLine();
		
		String Arr[] = str.split(" ");
		
		HashMap<String,Integer> hobj = new HashMap<>();
		int Frequency = 0;
		
		for(String ch : Arr) // For -each loop       // for(int i = 0; i< Arr.length; i++)
		{
			if(hobj.containsKey(ch))  
			{
				Frequency = hobj.get(ch);
				hobj.put(ch, Frequency + 1);
			}
			else
			{
				hobj.put(ch,1);
			}
	
		}
		
		Set<String> setobj = hobj.keySet();
		int iMax = 0;
		String c = " ";
		
		
		for(String value : setobj)          //For-each loop
		{
			if(hobj.get(value) > iMax)
			{
				iMax = hobj.get(value);
				c = value; 
			}
		}
		 System.out.println(c +"Word Occurs maximum number of times ie :"+iMax);
	}	 
}
