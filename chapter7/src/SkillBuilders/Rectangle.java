package SkillBuilders;

public class Rectangle 
{

	private double length;
	private double width;
	
	

	public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
	
	
	public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }
	
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }
	
	public double area() {
		return (length * width);
	}
	
	public double perimeter() {
		return (2 * length + 2 * width);
	}
	
	
	public static void main(String [] args) {
		Rectangle spot = new Rectangle(5, 3);
		

		System.out.println("Rectangle area: " + spot.area());
		System.out.println("Rectangle perimeter: " + spot.perimeter());

	}

}
