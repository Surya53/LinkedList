package LinkedList_geeksforgeeks;
import java.util.*;
class Node12
{
	int data;
	Node12 next;
	Node12 (int d)
	{
		data = d;
	}
}
class Test
{
	Node12 head;
	void insert(int x)
	{
		Node12 new_node = new Node12(x);
		new_node.next = head;
	    head = new_node;
	}
	void printLinkedList()
	{
		Node12 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"--->"+" ");
			curr = curr.next;
		}
	}
	void middle_node_in_LinkedList()
	{
		if(head == null)
			return;
		Node12  slow = head;
		Node12  fast = head;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data+" ");
		
	}
}
public class Middle_Of_LinkedList
{
   public static void main(String[] args)
   {
	   
	  	  Test t  = new Test();  			
	  	    t.insert(12);
	  	    t.insert(11);
	  	    t.insert(10);
	  	    t.insert(9);
	  	    
	  	    System.out.println();
	  	    t.printLinkedList();
	  	    System.out.println();
	  	    System.out.println("Printing the middle node in the linked list:");
	  	    t.middle_node_in_LinkedList();
   }
}
