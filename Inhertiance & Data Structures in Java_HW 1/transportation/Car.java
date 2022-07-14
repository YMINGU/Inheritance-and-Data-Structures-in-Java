package transportation;

/**
 * Represents a car. Extends Vehicle.
 */
public class Car extends Vehicle {
	
	/**
     * Creates a car.
     * Sets the brand to be the given brand.
     * Sets the type to be "Car".
     * Sets the age to the current year minus the given year purchased.
     * Sets the gasConsumedPerHour to 10.
     * Sets the maxGasAmountInTank to 200.
     */
	public Car(String brand, int yearPurchased) {
		this.brand = brand;
		this.type = "Car";
		this.age = this.currYear - yearPurchased;
		this.gasConsumedPerHour = 10;
		this.maxGasAmountInTank = 200;
	}
	
	
	/**
	 * Overriding refuel method.
	 * 
	 * For the car, you have to make sure there's room in the gas tank for the given amount of gas.
	 * If the given amount of gas plus the remaining amount of gas in the tank is greater than the
	 * max amount of gas the tank can hold, set the remaining amount of gas to be the max amount of gas 
	 * the tank can hold.  Otherwise, add the given amount of gas to the gas remaining in the tank.
	 * 
	 * Example(s):
     * - For a car ("Jeep" purchased in 2010):
     * - If you call refuel(100), the gasRemained would be 100
     * - Then, if you call refuel(101), the gasRemained would be 200
     * 		
	 * @param amountOfGas to put in the gas tank
	 */
	@Override 
	public void refuel(int amountOfGas) {
		
		//TODO Implement method
		
		return;
	}
	
	/**
	 * Overriding run method.
	 * 
	 * For the car, first check the amount of remaining gas in the tank. If it's smaller than or equal to 0,
	 * print "Gas out! Please add fuel!"
	 * Otherwise, you need to calculate the gas consumed during this run. Take the given number of hours that 
	 * the car is going to run and multiply by the gas consumed per hour. Then subtract from the gas remaining in the tank.
	 * If the gas remaining in the tank is smaller than or equal to 0 for this run, print "Oops, gas out! Please add fuel!" 
	 * and set the gas remaining to be 0.
	 * Make sure to add the gas consumed during this run to the total gas consumed by the car. If the gas consumed during
	 * this run is greater than the gas remaining in the tank, add the remaining gas to the total gas consumed.
	 * 
	 * Example(s):
     * - For a car ("Benz" purchased in 2020):
     * - If you call run(10), the gasRemained would be 0
     * - Then if you call refuel(100), followed by run(5), the gasRemained would be 50
     * - Finally, if you call run(5), the gasRemained would be 0
     * 
     * - For a car ("Jeep" purchased in 2019):
     * - If you call refuel(200), followed by run(10), the gasRemained would be 100
     * - Then if you call run(15), the gasRemained would still be 0
     * 
	 * @param hours to run
	 */
	@Override
	public void run(int hour) {
		
		//TODO Implement method
		
		return;
	}
}
