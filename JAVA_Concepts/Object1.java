import java.lang.*;

class Employee      //class Empolyee extends Object
{
	public String name;
	public int Salary;
	
	public Employee(String str, int no)
	{
		this.name = str;
		this.Salary = no;
	}
	
	public String toString()
	{
		return "Employee name is "+name+" having Salary "+Salary;
	}	
}

class Object1	
{
	public static void main(String arg[])
	{
		Employee eobj = new Employee("Manish",11000);
		System.out.println(eobj.toString());
		
	}
}	