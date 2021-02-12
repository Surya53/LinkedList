package LinkedList_geeksforgeeks;

class node23
{
	int data;
	node23 next;
	node23(int d)
	{
		data = d;
	}
}

class List23
{
	node23  head;
	void insert(int x)
	{
		node23 new_node = new node23(x);
		new_node= head;
		head = new_node;
	}
	
	void printList(node23 head)
	
	{
		node23 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"-->"+" ");
			curr = curr.next;
		}
	}
	
	void DeleteANodeWithReferences(node23 node)
	{
		node23 temp =  node.next;
		node.data = temp.data;
		node.next = temp.next;
		
	}
	
	
}
public class Delete_A_Node_reference_given_to_it {

	public static void main(String[] args) 
	{
		
		  List23 l = new List23();      
        
		  l.insert(7);
		  l.insert(6);
		  l.insert(5);
		  l.insert(4);
		  l.insert(3);
		  l.insert(2);
		  l.insert(1);
         
		  
		  l.printList(l.head);
		  
		//  System.out.println();
		//  node23 node = l.head.next.next.next;
		//  l.DeleteANodeWithReferences(node);
		  
		//  l.print();
	}

}
