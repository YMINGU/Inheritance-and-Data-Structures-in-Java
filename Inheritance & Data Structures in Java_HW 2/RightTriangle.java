package triangle;
public class RightTriangle extends Triangle {
	
	/**
	 * Creates a right triangle with given 2 sides and calculates the hypotenuse (3rd and longest side).
	 * Calls constructor in parent Triangle class by calling: super(sideA, sideB, sideC)
	 * 
	 * Example(s):
	 * - Calling RightTriangle rt = new RightTriangle(1, 1) will create a right 
	 * triangle with sides 1, 1, and 1.4142 ...
	 * - Calling RightTriangle rt = new RightTriangle(1, 3) will create a right 
	 * triangle with sides 1, 3, and 3.1622 ...
	 * 
	 * @param sideA is the first right-angled side
	 * @param sideB is the second right-angled side
	 */
	public RightTriangle(double sideA, double sideB) {
		super(sideA, sideB, RightTriangle.getHypotenuse(sideA, sideB));
	}
	
	/**
	 * Calculates the hypotenuse (longest side) for the right triangle.
	 * @param sideA is the first right-angled side 
	 * @param sideB is the second right-angled side
	 * 
	 * Example(s):
	 * - Calling getHypotenuse(1, 1) will return 1.4142 ...
     * - Calling getHypotenuse(1, 3) will return 3.1622 ...
     * - Calling getHypotenuse(2, 2) will return 2.8284 ... 
     * 
	 * @return hypotenuse
	 */
	private static double getHypotenuse(double sideA, double sideB) {
		return (Math.sqrt((sideA*sideA)+(sideB*sideB)));
	}

	/**
     * Calculates and returns the area of the right triangle. 
     * 
     * Example(s):
     * - For a right triangle with side lengths 1, 3, and 3.1622 ...
     * - Calling getArea() will return 1.5
     * 
     * - For a right triangle with side lengths 2, 2, and 2.8284 ... 
     * - Calling getArea() will return 2.0
     * 
     * @return the area of the right triangle
     */  
	@Override
	public double getArea() {  
		return ((this.sideA*this.sideB)/2);
	}
}
