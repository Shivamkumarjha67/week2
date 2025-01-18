// EmployeeDetatils class declaration having main methods
public class OperationOnCirlce {
	public static void main(String[] args) {
		// Creating the object of circle class
		Circle circle1 = new Circle(22.4);
		// Calling method of circle class for displaying it's area and circumference
		circle1.displayArea();
		circle1.displayCircumference();
	}
}

// Cirlce class declaration and defination
class Circle {
	// Attribute of circle class
	private double radius;
	
	// Constructor of the circle class, used for the initialization of the variables
	Circle(double radius) {
		this.radius = radius;
	}
	
	// Behaviours of the circle class
	public void displayArea() {
		double areaOfCircle = 22 / 7.0 * radius * radius;
		System.out.println("Area of the circle having radius " + radius + " is: " + areaOfCircle);
	}
	
	public void displayCircumference() {
		double areaOfCircle = 2 * 22 / 7 * radius;
		System.out.println("Circumference of the circle having radius " + radius + " is: " + areaOfCircle);
	}
}