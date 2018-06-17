package linkedlist;

public class LinkedListPalindrome {
	public Node head;
	public LinkedListPalindrome() {
		this.head = null;
	}
	public static class Node{
		public int val;
		public Node next;
		
		public Node(int value){
			this.val = value;
			this.next = null;
		}
	}
	
	public void addToTheLast(Node node) {
		 
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
	
	public static void printList(Node curNode) {
		Node temp = curNode;
		while(temp != null) {
			System.out.println("Node is "+temp.val);
			temp = temp.next;
		}
	}
	
	public static boolean isPalindrome(Node head) {
		//first option
		//reverse list and compare with original list
		
		//second option O(n) and space O(1)
		//break and reverse second half of list and compare
		Node fast = head, slow = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		Node secondHead = slow.next;
		slow.next = null;
		
		Node p1 = secondHead;
		Node p2 = p1.next;
		
		while(p1!= null && p2 !=null) {
			Node temp = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = temp;
		}
		
		secondHead.next = null;
		
		Node p = (p1 == null)?p2 : p1;
		Node q = head;
		
		while(p!=null) {
			if(p.val != q.val) {
				return false;
			}
			p = p.next;
			q=q.next;
		}
		return true;
		
	}
	
	public static void main(String args[]) {
		LinkedListPalindrome in = new LinkedListPalindrome();
		Node head = new Node(1);
		in.addToTheLast(head);
		in.addToTheLast(new Node(2));
		in.addToTheLast(new Node(0));
		in.addToTheLast(new Node(2));
		in.addToTheLast(new Node(1));
		
		printList(head);
		boolean ret = isPalindrome(head);
		System.out.println("return value is "+ret);
	}
}
