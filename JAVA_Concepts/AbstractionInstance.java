/*
    Program used demonstrate the Abstraction in java.
*/

import java.lang.*;

class Abstraction
{
	private int x;
	private String str;
	private double balance;
	private double salary;
	private double credit;
	
	public void disp(int anum, String nam, double bal)
	{
		this.x = anum;
        this.str = nam;
	    this.balance = bal;	
		System.out.println("Account number is :"+x);
		System.out.println("Customer name is :"+str);
		System.out.println("Total balance is = $:"+bal);
	}
}

class AbstractionInstance
{
	public static void main(String args[])
	{
		Abstraction aobj = new Abstraction();
		aobj.disp(125, "Manish", 50000);
	}
}