public class Container {
	MyInteger myVariable;
	
	public Container(int value) {
		myVariable = new MyInteger(value);
	}
	
	public MyInteger getValue() {
		return myVariable;
	}
	
	public int getIntValue() {
		return myVariable.getValue();
	}
	
}