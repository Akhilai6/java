class Personn{
    public void getFirstName(){
        System.out.println("Akhila");
    }
    public void getLastName(){
        System.out.println("k");
    }
class Employee extends Personn{
    public void EmployeeID(){
        System.out.println("23wh1a05i6");
    }
    public void getLastName(){
        System.out.println("Job Title:HR");
    }
}
    public static void main(String[] args){
        Personn p1 = new Personn();
        Employee e1 = p1.new Employee();
        e1.EmployeeID();
        e1.getLastName();
    }

}

