import java.lang.Exception;

class Demo extends Thread
{
	public void run()     //Running state(3)
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Value of i :"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception obj)
			{}			
		}			
	}
}

class Mythread5
{
	public static void main(String arg[])
    {
		Demo obj1 = new Demo();
		Thread t1 = new Thread(obj1,"First");	    //new state(1)
		
		Demo obj2 = new Demo();
		Thread t2 = new Thread(obj2,"Second");	    //new state(1)
	

     	t1.start();       //Runnable state(2)
		t2.start();       //Runaable state(2)
		
		//Dead state(4)
	}
}


	