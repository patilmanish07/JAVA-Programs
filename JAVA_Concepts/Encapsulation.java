import java.lang.*;

class DemoProgram
{
	public int i;
	public float j;
	
	public DemoProgram()
	{
		this.i = 10;
		this.j = 11;
		System.out.println("Inside DemoProgram Constructor");
	}
	
	public void DemoAccess()
	{
		System.out.println("Inside userdefined function");
	}
}

class Encapsulation
{
	public static void main(String args[])
	{
		System.out.println("Inside main function");
		DemoProgram dpobj = new DemoProgram();
		System.out.println(dpobj.i);
		System.out.println(dpobj.j);
		dpobj.DemoAccess();
	}
}