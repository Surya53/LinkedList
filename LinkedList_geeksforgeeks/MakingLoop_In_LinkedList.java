package LinkedList_geeksforgeeks;
import java.util.*;
class Node19
{
	int data;
	Node19 next;
	Node19(int d)
	{
		data = d;
	}
}
class List19
{
	Node19 head;
	void insert(int x)
	{
		Node19 new_node = new Node19(x);
		new_node.next = head;
		head = new_node;
	}
	int totalnodes()
	{
	int count = 0;
     Node19 curr = head;
     while(curr != null)
     {
    	 count++;
    	 curr = curr.next;
     }
     return count;
	}
	void print(Node19 head ,int totalNodes)
	{
		Node19 curr = head;
		int count = 0;
		while(count < totalNodes)
		{
			count++;
			System.out.print(curr.data+"-->"+" ");
			curr = curr.next;
		}
	}
     void makeloop(Node19 head,int k)
	{
		Node19 temp = head;
		int count = 1;
		while(count < k)
		{
			temp = temp.next;
			count++;
		}
		// backup the joint point  
		Node19 joint_point = temp;
		// backup the joint point  
		while(temp.next != null)
		{
			temp = temp.next;
		}
		 // joint the last node to k-th element  
		temp.next = joint_point;
	//	return head;
	}
}
public class MakingLoop_In_LinkedList
{
	public static void main(String[] args) 
	{
		  List19 l = new List19();
		  l.insert(7);
		  l.insert(6);
		  l.insert(5);
		  l.insert(4);
		  l.insert(3);
		  l.insert(2);
		  l.insert(1);
		  
		 // System.out.println();
		  int totnodes = l.totalnodes();
		  l.print(l.head,totnodes);
		 System.out.println();
		
         l.makeloop(l.head,2);
         l.print(l.head,totnodes+1);
         
		/*  while(new_head != null)
		  {
			  System.out.print(new_head.data+"-->"+" ");
			  new_head = new_head.next;
		  }*/
            
         }

}
