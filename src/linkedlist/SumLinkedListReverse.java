package linkedlist;

public class SumLinkedListReverse {

	public Node head;
	public SumLinkedListReverse() {
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
	
	public static Node reverseList(Node curNode) {
		Node prev = null;
		Node next;
		while(curNode != null) {
			next = curNode.next;
			curNode.next = prev;
			prev = curNode;
			curNode = next;
		}
		System.out.println("reversed list is ");
		printList(prev);
		return prev;
	}
	
	public static void printList(Node curNode) {
		Node temp = curNode;
		while(temp != null) {
			System.out.println("Node is "+temp.val);
			temp = temp.next;
		}
	}
	
	public static Node sumLists(Node head1, Node head2) {
		Node ret = null, prev = null;
		int carry = 0, sum = 0;
		while(head1 != null || head2 != null) {
			sum = carry + ((head1 != null ? head1.val:0) + (head2!=null? head2.val : 0));
			if(sum>=10) {
				carry = sum/10;
			}
			sum = sum % 10;
			Node temp = new Node(sum);
			if(ret == null) {
				ret = temp;
			}
			else {
				prev.next = temp;
			}
			prev = temp;
			head1 = head1.next;
			head2 = head2.next;
		}
		
		if(carry > 0 ) {
			prev.next = new Node(carry);
		}
		
		return ret;
	}
	
	public static void main(String args[]) {
		SumLinkedListReverse in = new SumLinkedListReverse();
		Node head = new Node(5);
		in.addToTheLast(head);
		in.addToTheLast(new Node(2));
		in.addToTheLast(new Node(7));
		
		printList(head);

		Node ret1 = reverseList(head);
		
		SumLinkedListReverse in2 = new SumLinkedListReverse();
		Node head2 = new Node(7);
		in2.addToTheLast(head2);
		in2.addToTheLast(new Node(8));
		in2.addToTheLast(new Node(2));

		printList(head2);
		
		Node ret2 = reverseList(head2);
		
		Node retSum = sumLists(ret1, ret2);
		System.out.println("added lists are ");
		printList(retSum);
		
	}
}
