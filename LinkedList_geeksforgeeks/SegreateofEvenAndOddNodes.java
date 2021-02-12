package LinkedList_geeksforgeeks;

class node25
{
	int data;
	node25 next;
	node25(int d)
	{
		data = d;
	}
}
class List25
{
	node25 head;
	void insert(int x)
	{
		node25 new_node = new node25(x);
		new_node.next = head;
		head = new_node;
	}
	void print()
	{
		node25 curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+"-->"+" ");
			curr = curr.next;
		}
	}
	node25 SegOfEvenOddNodes()
	{
	   node25 EvenStart = null,EvenEnd=null,OddStart=null,OddEnd=null;
	   node25 curr = head;
	   while(curr != null)
	   {
		   int x  = curr.data;
		   if(x % 2 == 0)
		   {
			   if(EvenStart == null)
			   {
				   EvenStart = curr;
				   EvenEnd = EvenStart;
			   }
			   else
			   {
				   EvenEnd.next = curr;
				   EvenEnd = EvenEnd.next;
			   }
		   }
		   else
		   {
			   if(OddStart == null)
			   {
	               OddStart = curr;
	               OddEnd =  OddStart;
			   }
			   else
			   {
				   OddEnd.next = curr;
				   OddEnd  = OddEnd.next;
			   }
			   
		   }
		   curr  = curr.next;
	   }
	   if(OddStart == null || EvenStart == null)
	   {
		   return  head;
	   }
	   EvenEnd.next = OddStart;
	   OddEnd.next = null;
	   head= EvenStart;
	   return head;
	}
}
public class SegreateofEvenAndOddNodes
{
	public static void main(String[] args)
	{
         List25 l = new List25();
         l.insert(5);
        l.insert(4);
        l.insert(3);
        l.insert(2);
         l.insert(1);
         
         l.print();
         System.out.println();
         node25 new_head=l.SegOfEvenOddNodes();
          while(new_head != null)
          {
        	  System.out.print(new_head.data+"-->"+" ");
        	  new_head = new_head.next;
          }
         
	}

}
