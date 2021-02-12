package LinkedList_geeksforgeeks;
class Node16
{
	int data;
	Node16 next;
	Node16(int d)
	{
		data = d;
	}
}
class List16
{
	Node16 head;
	Node16 prev = null;
	void insert(int x)
	{
		Node16 new_node = new Node16(x);
		new_node.next = head;
		head = new_node;
	}
	void print()
	{
		Node16 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"-->"+" ");
			curr = curr.next;
		}
	}
	Node16 RecursiveMethodOfReverseLinkedList(Node16 curr,Node16 prev)
	{
		if(curr == null)
		{
			return prev;
		}
		Node16 next = curr.next;
		curr.next = prev;
		
		Node16 NewHeadNode = RecursiveMethodOfReverseLinkedList(next,curr);
		return NewHeadNode;
	}
	
}
public class Recursive_Method_of_ReverseLinkedList {

	public static void main(String[] args) 
	{
	 List16 l = new List16();
     l.insert(8);
     l.insert(7);
     l.insert(6);
     l.insert(5);
     
     l.print();
     System.out.println();
    Node16 NewHeadNode1 = l.RecursiveMethodOfReverseLinkedList(l.head,l.prev);
   
     while (NewHeadNode1 != null)
     {
    	 System.out.print(NewHeadNode1.data+"-->"+" ");
    	 NewHeadNode1 = NewHeadNode1.next;
     }

     
	}

}
