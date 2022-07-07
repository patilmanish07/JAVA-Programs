import java.lang.*;

   class Base
 {
	 public int i;
	 public int j;
	 
	 public Base()
	 {
		 System.out.println("Inside Base constructor");
	 }

     public void fun()
	 {
         System.out.println("Inside Base fun");
	 }
	 
 	   public void fun(int X)
	 {
         System.out.println("Inside Base fun with integer argument");
	 }	 
      
        public void gun()
	  {
          System.out.println("Inside base gun");
	  }	
  } 	  
	
    class Derived extends Base              //Class Derived :public Base(C++)
   {
	   public int x;
	   public int y;
	   
	   public Derived()
	  {
		  System.out.println("Inside Derived constructor");
	  }
	  
	   public void sun()
	  {
          System.out.println("Inside derived sun");
	  }
   }	  
	
    class Inheritance1
  {
	  static
	  {
		  System.out.println("Inside static block");
	  }
	   
	   public static void main(String a[])
	 {
		 System.out.println("Inside main");
		 Derived dobj = new Derived();
		 dobj.fun();
		 dobj.fun(11);
		 dobj.gun();
		 dobj.sun();
	  }
   }
 