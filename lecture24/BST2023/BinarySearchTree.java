import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Stack;

public class BinarySearchTree<E extends Comparable<E>> {

    // A static nested class used to store the elements of this tree

    private static class Node<T> {
        private T value;
        private Node<T> left;
        private Node<T> right;
        private Node(T value ) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    private Node<E> root = null;
    
    /**
     * Inserts an object into this BinarySearchTree.
     *
     * @param obj item to be added
     * @return true if the object has been added and false otherwise
     */

    public boolean add(E obj) {

        // pre-condtion:

        if ( obj == null ) {
            throw new IllegalArgumentException( "null" );
        }

        // special case:

        if ( root == null ) {
            root = new Node<E>(obj);
            return true;
        }

        // general case:

        return add( obj, root );
    }

    private boolean add( E obj, Node<E> current ) {

        boolean result;
        int test = obj.compareTo( current.value );

        if ( test == 0 ) {
            result = false;
        } else if ( test < 0 ) {
            if ( current.left == null ) {
                current.left = new Node<E>( obj );
                result = true;
            } else {
                result = add( obj, current.left );
            }
        } else {
            if ( current.right == null ) {
                current.right = new Node<E>( obj );
                result = true;
            } else {
                result = add( obj, current.right );
            }
        }
        return result;
    }

 
    /**
     * Looks up for obj in this BinarySearchTree, returns true
     * if obj is found and false otherwise.
     *
     * @param obj value to look for
     * @return true if the object has been found and false otherwise
     */

    public boolean contains( E obj ) {

        // pre-condtion:

        if ( obj == null ) {
            throw new IllegalArgumentException( "null" );
        }

        return contains( obj, root );
    }

    private boolean contains( E obj, Node<E> current ) {

        boolean result;

        if ( current == null ) {
            result = false;
        } else {

            int test = obj.compareTo( current.value );
            if ( test == 0 ) {
                result = true;
            } else if ( test < 0 ) {
                result = contains( obj, current.left );
            } else {
                result = contains( obj, current.right );
            }
        }
        return result;
    }

 

    public int depth() {
        return depth( root );
    }

    private int depth( Node<E> current ) {

        if ( current == null ) {

            return -1;

        } else {

            int dleft, dright;

            dleft = depth( current.left ); 
            dright = depth( current.right ); 

            return Math.max( dleft, dright ) + 1;
        }

    }
        
    public String toString() {
        return toString( root, "" );
    }

    
    private static String NL = System.getProperty( "line.separator" );

    private String toString( Node<E> current, String padding ) {

        String result;

        if ( current == null ) {
            
            result = padding + "null" + NL;

        } else {

            result = toString( current.right, padding + "  " );
            result += padding + current.value + NL;
            result += toString( current.left, padding + "  " );
        }

        return result;
    }

    private void process( Node<E> current ) {
	System.out.print( " " + current.value );
    }

    public void preOrder() {
        preOrder( root );
		System.out.println();
    }

    private void preOrder( Node<E> current ) {
        if ( current != null ) {
		    process( current );
            preOrder( current.left );
            preOrder( current.right );
        }

    }

    public void inOrder() {
        inOrder( root );
		System.out.println();
    }

    private void inOrder( Node<E> current ) {

        if ( current != null ) {

            inOrder( current.left );
	    	process( current );
            inOrder( current.right );
        }
    }

    public void postOrder() {
        postOrder( root );
		System.out.println();
    }

    private void postOrder( Node<E> current ) {

        if ( current != null ) {
            postOrder( current.left );
            postOrder( current.right );
	    	process( current );
        }
    }
}
