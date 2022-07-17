package com.greatlearning.service;

import java.util.ArrayList;
import java.util.List;

public class LeastCommonAnc {
	public Node root;
	private List<Integer> path1 = new ArrayList<>();
	private List<Integer> path2 = new ArrayList<>();

//Find the path from root node to given root
	public int findLCA(int node1, int node2) {
		path1.clear();
		path2.clear();
		return findLCAInternal(root, node1, node2);
	}

	private int findLCAInternal(Node root2, int node1, int node2) {
		if (!findPath(root, node1, path1) || !findPath(root, node2, path2)) {
			System.out.println((path1.size() > 0 ? "node1 is present" : "node1 is missing"));
			System.out.println((path2.size() > 0 ? "node2 is present" : "node2 is missing"));
			return -1;
		}
		int i,j;
//		for (i = path1.size(); i > 0 && i < path2.size(); i++) {
//			if (path1.get(i).equals(path2.get(i)))
//				break;
//		}
//		return path1.get(i-1);
		for(i = path1.size()-1;i > 0 ; i--) {
			for(j = path2.size()-1;j > 0 ; j--) {
				if(path1.get(i).equals(path2.get(j)))
					return path1.get(i);
			}
		}
		return root.data;

	}	
	
	private boolean findPath(Node root, int n, List<Integer> path) {
		// base case
		if (root == null) {
			return false;
		}
		path.add(root.data);
		// Store this node
		if (root.data == n)
			return true;
		if (root.left != null && findPath(root.left, n, path)) {
			return true;
		}
		if (root.right != null && findPath(root.right, n, path)) {
			return true;
		}
		// If not present in a subtree rooted with root from path[] and return false
		path.remove(path.size() - 1);
		return false;

	}
}

