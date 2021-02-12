package LinkedList_geeksforgeeks;
class store
{
	int data;
	store next;
	store (int d)
	{
		data = d;
	}
}
class sublist1
{
	store head;
	void insertAtBegin(int x)
	{
		store temp = new store(x);
		temp.next = head;
		head = temp;
	}
	void PrintList()
	{
		store curr  = head;
		while(curr != null)
		{
			System.out.print(curr.data+"--->");
			curr = curr.next;
		}
		
	}
	void insertAtEnd(int x)
	{
	 store temp = new store(x); 
		if(head == null)
		{
			head = temp;
		}
	 store curr = head;
	 while(curr.next != null)
	 {
		 curr = curr.next;
	 }
	 curr.next = temp;
	 System.out.println(" ");
	}
      
	void PrintList1()
	{
		store curr  = head;
		while(curr != null)
		{
			System.out.print(curr.data+"--->");
			curr = curr.next;
		}
		
	}

}
public class SingleLinkedList {

	public static void main(String[] args) 
	{
	  sublist1 l = new sublist1();
	  l.insertAtBegin(20);
		l.insertAtBegin(5);
		l.insertAtBegin(2);
		
		l.PrintList();
		
		l.insertAtEnd(8);
		l.insertAtEnd(12);
		l.insertAtEnd(19);
		
		l.PrintList1();
	}

}
