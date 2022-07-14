package transportation;

/**
 * Represents a bike. Extends Vehicle.
 */
public class Bike extends Vehicle {

	/**
	 * Creates a bike. Sets the brand to be the given brand. Sets the type to be
	 * "Bike". Sets the age to the current year minus the given year purchased. Sets
	 * the gasConsumedPerHour to 0.
	 */
	public Bike(String brand, int yearPurchased) {
		this.brand = brand;
		this.type = "Bike"; //$NON-NLS-1$
		this.age = this.currYear - yearPurchased;
		this.gasConsumedPerHour = 0;
	}

	/**
	 * Overriding refuel method.
	 * 
	 * Example(s): - For a bike ("Trek" purchased in 1999): - If you call
	 * refuel(100), the gasRemained would be 0
	 * 
	 * @param amountOfGas to put in the gas tank
	 */
	@Override
	public void refuel(int amountOfGas) {

		System.out.println("You don't need to refuel a bike."); //$NON-NLS-1$
	}

	/**
	 * Overriding run method.
	 * 
	 * Example(s): - For a bike ("Giant" purchased in 1999): - If you call run(100),
	 * the gasRemained would be 0 - If you call run(100) again, the gasRemained
	 * would be 0 - And if you call run(100) again, the gasRemained would still be 0
	 * 
	 * @param hours to run
	 */
	@Override
	public void run(int hour) {

		System.out.println("Eco-freindly travel by bicycle!"); //$NON-NLS-1$
	}
}
