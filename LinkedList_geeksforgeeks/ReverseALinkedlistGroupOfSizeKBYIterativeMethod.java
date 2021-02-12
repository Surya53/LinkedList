package LinkedList_geeksforgeeks;
class Node18
{
	int data;
	Node18 next;
	Node18 (int d)
	{
		data = d;
	}
}
class List18
{
	Node18 head;
	void insert(int x)
	{
		Node18 new_node = new Node18(x);
		new_node.next = head;
		head = new_node;
	}
	void print()
	{
		Node18 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"-->"+" ");
			curr = curr.next;
		}
	}
	Node18 ReverseLinkedListInGroupOfSizeK(Node18 head,int k)
	{
		Node18 curr = head;
		Node18 prevFirst = null;
		boolean isFirstPass = true;
		while(curr != null)
		{
			
			Node18 first = curr;
			Node18 prev = null;			
			int count = 0;
			while(curr != null && count < k)
			{
				Node18 next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				count++;
			}
			if(isFirstPass)
			{
				head = prev;
				isFirstPass = false;
			}
			else
			{
				prevFirst.next = prev;
				 prevFirst = first;
			}
		}
		return head;
		
	}
}
public class ReverseALinkedlistGroupOfSizeKBYIterativeMethod {

	public static void main(String[] args)
	{
       List18 l = new List18();
       l.insert(9);
       l.insert(8);
       l.insert(7);
       l.insert(6);
       l.insert(5);
       
       l.print();
       System.out.println();
       l.ReverseLinkedListInGroupOfSizeK(l.head,3);
	}

}
