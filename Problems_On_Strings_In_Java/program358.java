// Accept string from user & display frequency of each string with hashmap traversal.
import java.lang.*;
import java.util.*;


class program358
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter first string :");
		String str = sobj.nextLine();
		
		char Arr[] = str.toCharArray();
		
		HashMap<Character,Integer> hobj = new HashMap<>();
		int Frequency = 0;
		
		for(char ch : Arr) // For -each loop       // for(int i = 0; i< Arr.length; i++)
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
		
		Set<Character> setobj = hobj.keySet();
		int iMax = 0;
		char c = ' ';
		
		
		for(char value : setobj)          //For-each loop
		{
			if(hobj.get(value) > iMax)
			{
				iMax = hobj.get(value);
				c = value; 
			}
		}
		 System.out.println(c + "Occurs maximum number of times ie :"+iMax);
	}	 
}
