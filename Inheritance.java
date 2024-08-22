package practiceprograms;
class Employee{
	int salary = 60000;
}
class Engineer extends Employee{
	int bonus = 10000; 
}
class Inheritance {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer E1  = new  Engineer();
		System.out.println("salary : " +E1.salary + "\nbonus : " + E1.bonus);
	}

}
