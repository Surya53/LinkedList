package LinkedList_geeksforgeeks;
class node27
{
	int data;
	node27 next;
	node27 (int d)
	{
		data = d;
	}
}
class List27
{
	node27 head;
	void insert(int x)
	{
		node27 newnode = new node27(x);
		newnode.next = head;
    	  head = newnode;
	}
	void print10()
	{
		node27 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"-->"+" ");
			curr = curr.next;
		}
	}
	void pairwiseswap()
	{
		node27 temp = head;
		while (temp != null && temp.next != null)
		{
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
	}
}
public class PairWiseSwapping 
{
	public static void main(String[] args)
	{
		List27 l = new List27();
		l.insert(7);
		l.insert(8);
		l.insert(9);
		l.insert(10);
		l.insert(17);

		l.print10();
		System.out.println();
		 
        l.pairwiseswap();
        l.print10();
	}

}
