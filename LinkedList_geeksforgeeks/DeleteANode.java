package LinkedList_geeksforgeeks;
class node24
{
	int data;
	node24 next;
	node24 (int d)
	{
		data = d;
	}
}
class List24
{
	node24 head;
	void insert(int x)
	{
		node24 new_node = new node24(x);
		new_node.next = head;
		head = new_node;
		
	}
	void print()
	{
		node24 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"-->"+" ");
			curr = curr.next;
		}
		System.out.println("Null");
	}
	
	 void DeleteNode(node24 ptr)
	{
		node24 temp = ptr.next;
		ptr.data = temp.data;
		ptr.next = temp.next;
		
	}
}
public class DeleteANode {

	public static void main(String[] args)
	{
	 List24 l = new List24();
	 l.insert(4);
	 l.insert(3);
	 l.insert(2);
	 l.insert(1);
	 
	 l.print();
	 System.out.println();
	 l.DeleteNode(l.head.next.next);
	 l.print();
	}

}
