public class Test {

	public static void main (String args[]) {
		Container c = new Container(10);
		
		MyInteger myInt = c.getValue();
		
		myInt.setValue(20);
		
		MyInteger myInt2 = c.getValue();
		
		System.out.println(myInt2.getValue());
	
	}

}