package programs;

class Shape {
	double getArea() {
    double length = 4.5;
    double breadth = 5.5;
    return length*breadth;
  }
	 public class  Rectangle extends Shape{
		double getArea() {
			double length = 4.5;
			double breadth =3.5;
			return length*breadth;
		}
	 }
	
	public static  void main(String[] args) {
		Shape out = new Shape();
	    Shape.Rectangle obj = out.new Rectangle();
		System.out.println(obj.getArea());
	}
	
}

