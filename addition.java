import java.util.Scanner;
public class addition{
    public int add(int a ,int b){
        int result = a+b;
        return result;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    addition a1 = new addition();
    System.out.println("Sum is:" + (a1.add(num1,num2)));
    }
}
