public class Graphics {
	public static void displayAll(Displayable[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i].display();
		}
	}
}