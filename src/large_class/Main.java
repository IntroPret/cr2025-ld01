package large_class;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		SemesterMenu semesterMenu = new SemesterMenu();
		semesterMenu.open();
	}
}
