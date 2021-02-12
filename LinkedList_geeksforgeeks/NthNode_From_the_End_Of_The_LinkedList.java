package LinkedList_geeksforgeeks;
class Node13
{
  int data;
  Node13 next;
  Node13(int d)
  {
	  data = d;
  }
}
class List11
{
	Node13 head ;
	
	void insert(int x)
	{
	   Node13 new_node = new Node13(x);
			 new_node.next = head;
	       head = new_node;
	}
	void printNthnodeFromEnd(Node13 head,int n)
	{
		int len = 0;
		for(Node13 curr = head;curr !=  null;curr=curr.next)
		{
			len++;
		}
		if(len < n)
		{
			return;
		}
		Node13 curr = head;
		for(int i =1;i<len-n+1;i++)
		{
			curr = curr.next;
		}
		System.out.println(curr.data);
	}
	void printList()
	{
		Node13 curr = head; 
		while(curr != null)
		{
	     		System.out.print(curr.data+"---> ");
	     		curr = curr.next;
		}
	}
}
public class NthNode_From_the_End_Of_The_LinkedList {

	public static void main(String[] args)
	{
	   List11 l = new List11();
	   l.insert(10);
	   l.insert(9);
	   l.insert(8);
	   l.insert(7);
	   l.insert(6);
	   
	   l.printList();
	   System.out.println();
	   l.printNthnodeFromEnd(l.head,2);  
	}

}
