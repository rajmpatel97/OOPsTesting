class One {
	public void display() {
		System.out.println("1 number");
	}
}

class Two extends One {
	public void display() {
		System.out.println("2 number");
	}

	public int add(int x, int y) {
		return x + y;
	}

	public double add(double x, double y) {
		return x + y;
	}
}

class Test {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}
}

abstract class Employee {
	public abstract void teach();
}

class Teacher extends Employee {
	public void teach() {
		System.out.println("\nteacher is teaching...");
	}
}

public class TestOOPs {

	public static void main(String[] args) {
		One a = new One();
		a.display();
		Two b = new Two();
		b.display();
		System.out.println(b.add(5, 6));
		System.out.println(b.add(4.0, 5.2));
		Test en = new Test();
		en.setName("swara");
		System.out.print("Name:" + en.getName());
		Employee ne = new Teacher();
		ne.teach();

	}

}
