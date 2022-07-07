import java.lang.*;


 abstract class Demo
 {
	public int i,j;
	 
	public Demo()
	{
		System.out.println("Inside Demo constructor");
	}
	
	public void fun()
	{
		System.out.println("Demo fun");           //concrete
	}

	public abstract void gun();             //Abstract      virtual void gun() = 0;
 }

 class Hello extends Demo
 {
	public int x,y;
		
	public Hello()
	{
		System.out.println("Inside Hello constructor");
    }
	
	public void sun()           //COncrete
	{
	    System.out.println("Hello sun");		
	} 	 

    public void gun()            //concrete
	{
		System.out.println("Hello gun");
	}
 }
 
 class AbstractDemo1
 {
	public static void main(String a[])
	{
		/*Demo dobj;
		dobj = new Demo(); */
		
		Hello hobj = new Hello();
		hobj.fun();
		hobj.gun();
		hobj.sun();
	}
 }	