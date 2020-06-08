package com.binarytree;


public class BoundaryNode {
	static Node root;




public static void main(String[] args) {
	BoundaryNode tree=new BoundaryNode();
	
	tree.root =new Node(1); 
	tree.root.left=new Node(2);
	tree.root.right=new Node(3);
	tree.root.left.right=new Node(5);
	tree.root.left.right.left=new Node(8);
	tree.root.left.right.right=new Node(4);


	tree.root.right.left=new Node(6);
	tree.root.right.right=new Node(7);
	tree.root.right.left.right=new Node(16);
	tree.root.right.right.left=new Node(17);


	
			
	tree.printBoundaryNode(root);
	
}



private void printBoundaryNode(Node node) {
 if(node ==null)
	 return ;
 
 if(node!=null)
 {
	 System.out.print(node.data+" "); 
	 leftInternalNode(node.left);
	 leaveNode(node);
	 rightInternalNode(node.right);
	 
 }
	
	
}






private void rightInternalNode(Node node) {
	if(node !=null)
	{
		if(node.right!=null)
		{
			rightInternalNode(node.right);
			System.out.print(node.data+" ");
		}
		else if(node.left!=null)
		{
			rightInternalNode(node.right);
			System.out.print(node.data+" ");
		}
		
		
	}

				

	
	
}










private void leaveNode(Node node) {
	
	if(node!=null)
	{
	     leaveNode(node.left);

		if(node.left == null && node.right==null)
			System.out.print(node.data+" ");
		     leaveNode(node.right);
	}
}




private void leftInternalNode(Node node) {

	if(node !=null)
	{
		if(node.left!=null)
		{
			System.out.print(node.data +" ");
			leftInternalNode(node.left);

		}
		else if(node.right!=null)
	    {
			System.out.print(node.data+ " ");
			leftInternalNode(node.right);
			
		}
		
	}
}




void inOrder(Node node) 
{ 
    if (node == null) 
        return; 

    inOrder(node.left); 
    System.out.print(node.data + " "); 

    inOrder(node.right); 
} 



	
	
}
