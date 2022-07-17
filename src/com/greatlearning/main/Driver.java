package com.greatlearning.main;

import com.greatlearning.service.LeastCommonAnc;
import com.greatlearning.service.Node;

public class Driver {
public static void main(String[] args) {
	LeastCommonAnc tree = new LeastCommonAnc();
	tree.root = new Node(10);
	tree.root.left = new Node(20);
	tree.root.right = new Node(30);
	tree.root.left.left = new Node(40);
	tree.root.left.right = new Node(50);
	tree.root.right.left = new Node(60);
	tree.root.right.right = new Node(70);
	System.out.println("LCA (20,30)"+ tree.findLCA(20,30));
	System.out.println("LCA (40,30)"+ tree.findLCA(40,30));
	System.out.println("LCA (60,70)"+ tree.findLCA(60,70));
	System.out.println("LCA (20,40)"+ tree.findLCA(20,40));




	
}
}
