package LinkedList_geeksforgeeks;
import java.util.*;
class Node20
{
	int data;
	Node20 next;
	Node20 (int d)
	{
		data =d;
	}
	Node20 ()
	{
		
	}
	
}
class List20
{ 
	Node20 head;
	void insert(int x)
	{
		Node20 new_node = new Node20(x);
		new_node.next = head;
		head = new_node;
	}
	//Hashing Method
    boolean detectloop(Node20 head)
	{
		HashSet<Node20> s =  new HashSet<Node20>();
		while (head != null)
		{
			if(s.contains(head))
				return true;
			s.add(head);
			head = head.next;
		}
		return false;
	}
    //Iterative method using two pointers.
   boolean isloop(Node20 head)
   {
	   Node20 slow_p = head;
	   Node20 fast_p = head;
	   while(fast_p != null && fast_p.next != null)
	   {
		   slow_p = slow_p.next;
		   fast_p = fast_p.next.next;
		   if(slow_p == fast_p)
		        return true;
	   }
	   return false;
	   
   }
      	
    
}
public class DetectLoop_In_LinkedList {

	public static void main(String[] args)
	{
		List20 l =  new List20();
		
		l.insert(5);
		l.insert(4);
		l.insert(3);
		l.insert(2);
		l.insert(1);
		// 1-->2-->3-->4-->5
		l.head.next.next.next.next.next = l.head.next;
		if(l.detectloop(l.head))
			System.out.println("Loop found");
		else
		System.out.println("Loop not found");
		
		//by using two pinters 
		if(l.isloop(l.head))
		{
			System.out.println("Loop Found ");
		}
		else
		{
			System.out.println("Loop not  Found ");	
		}
	}

}
