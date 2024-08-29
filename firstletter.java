import java.util.Scanner;

public class firstletter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
	System.out.print("Enter your name: ");
        name = sc.nextLine();
	char firstLetter = name.charAt(0);
        System.out.println("The first letter of your name is: " + firstLetter);
    }
}
