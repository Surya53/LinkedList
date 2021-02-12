package LinkedList_geeksforgeeks;
import java.lang.*; // for abs function.
class node26
{
	int data;
	node26 next;
	node26(int d)
	{
		data = d;
	}
}
class List26
{
  node26 head;
  void insert(int x)
  {
	  node26 newnode = new node26(x);
	  newnode.next = head;
	   head = newnode;  
  }
  void print()
  {
	  node26 curr = head;
	  while(curr != null)
	  {
		  System.out.print(curr.data+"-->"+" ");
		  curr = curr.next;
	  }
  }
  int countnodes()
  {
	  node26 curr = head;
	  int count = 0;
	  while(curr != null)
	  {
		  count++;
		  curr = curr.next;
	  }
	  return count;
  }
  int getnode(int c1,int c2)
  { 
	int d = Math.abs(c1-c2);  	
	  return d;
  }
  int getintersectionnode(int d,node26 head,node26 head1)
  {
	  node26 curr1 = head;
	  node26 curr2 = head1;
	  //move the reference to forward
	  for(int i=0;i<d;i++)
	  {
		  if(curr1 == null)
			  return -1;
		  curr1 = curr1.next;
	  }
	  while(curr1 != null && curr2 != null)
	  {
		  if(curr1.data == curr2.data)
		  {
			  return curr1.data;
		  }
		  curr1 = curr1.next;
		  curr2 = curr2.next;
	  }
	  return -1;
  }
}


public class IntersectionOfTwoLinkedList {

	public static void main(String[] args)
	{
      List26 l =  new List26();
      l.insert(10);
      l.insert(8);
      l.insert(7);
      l.insert(6);
      l.insert(5);
      System.out.println("Linked List 1 : ");
      l.print();
      System.out.println();
      
      List26 k = new List26();
     // k.insert(9);
      k.insert(10);
      k.insert(8);
      k.insert(7);
      System.out.println("Linked List 2 :");
      k.print();
      System.out.println();
      int c1 = l.countnodes();
	  int c2 = k.countnodes();
	  int d = l.getnode(c1,c2);
	  System.out.print("For intersection nodes start : "+d);
	 int intersectionnode =  l.getintersectionnode(d, l.head,k.head);

	 System.out.println();

	 System.out.println(intersectionnode);
	}

}
