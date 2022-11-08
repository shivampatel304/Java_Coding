
class linkedlist{
	Node head;
	
	static class Node{
		
		int val;
		Node next;
		Node(int val)
		{
			this.val = val;
			next = null;
		}
	}
	
	public linkedlist insert(int x, linkedlist list)
	{
		Node node  = new Node(x);
		
		if(list.head == null)
		{
			list.head = node;
		}
		
		else
		{
			Node last = list.head;
			while(last.next != null)
			{
				last = last.next;
			}
			
			last.next = node;
		}
		
		return list;
	}
	
	public void printList(linkedlist list)
	{
		Node currNode = list.head;
		
		if(currNode == null)
		{
			System.out.println("List is Empty");
		}
		
		else
		{
			while(currNode != null)
			{
				System.out.print(currNode.val + " ");
				currNode = currNode.next;
			}
			System.out.println(" ");
		}
	}
	
	linkedlist removeNodebyValue(int target, linkedlist list)
	{
		Node currNode = list.head;
		//int count = 0;
		
		if(currNode != null && currNode.val == target)
		{
			list.head = null;
			return list;
		}
		
		else
		{
			Node previous = null;
			while(currNode.val != target)
			{
				previous = currNode;
				currNode = currNode.next;
			}
			
			if(currNode != null)
			{
				previous.next = currNode.next;
			}
			else
			{
				System.out.println("Number doesnt found");
			}
		}
		
		return list;
	}
}

public class LinkedList_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 linkedlist list  = new linkedlist();
		 list.insert(1, list);
		 list.insert(2, list);
		 list.removeNodebyValue(2, list);
		 list.printList(list);
	}

}

