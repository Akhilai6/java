package programs;

class Animal {
	void move() {
		System.out.println("This is Cheetha");
	}
public class Cheetha extends Animal{
	void move() {
		System.out.println("This is Cheetha from Cheetha class");
	}
}

	public static void main(String[] args) {
		Animal myOut = new Animal();
		Animal.Cheetha myIn =myOut.new Cheetha();
		myIn.move();

	}

}
