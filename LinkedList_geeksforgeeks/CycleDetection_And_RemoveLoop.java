package LinkedList_geeksforgeeks;
class node22
{
	int data;
	node22 next;
	node22(int d)
	{
		data = d;
	}
}
class List22
{
	node22 head;
	void insert(int x)
	{
		node22  new_node = new node22(x);
	      new_node.next = head;
	      head = new_node;
	}
	int totalnodes()
	{
		int count =0;
		node22 curr = head;
		while(curr != null)
		{
			count++;
			curr = curr.next;
		}
		return count;
	}
	void loopprint(node22 head,int totnodes)
	{
		node22 curr = head;
		int count = 0;
		while(count < totnodes)
		{
			count++;
			System.out.print(curr.data+"-->"+" ");
			curr = curr.next;
		}
	}
	void print()
	{
		node22 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"-->"+" ");
			curr = curr.next;
		}
	}
	node22 DetectAndRemoveloop(node22 head)
	{
		node22 slow_p = head;
		node22 fast_p = head;
		while(fast_p != null && fast_p.next != null)
		{
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if(slow_p == fast_p)
				break;
		}
		if(slow_p != fast_p)
		{
			return head;  // Nothing return here 
		}
		slow_p = head; // slow is now availiable on first node
		while(slow_p.next != fast_p.next)
		{
			slow_p = slow_p.next;
			fast_p = fast_p.next;
		}
		fast_p.next = null;
	     return head;   // Now slow_p is the header .	
	}
}
public class CycleDetection_And_RemoveLoop 
{
	public static void main(String[] args) 
	{
		List22 l = new List22();
		
		l.insert(5);
		l.insert(4);
		l.insert(3);
		l.insert(2);
		l.insert(1);
		
		
		int totnodes = l.totalnodes();
		l.print();
		
		System.out.println();
		l.head.next.next.next.next.next = l.head.next.next;
		
        System.out.println();
        l.loopprint(l.head, totnodes+1);
		
        System.out.println();
		node22 new_head =l.DetectAndRemoveloop(l.head);
		
		while(new_head != null)
		{
			System.out.print(new_head.data+"-->"+" ");
			new_head = new_head.next;
			
		}
		
				
	}

}
