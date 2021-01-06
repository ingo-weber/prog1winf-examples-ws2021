package de.tuberlin.sbe.prog1winf.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BTree {

	private BTreeNode root;

	public void insert(int value){
		if(root==null){
			this.root = new BTreeNode(value);
			return;
		}
		insert(root,value);
	}
	
	private void insert(BTreeNode node, int value) {
		if (node.value > value) {
			// links
			if (node.left == null) {
				// hier einfuegen
				node.left = new BTreeNode(value);
				return;
			} else {
				// an Kindknoten delegieren
				insert(node.left, value);
			}

		} else if (node.value < value) {
			// rechts
			if (node.right == null) {
				node.right = new BTreeNode(value);
				return;
			} else {
				insert(node.right, value);
			}

		} else {
			return;
		}
	}

	@Override
	public String toString() {
		// slightly ugly bread-first search -- purpose: to show the internal state of the tree
		// null values are printed as "X"
		if (root == null) return "No root value";
		StringBuffer strB = new StringBuffer();
		List<BTreeNode> printQueue = new LinkedList<>();
		printQueue.add(root);
		int nodesInPrintQueue = 1;

		while (nodesInPrintQueue > 0) {
			nodesInPrintQueue = 0;
			List nextLevelPrintQueue = new LinkedList();

			for (BTreeNode node : printQueue) {
				if (node == null) {
					strB.append(" X;");
					continue;
				}
				strB.append(" " + node.value + ";");
				nextLevelPrintQueue.add(node.left);
				nextLevelPrintQueue.add(node.right);
				nodesInPrintQueue += 2;
			}
			strB.append(System.lineSeparator());
			printQueue = nextLevelPrintQueue;
		}
		return strB.toString();
	}

	public String inOrder() {
		return inOrder(root);
	}
	private String inOrder(BTreeNode current) {
		String res = "";
		if (current.left != null)
			res += inOrder(current.left) + ",";
		res += current.value;
		if (current.right != null)
			res += "," + inOrder(current.right);
		return res;
	}

}
