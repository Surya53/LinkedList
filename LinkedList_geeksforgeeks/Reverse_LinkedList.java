package LinkedList_geeksforgeeks;
class Node15
{
	int data;
	Node15 next;
	Node15(int d)
	{
		data = d;
	}
}
class List15
{
	Node15 head;
	void insert(int x)
	{
		Node15 new_node = new Node15(x);
		new_node.next = head;
		head = new_node;
	}
	void print()
	{
		Node15 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"-->");
			curr = curr.next;
		}
	}
	Node15 reverseofLinkedList(Node15 head)
	{
		Node15 curr = head;
		Node15 prev = null;
		while(curr != null)
		{
		   Node15 next = curr.next;
		   curr.next = prev;
		   prev = curr;
		   curr = next;
		}
		
		return prev;  // Now prev is the head
	}
}
public class Reverse_LinkedList {

	public static void main(String[] args) 
	{
	    List15 l = new List15();
	    l.insert(7);
	    l.insert(6);
	    l.insert(5);
	    l.insert(4);
	    
	    l.print();
	    System.out.println();
	    Node15 new_head=l.reverseofLinkedList(l.head);
	    while(new_head != null)
	    {
	    	System.out.print(new_head.data+"-->");
	    	new_head = new_head.next;
	    }
	}

}
