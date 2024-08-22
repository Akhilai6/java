package practiceprograms;

public class Over_load {
	public String student(String name) {
    	return name;
    }
    public String student(String name,String dep) {
    	return name  +  dep;
    }
    public String student(String name,int roll_no) {
      return name  +   roll_no;
    } 	

	public static void main(String[] args) {
		Over_load sc = new Over_load();
		System.out.println(sc.student("akhila"));
		System.out.println(sc.student("akhila","CSE"));
		System.out.println(sc.student("akhila",6));
	}

}
