package practiceprograms;
class Animal{
	public void display() {
	System.out.println("It is a dog");
	}
}
class Dog {
	public void display() {
		System.out.println("It is a Golden dog");
		
	}
	
}

public class Over_ridding {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.display();

	}

}
