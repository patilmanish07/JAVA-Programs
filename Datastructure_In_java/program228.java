//Complete Singly linear Linkedlist in Java.
import java.lang.*;
import java.util.*;

class node
{
	public int data;
	public node next;
}

class SinglyLL
{
	public node Head;
	public int Count;
	
	public SinglyLL()
	{
		Head = null;
		Count = 0;
	}
	
	public void InsertFirst(int no)
	{
		node newn = new node();
		newn.data = no;
		newn.next = null;
		
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			newn.next = Head;
			Head = newn;
		}
		Count++;
	}
	
	public void InsertLast(int no)
	{
		node newn = new node();
		newn.data = no;
		newn.next = null;
		
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
		    node temp = Head;
		
		    while(temp.next != null)
			{
				temp = temp.next;
			}
             temp.next = newn;
		}
        Count++;		
	}
	
	public void Display()
	{
		node temp = Head;
		
		System.out.println("Element of Linked List are :");
		while(temp != null)
		{
			System.out.print("|"+temp.data+"|->");
			temp = temp.next;
		}
	     System.out.println("NULL");
	}
	
	public int CountNode()
	{
		return Count;
	}
	
	public void DeleteFirst()
	{
		if(Count == 0)
		{
			return;
		}
		else if(Count == 1)
		{
			Head = null;
		}
		else
		{
			node temp = Head;
			Head = Head.next;
			temp = null;
		}
		Count--;
	}
	
	public void DeleteLast()
	{
		if(Count == 0)
		{
			return;
		}
		else if(Count == 1)
		{
			Head = null;
		}
		else
		{
			node temp = Head;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}	
			temp.next = null;
		}
		Count--;
	}
	
	public void InsertAtPos(int no, int pos)
	{
		if((pos < 1) || (pos > Count+1))
		{
			return;
		}
		
		if(pos == 1)
		{
			InsertFirst(no);
		}
		else if(pos == Count+1)
		{
			InsertLast(no);
		}
		else
		{
			node newn = new node();
			newn.data = no;
			newn.next = null;
			
		 	node temp = Head;
			
			for(int i = 1; i < pos-1; i++)
			{
				temp = temp.next;
			}
			
			newn.next = temp.next;
			temp.next = newn;
			
			Count++;
		}
	}
	
	public void DeleteAtPos(int pos)
	{
		if((pos < 1) || (pos > Count))
		{
			return;
		}
		
		if(pos == 1)
		{
			DeleteFirst();
		}
		else if(pos == Count)
		{
			DeleteLast();
		}
		else
		{
			node temp = Head;
			for(int i = 1; i < pos-1; i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
			
			Count--;
		}
	}
}

class program228
{
	public static void main(String arg[])
	{
		SinglyLL obj = new SinglyLL();
		
		obj.InsertFirst(51);
		obj.InsertFirst(21);
		obj.InsertFirst(11);
		
		obj.InsertLast(101);
		obj.InsertLast(111);
		
		obj.InsertAtPos(71,4);
		
		obj.Display();
		obj.DeleteAtPos(4);
		obj.Display();
		System.out.println("Number of elements are :"+obj.CountNode());
		
		obj.DeleteFirst();
		obj.DeleteLast();
		obj.Display();
		System.out.println("Number of elements are :"+obj.CountNode());
		
	}
}
