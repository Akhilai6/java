package programs;
class Computer1{
	String brand;
	int speed;
	public class Processor{
		void displayDetails() {
			brand = "Lenova";
			speed = 1000;
			System.out.println(brand);
			System.out.println(speed);
		}
	}
}

public class Computer{ 
	public static void main(String[] args) {
	Computer1 myout = new Computer1();
    Computer1.Processor myin = myout.new Processor();
    myin.displayDetails();
	}
}


