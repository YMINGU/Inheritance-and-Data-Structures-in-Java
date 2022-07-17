package triangle;

/**
 * Represents an equilateral triangle.  
 * Extends abstract class Triangle.
 */
public class EquilateralTriangle extends Triangle {

	/**
	 * Creates an equilateral triangle with 3 sides of the given side length.
	 * (All 3 sides of an equilateral triangle have the same length,
	 * so we only need one side length to create the triangle.)
	 * Calls constructor in parent Triangle class by calling: super(sideA, sideB, sideC)
	 * 
	 * Example(s):
	 * - Calling EquilateralTriangle et = new EquilateralTriangle(1) will create an equilateral 
	 * triangle with sides 1, 1, and 1
	 * - Calling EquilateralTriangle et = new EquilateralTriangle(5) will create an equilateral 
	 * triangle with sides 5, 5, and 5
	 * 
	 * @param sideLength for all 3 sides
	 */
	public EquilateralTriangle(double sideLength) {
	    
		// TODO Implement constructor
		
	}

	/**
     * Calculates and returns the area of the equilateral triangle. 
     * 
     * Example(s):
     * - For an equilateral triangle with side lengths 1, 1, and 1 
     * - Calling getArea() will return 0.4330 ...
     * 
     * - For an equilateral triangle with side lengths 5, 5, and 5 
     * - Calling getArea() will return 10.8253 ...
     * 
     * @return the area of the equilateral triangle
     */ 
	@Override
	public double getArea() {
	    
		// TODO Implement method
		
		return 0.0;
	}	
}