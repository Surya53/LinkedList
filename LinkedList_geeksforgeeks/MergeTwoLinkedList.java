package LinkedList_geeksforgeeks;
class node28
{
	int data;
	node28 next;
	node28(int d)
	{
		data = d;
	}
}
class List28
{
	node28 head;
	void insert(int x)
	{
		node28 newnode = new node28(x);
		newnode.next = head;
		head = newnode;
	}
	void print()
	{
		node28 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"-->"+" ");
			curr = curr.next;
		}
	}
	node28 mergeLinkedList(node28 a,node28 b)
	{
		if(a == null)
			return b;
		if(b == null)
			return a;
		node28 head = null,tail = null;
		if(a.data <= b.data)
		{
			head = tail = a;
		   a = a.next;
		}
		else
		{
			head = tail = b;
			b = b.next;
			while(a!=null && b != null)
			{
				if(a.data <= b.data)
				{
					tail.next=a;
					tail = a;
					a  = a.next;
				}
				else
				{
					tail.next = b;
					tail = b;
					b = b.next;
				}
			}
			if(a == null)
			{
				tail.next = b;
			}
			else
			{
				tail.next = a;
			}
		}
		return head;
	}
	
}
public class MergeTwoLinkedList {

	public static void main(String[] args) 
	{
	List28 l =  new List28();
	l.insert(20);
	l.insert(8);
	l.insert(7);
	l.insert(6);
	
	List28 k = new List28();
	k.insert(11);
	k.insert(2);
	k.insert(1);
	System.out.println("Linked List 1 : ");
	l.print();
	System.out.println();
      System.out.println("Linked List 2  : ");
	k.print();
	System.out.println();
	node28 newhead = l.mergeLinkedList(l.head, k.head);
	while(newhead != null)
	{
		System.out.print(newhead.data+"-->"+" ");
		newhead = newhead.next;
	}
	}

}
