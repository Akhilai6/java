package programs;

public class Dog {
	String name;
	String color;
	public Dog(String name,String color) {
		System.out.println(name);
		System.out.println(color);
	}

	public static void main(String[] args) {
		Dog obj = new Dog("tommy","brown");

	}

}
