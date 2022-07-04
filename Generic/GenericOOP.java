import java.lang.*;

template <class T>
class Arithematic
{
	public T No1;
	public T No2;
	
	Arithematic(T a,T b)
	{
		No1 = a;
		No2 = b;
	}
	
	public int Addition()
	{
		 public T Addition( T No1, T No2)
	   {
		   T Ans;
		
	        if((No1 instanceof Integer) && (No2 instanceof Integer))
		   {
			    return (T)(Integer)((Integer)NO1 + (Integer)No2);
		   }
            else if((No1 instanceof Float) && (No2 instanceof Float))
           {
			   return (T)(Float)((Float)NO1 + (Float)No2);	
           }
		
		    else if((No1 instanceof Double) && (No2 instanceof Double))
		   {
			   return (T)(Double)((Double)NO1 + (Double)No2);
		   }
           else
		  {
              return null;
	      }
       }
	}
}
	
class GenericOOP
{
	public static void main(String arg[])
	{
			Arithematic <Integer> obj = new Arithematic<Integer>(10,11);
			Integer ret = 0;
			ret = obj.Addition();
			System.out.println("Additon is :"+ret);
	}
}