package practiceprograms;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an operator: ");
		Scanner n = new Scanner(System.in);
		String symbol = n.nextLine();
		System.out.println("Enter a number: ");
		Scanner m = new Scanner(System.in);
		int a = m.nextInt();
		System.out.println("Enter a number: ");
		Scanner o = new Scanner(System.in);
		int b = o.nextInt();
		switch(symbol){
			case "+":
				System.out.print(a+b);
				break;
			case "-":
				System.out.print(a-b);
			case "*":
				System.out.print(a*b);
				
			case "/":
				System.out.print(a/b);
			case "%":
				System.out.print(a%b);
			default:
				System.out.print("enter valid symbol");
				
				
		}
		

	}

}
