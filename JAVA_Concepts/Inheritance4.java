import java.lang.*;

/*
class Object
{
	//contents
}
*/	
	class Base            //Class Base extends object
 {
	 public int i;
	 public int j;
	 
	 public void fun()
	 {
	     System.out.println("Inside base fun");
	 }	 
 } 	  
	
    class Derived extends Base    //class Derived : public Base
   {
	   public int x;
	   public int y;
	   
	   public void gun()
	  {
		  System.out.println("Inside Derived gun");		
	  }
   }  
	class DerivedX extends Derived    
   {
	   public int a;
	   
	   public void sun()
	  {
		  System.out.println("Inside DerivedX sun");		
	  }
   }
   
   
	class Inheritance4
   {
	   public static void main(String a[])
	 {
		 System.out.println("Inside main");
		 DerivedX dobj = new DerivedX();
		 
		 dobj.sun();
	  }
   }