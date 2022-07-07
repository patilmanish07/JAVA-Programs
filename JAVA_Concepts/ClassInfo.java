import java.lang.*;

class Demo
{}

class ClassInfo
{
	public static void main(String Arg[])
	{
		Demo obj = new Demo();
		
		Class cref = obj.getClass();
		System.out.println("Class name obj is :"+cref.getName());
		
		String str1 = "Marvellous";
		Class cref1 = str1.getClass();
		System.out.println("Class name str1 is :"+cref.getName());
    }
}	