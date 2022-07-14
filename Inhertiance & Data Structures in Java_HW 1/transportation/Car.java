package transportation;

/**
 * Represents a car. Extends Vehicle.
 */
public class Car extends Vehicle {

	/**
	 * Creates a car. Sets the brand to be the given brand. Sets the type to be
	 * "Car". Sets the age to the current year minus the given year purchased. Sets
	 * the gasConsumedPerHour to 10. Sets the maxGasAmountInTank to 200.
	 */
	public Car(String brand, int yearPurchased) {
		this.brand = brand;
		this.type = "Car"; //$NON-NLS-1$
		this.age = this.currYear - yearPurchased;
		this.gasConsumedPerHour = 10;
		this.maxGasAmountInTank = 200;
	}

	/**
	 * Overriding refuel method.
	 * 
	 * Example(s): - For a car ("Jeep" purchased in 2010): - If you call
	 * refuel(100), the gasRemained would be 100 - Then, if you call refuel(101),
	 * the gasRemained would be 200
	 * 
	 * @param amountOfGas to put in the gas tank
	 */
	@Override
	public void refuel(int amountOfGas) {

		this.gasRemained = amountOfGas + this.gasRemained >= this.maxGasAmountInTank ? this.maxGasAmountInTank
				: this.gasRemained + amountOfGas;
	}

	/**
	 * Overriding run method.
	 * 
	 * Example(s): - For a car ("Benz" purchased in 2020): - If you call run(10),
	 * the gasRemained would be 0 - Then if you call refuel(100), followed by
	 * run(5), the gasRemained would be 50 - Finally, if you call run(5), the
	 * gasRemained would be 0
	 * 
	 * - For a car ("Jeep" purchased in 2019): - If you call refuel(200), followed
	 * by run(10), the gasRemained would be 100 - Then if you call run(15), the
	 * gasRemained would still be 0
	 * 
	 * @param hours to run
	 */
	@Override
	public void run(int hour) {

		if (this.gasRemained <= 0) {
			System.out.println("Gas out! Please add fuel!"); //$NON-NLS-1$
		} else {
			int gasConsumed = hour * this.gasConsumedPerHour;
			if (this.gasRemained - gasConsumed <= 0) {
				System.out.println("Oops, gas out! Please add fuel!"); //$NON-NLS-1$
				this.totalGasConsumed += this.gasRemained;
				this.gasRemained = 0;
			} else {
				this.gasRemained -= gasConsumed;
				this.totalGasConsumed += gasConsumed;
			}
		}
	}
}
