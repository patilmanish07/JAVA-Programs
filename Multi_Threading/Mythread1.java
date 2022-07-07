import java.lang.*;       //Without pckg.we can run program.

class Mythread1
{
	public static void main(String ar[])
	{
		System.out.println("Inside main");
		
	
		Thread tobj = Thread.currentThread();
		
		System.out.println("Name of current thread is :"+tobj.getName());
	}
}	