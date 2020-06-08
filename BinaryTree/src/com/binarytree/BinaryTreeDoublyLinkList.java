package com.binarytree;



class Node 
{
	int data;
	Node left,right;
	public Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
		
	}
	
}
public class BinaryTreeDoublyLinkList {
int flag =0;
Node root;
Node  parent ;




public static void main(String[] args) {
	BinaryTreeDoublyLinkList tree=new BinaryTreeDoublyLinkList();
	
	tree.root =new Node(1); 
	tree.root.left=new Node(2);
	tree.root.right=new Node(3);
	tree.root.left.left=new Node(4);
	tree.root.left.right=new Node(5);
	tree.root.left.right.left=new Node(8);
	tree.root.right.left=new Node(6);
	tree.root.right.right=new Node(7);
	tree.inOrder(tree.root);

        tree.createlinkedlist(tree.root);
        System.out.println("\n List Traveing ");
       tree.listTraversing(tree.root);
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

private void createlinkedlist (Node root)
{    Node node =null; 


	if(root==null)
		return ;
	createlinkedlist(root.left);
	if(flag == 0)
	{
		parent=root;
		flag=1;
	}
	else
	{
		root.left=parent;
		parent.right=root;
		parent=root;
	}
    
	 createlinkedlist(root.right);
	 
}

	
	
}
