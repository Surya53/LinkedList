package LinkedList_geeksforgeeks;
class Node14
{
	int data;
	Node14 next;
	Node14 (int d)
	{
		data = d;
	}
}
class List12
{
	Node14 head;
	void insert(int x)
	{
		Node14 new_node = new Node14(x);
        new_node.next = head;
        head = new_node;
	}
	void printNthNodeFromEnd(Node14 head,int n)
	{
		if(head == null)
		{
			return;
		}
		Node14 first=head;
		for(int i=0;i<n;i++)
		{
			if(first == null)
			{
			    return;	
			}
			first = first.next;
		}
		Node14 second = head;
		while(first != null)
		{
			second = second.next;
			first = first.next;
		}
		System.out.println(second.data+" ");
	}
	void print()
	{
		Node14 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
}
public class NthNode_From_the_End_of_The_LinkedList1 {

	public static void main(String[] args) 
	{
     List12 l = new List12();
     l.insert(8);
     l.insert(9);
     l.insert(10);
     l.insert(11);
     
     l.print();
     System.out.println();
     l.printNthNodeFromEnd(l.head,3);
     /*l.print();*/
	}

}
