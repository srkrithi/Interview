package queueStacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueRecursion {

	static Queue<Integer> queue;
	  
	static void Print()
    {
        while (!queue.isEmpty()) 
        {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
	
	
	static void reversequeue()
    {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
	static Queue<Integer> reverseQueue(Queue<Integer> q)
	{
	    // Base case
	    if (q.isEmpty())
	        return q;
	 
	    // Dequeue current item (from front)  
	    int data = q.peek();
	    q.remove();
	 
	    // Reverse remaining queue  
	    q = reverseQueue(q);
	 
	    // Enqueue current item (to rear)  
	    q.add(data);
	         
	    return q;
	}
	public static void main(String args[]) {
		queue = new LinkedList();
		queue.add(56);
	    queue.add(27);
	    queue.add(30);
	    queue.add(45);
	    queue.add(85);
	    queue.add(92);
	    queue.add(58);
	    queue.add(80);
	    queue.add(90);
	    queue.add(100);
	    
	    
	    
	    //queue = reverseQueue(queue);
	    reversequeue();
	    Print();
	}
}
