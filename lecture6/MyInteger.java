public class MyInteger {
	private int value;
	
	public MyInteger (int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int i) {
		this.value = i;
	}
	
	public boolean equals (MyInteger other) {
		return this.value == other.value;
	}
}
