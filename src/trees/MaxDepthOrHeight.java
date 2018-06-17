package trees;


class BinaryTree 
{
	static class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	static int lDepth;
	static int rDepth;
     Node root;
  
    /* Compute the "maxDepth" of a tree -- the number of 
       nodes along the longest path from the root node 
       down to the farthest leaf node.*/
    static int maxDepth(Node node) 
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
      
    /* Driver program to test above functions */
    public static void main(String[] args) 
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
  
        System.out.println("Height of tree is : " + 
                                      maxDepth(root));
    }
}



