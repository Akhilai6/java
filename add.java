package javalab;

public class add {
	public int sum(int x ,int y) {
	 int result =  x+y;
	 return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		int y = 5;
		add myObj = new add();
	    int result = myObj.sum(x , y);
	    System.out.println(result);
		System.out.println(Math.sqrt(x));
		String name = "Akhila";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());

	}

}
