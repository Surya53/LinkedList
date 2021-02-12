package LinkedList_geeksforgeeks;

import java.util.HashSet;

class Node21
{
	int data;
	Node21 next;
	Node21 (int d)
	{
		data =d;
	}

}
class List21
{ 
	Node21 head;
	void insert(int x)
	{
		Node21 new_node = new Node21(x);
		new_node.next = head;
		head = new_node;
	}
	
    //Iterative method using two pointers.
   boolean isloop(Node21 head)
   {
	   Node21 slow_p = head;
	   Node21 fast_p = head;
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

public class FloydsCycleDection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List21 l =  new List21();
		
		l.insert(5);
		l.insert(4);
		l.insert(3);
		l.insert(2);
		l.insert(1);
		// 1-->2-->3-->4-->5
		// creating loop
		l.head.next.next.next.next.next = l.head.next;
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
