package practiceprograms;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner n = new Scanner(System.in);
         System.out.println("Enter name: ak");
         String name = n.nextLine();
         System.out.println("Enter roll_no: ");
         String roll_no = n.nextLine();
         System.out.println("Enter department: ");
         String department = n.nextLine();
         System.out.println(name);
         System.out.println(roll_no);
         System.out.println(department);

	}

}
