//RECURSIVE METHOD : 
package LinkedList_geeksforgeeks;
class Node17
{
	int data;
	Node17 next;
	Node17(int d)
	{
		data = d;
	}
}
class List17
{
	Node17 head;
	void insert(int x)
	{
		Node17 new_node = new Node17(x);
		new_node.next = head;
		head = new_node;
	}
	void print()
	{
		Node17 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"-->"+" ");
			curr = curr.next;
		}
	}
	Node17 ReverseLinkedListInGroupOfSizeK(Node17 head,int k)
	{
		Node17 curr = head;
		Node17 prev = null;
		Node17 next = null;
		int count =0;
		while(curr != null && count < k)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(next != null)
		{
			Node17 rest_head = ReverseLinkedListInGroupOfSizeK(next,k);  //Recursive calls for remaining nodes.
			
			head.next = rest_head;
		}
		return prev; // prev is the head of the Linked list;
		
	}
}
public class Reverse_A_LinkedList_In_Group_Of_SizeK {

	public static void main(String[] args)
	{
           List17 l = new List17();
            l.insert(5);
            l.insert(4);
            l.insert(3);
            l.insert(2);
            l.insert(1);
            
            l.print();
        Node17 new_head =  l.ReverseLinkedListInGroupOfSizeK(l.head,3);
        System.out.println();
        System.out.print("Reverse Of a LinkedList In Group Of Size K :" );
        System.out.println();
        while(new_head != null)
        {
        	System.out.print(new_head.data+"-->"+" ");
        	new_head = new_head.next;
        }
	}

}
