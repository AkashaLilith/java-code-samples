/*
 * Create linked lists using user-defined linked list class (ListNode)
 * and print their values using user-defined method in that class
 */

public class ListNodeApp {

	//create and print linked lists
	public static void main(String[] args) {
		
		ListNode L1 = new ListNode (1, new ListNode(2, new ListNode(4)));;
		ListNode L2 = new ListNode (1, new ListNode(3, new ListNode(4)));;
		
		System.out.print("List 1: ");
		ListNode.print(L1);
		
		System.out.print("List 2: ");
		ListNode.print(L2);

	}
	
	//user-defined class for ListNode object (node of a linked list)
	public static class ListNode {
		
		public int data;       //data stored in the node
	    public ListNode next;  //link/reference to next node in the linked list

	    //default constructor
	    public ListNode() {
	        this(0, null);
	    }
	    
	    //non-default constructor
	    //construct a node with given data and null link/reference
	    public ListNode(int data) {
	        this(data, null);
	    }

	    //non-default constructor
	    //construct a node with given data and given link/reference
	    public ListNode(int data, ListNode next) {
	        this.data = data;
	        this.next = next;
	    }
	    
	    //print values of each node in linked list, separated by "->"
	    public static void print(ListNode pointer) {
			while(pointer != null) { //loop through linked list, i.e. go to each node, until null node is reached
				System.out.print(pointer.data + "->"); //pointer.data is int; so, System.out.print can be used on it
				pointer = pointer.next; //move to next node by assigning the reference of next node to current node 
			}
			System.out.println("null");		
		} 
	}
}
