public class Constant {

	private String name;
	private double value;
	
	public Constant (String name, double value) {
		this.name = name;
		this.value = value;
	}

	public static void main (String[] args) {
		Constant c = new Constant ("golden ratio", 1.61);
		//Constant c = new Constant();
		System.out.println(c.name);
	}
}
