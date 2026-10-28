package SkillBuilders;

public class Circle1
{
private double radius;

public Circle1 (double radius) {
	this.radius = radius;
}

public Circle1() {
	this.radius = 0;
}

public double circumference () {
	return 2 * Math.PI * this.radius;
}

public void setRadius(double radius) {
    this.radius = radius;
}

public double getRadius() {
    return this.radius;
}




	

	    
	

public static double displayAreaFormula(double radius) {
    return Math.PI * Math.pow(radius, 2);
}
public static void main(String [] args) {
	Circle1 spot = new Circle1(3);
	
	System.out.println("Circle radius: " + spot.getRadius());
	System.out.println("Circle circumference: " + spot.circumference());
	
	 System.out.println("Circle area: " + displayAreaFormula(spot.getRadius()));
}
}
