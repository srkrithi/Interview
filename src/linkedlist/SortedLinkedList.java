package linkedlist;

import linkedlist.LinkedListPalindrome.Node;

public class SortedLinkedList {
	public Node head;
	public SortedLinkedList() {
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
	
	public static boolean sorted(Node head) {
		if(head == null) {
			return false;
		}
		
		for(Node i = head; i.next != null; i = i.next) {
			if(i.val <= i.next.val) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		SortedLinkedList in = new SortedLinkedList();
		Node head = new Node(2);
		in.addToTheLast(head);
		in.addToTheLast(new Node(4));
		in.addToTheLast(new Node(3));
		in.addToTheLast(new Node(2));
		in.addToTheLast(new Node(1));
		boolean ret = sorted(head);
		System.out.println("return is "+ret);
	}
}
