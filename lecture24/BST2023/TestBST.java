public class TestBST {
	public static void testIntegerBST() {
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
	
		t.add(8);
		t.add(5);
		t.add(15);
		t.add(9);
		t.add(29);
		t.add(11);
	
		System.out.println(t);

		System.out.print( "preOrder ->" );
		t.preOrder();

		System.out.print( "inOrder ->" );
		t.inOrder();

		System.out.print( "postOrder ->" );
		t.postOrder();
	
	}

	public static void testStringBST() {
		BinarySearchTree<String> t = new BinarySearchTree<String>();
	
		t.add("m");
		t.add("p");	
		t.add("a");
		t.add("x");
		t.add("v");
		t.add("b");
		t.add("l");
		t.add("n");

		System.out.println(t);

		System.out.print( "preOrder ->" );
		t.preOrder();

		System.out.print( "inOrder ->" );
		t.inOrder();

		System.out.print( "postOrder ->" );
		t.postOrder();
	
	}

    public static void main( String[] args ) {
    	testIntegerBST();
    	System.out.println("\n--------------------------\n");
    	testStringBST();
    }

}
