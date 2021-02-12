package LinkedList_geeksforgeeks;
class Node
{
	int data;
	Node next;
	Node prev;
	Node (int d)
	{
		data = d;
	}
}
class linkedlist2
{
	Node head;
	void AddNodeAtFront(int x)      /* create a double linked list */
	{
		Node temp = new Node(x);
		temp.next = head;
		temp.prev = null;
		if(head != null)  /* That means some elements are already present in the list */
		{
			head.prev = temp;
		}
		head  = temp;  /* head moves to the temp Node (newly created Node). */
	}
	void  InsertAfterGivenNode(Node prev_Node,int x)
	{
		if(prev_Node == null)
		{
			System.out.println("The given previous Node cannot be Null");
		}
		  Node new_Node = new Node(x);
	      new_Node.next = prev_Node.next;
	      prev_Node.next = new_Node;
	      new_Node.prev = prev_Node;
	      if(new_Node.next != null)
	      {
	    	  new_Node.next.prev = new_Node;
	      }
	}
	void InsertAtEnd(int x)
	{
		Node last = head ;
		Node new_Node = new Node(x);
		new_Node.next = null;
		if(head == null)
		{
			new_Node.prev = null;
			head = new_Node;
			
			
		}
		while(last.next != null)
			last = last.next;
		
		last.next = new_Node;
		new_Node.prev = last;
	}
	void delete(Node del)
	{
		if(head == null || del == null)
		{
			return;
		}
		/*if we want to delete the first element in the linked list ,for that we want move head to the next Node*/
		if(head == del)
		{
			head = del.next;
		}
		/* Change the next only  if deleted Node is not  the last Node*/
		if(del.next != null)
		{
			del.next.prev = del.prev;
		}
		/*change the prev only if deleted the Node is not the first one*/
		if(del.prev != null)
		{
			del.prev.next = del.next;
		}
		return ;
	}
	void printlist(Node Node)
	{
		 Node last = null;
		 System.out.println("Traversal in Forward Direction :");
		 while(Node != null)
		 {
			 System.out.print(Node.data+" ");
			 last = Node;
			 Node = Node.next;
		 }
		 System.out.println();
		 System.out.println("Traversal in Backward Direction :");
		 while(last != null)
		 {
			 System.out.print(last.data+" ");
			 last = last.prev;
		 }
	}
}
public class doubledLinkedList
{
	public static void main(String[] args)
	{
		linkedlist2 l = new linkedlist2 ();
		l.AddNodeAtFront(5);
		l.AddNodeAtFront(10);
		l.AddNodeAtFront(15);
		l.AddNodeAtFront(12);
		
		l.printlist(l.head);
		System.out.println();
		System.out.println("Inserting a element  After given Node :");
		l.InsertAfterGivenNode(l.head.next,16); /*l.head == NULL or l.head.next = starting element so, insertion can be done after the 10.,beacuse the givenNode is 10.*/
		l.printlist(l.head);
		
		System.out.println();
		System.out.println("Inserting a element At The End :");
		l.InsertAtEnd(8);
		l.printlist(l.head);
		System.out.println();
		System.out.println("Deleting an element fromt the given linked list:");
		l.delete(l.head.next);
		l.printlist(l.head);
	}
}