package javalab;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 1441,r,reverse=0,temp=num;
        while(num != 0) {
        	r = num%10;
        	reverse = reverse*10+r;
        	num = num/10;
        }
     if(reverse == temp) {
    	 System.out.println("num is a palindrom");
     }
     else {
    	 System.out.println("num is not a palindrom number");
     }
	}

}
