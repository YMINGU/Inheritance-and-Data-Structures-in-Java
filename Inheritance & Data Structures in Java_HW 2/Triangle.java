package triangle;

/**
 * Abstract class representing a triangle.
 */ 
public abstract class Triangle {

	/**
	 * 3 sides of the triangle.
	 */
	protected double sideA, sideB, sideC;
	
	/**
	 * Creates a triangle with the 3 given side lengths.
	 * Checks whether the 3 given sides are valid.  If not, throws an IllegalArgumentException.
	 * @param sideA first side of triangle
	 * @param sideB second side of triangle
	 * @param sideC third side of triangle
	 */
	public Triangle(double sideA, double sideB, double sideC) {
		if (!Triangle.hasValidSize(sideA, sideB, sideC)) {
			throw new IllegalArgumentException("Triangle sides not valid.");
		}
		
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	/**
	 * Checks the length of the given sides of a triangle.  A triangle is valid if the sum of 
	 * any of its two sides is greater than the third side.  This must be true for all three 
	 * combinations of added side lengths.
	 * @param sideA first side of triangle
	 * @param sideB second side of triangle
	 * @param sideC third side of triangle
	 * 
	 * Example(s):
	 * - Calling hasValidSize(1, 1, 1) will return true
	 * - Calling hasValidSize(5, 5, 5) will return true
	 * - Calling hasValidSize(5, 8, 3) will return false
	 * 
	 * @return true if the triangle sides are valid, otherwise false
	 */
	private static boolean hasValidSize(double sideA, double sideB, double sideC) {
	    
		// TODO Implement method
	    
		return false;
	}
	
	/**
	 * Calculates the perimeter of the triangle.
	 * 
	 * Example(s):
     * - For an equilateral triangle with side lengths 5, 5, and 5 
     * - Calling getPerimeter() will return 15.0
     * 
     * - For a right triangle with side lengths 1, 3, and 3.1622 ...
     * - Calling getPerimeter() will return 7.1622 ...
	 * 
	 * @return the perimeter of the triangle
	 */
	public double getPerimeter() {
	    
		// TODO Implement method
	    
		return 0.0;
	}
	
	/**
	 * Abstract method which calculates the area of the triangle.
	 * Should be overridden by subclasses EquilateralTriangle and RightTriangle.
	 * 
	 * @return the area of the triangle
	 */
	public abstract double getArea();
	
	/**
	 * Runs and controls the program, creating different kinds of triangles 
	 * and printing useful information about them for debugging.
	 */
	public static void run() {
		System.out.println("--------------------------------------------");	
		
		// Results should be:
		//  1.0, 1.0, 1.0
		//  0.4330 ...
		//  3.0
		EquilateralTriangle et = new EquilateralTriangle(1);
		System.out.println("Equilateral Triangle's sides are: " + et.sideA + ", "+ et.sideB + ", " + et.sideC);
		System.out.println("Equilateral Triangle's area is: " + et.getArea());
		System.out.println("Equilateral Triangle's perimeter is: " + et.getPerimeter());

		System.out.println("--------------------------------------------");
		
		// Results should be: 
		//  2.0, 2.0, 2.8284 ...
		//  2.0
		//  6.8284 ...
		RightTriangle rt = new RightTriangle(2, 2);
		System.out.println("Right Triangle's sides are: " + rt.sideA + ", "+ rt.sideB + ", " + rt.sideC);
		System.out.println("Right Triangle's area is: " + rt.getArea());
		System.out.println("Right Triangle's perimeter is: " + rt.getPerimeter());
		
		System.out.println("--------------------------------------------");
	}
	
	/**
	 * Main method to run the program.
	 * @param args
	 */
	public static void main(String args[]) {
		//call static run method in Triangle class
		Triangle.run();
	}
}