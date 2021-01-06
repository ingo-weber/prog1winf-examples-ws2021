package de.tuberlin.sbe.prog1winf.datastructures;

//import java.util.ArrayList;
//import java.util.List;

public class BTreeTestclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BTree tree = new BTree();
		System.out.println(tree);
		tree.insert(3);
		System.out.println(tree);
		tree.insert(37);
		System.out.println(tree);
		tree.insert(4);
		System.out.println(tree);
		tree.insert(1);
		System.out.println(tree);
		System.out.println(tree.inOrder());


//		//generics examples (no connection to BTree)
//		List<BTree> list = new ArrayList<BTree>();
//		BTree[] array = list.toArray(new BTree[list.size()]);
//		Object[] array2 = list.toArray();
//
//		List<? extends Number> abc = new ArrayList<Integer>();
		
		
	}

}
