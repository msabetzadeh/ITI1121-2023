public class MyInteger {
	private int value;
	
	public MyInteger (int value) {
		this.value = value;
	}
	
	public boolean equals (MyInteger other) {
		return this.value == other.value;
	}
}
