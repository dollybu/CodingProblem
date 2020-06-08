package com.binarytree;


public class KthValueBT {
	Node root;




public static void main(String[] args) {
	KthValueBT tree=new KthValueBT();
	
	tree.root =new Node(1); 
	tree.root.left=new Node(2);
	tree.root.right=new Node(23);
	tree.root.left.left=new Node(4);
	tree.root.left.left.left=new Node(9);

	tree.root.left.right=new Node(5);
	tree.root.left.right.left=new Node(6);
	tree.root.left.right.right=new Node(7);
	tree.root.left.right.left.left =new Node(12);
	tree.root.left.right.left.left.right =new Node(19);
	tree.root.left.right.right.right=new Node(10);
	tree.root.left.right.right.right.right=new Node(11);
	tree.root.right.right=new Node(32);

     	tree.inOrder(tree.root);
        System.out.println("\n kth distance nod");
       tree.findKthDistance(tree.root,3);
}

private void findKthDistance(Node node, int k) {
	if(node == null)
		return;
	if(k ==0)
	{
		System.out.print(node.data+" ");
	}
	else
	{
		findKthDistance(node.left, k-1);
		findKthDistance(node.right, k-1);
	}
		
}

void listTraversing(Node node) {
	
while (node != null) { 
    System.out.print(node.data + " "); 
    node.left = node; 
    node = node.right; 
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
