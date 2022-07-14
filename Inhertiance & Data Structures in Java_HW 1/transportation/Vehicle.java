package transportation;

import transportation.Bike;
import transportation.Car;

/**
 * Represents a vehicle.  Will be extended by classes representing different kinds of vehicles: Car and Bike
 */
public class Vehicle {
	
	//instance variables
	
	/**
	 * Current year.
	 */
	protected int currYear;
	
	/**
	 * Age of the vehicle.
	 */
	protected int age;
	
	/**
	 * Gas remaining in the gas tank.
	 */
	protected int gasRemained;
	
	/**
	 * Gas consumed per hour by the vehicle.
	 * For a bike, it's 0 per hour,
	 * For a car, it's 10 per hour.
	 */
	protected int gasConsumedPerHour;
	
	/**
	 * Total gas consumed by the vehicle.
	 */
	protected int totalGasConsumed;
	
	/**
	 * Max amount of gas the gas tank can hold.
	 */
	protected int maxGasAmountInTank;
	
	/**
	 * Type of vehicle.
	 * There are two kinds of vehicles in this project: Car and Bike.
	 */
	protected String type;
	
	/**
	 * The brand of the vehicle.
	 * e.g. Benz, Toyota, Giant, Trek
	 */
	protected String brand;
    
	//constructor
	
	/**
     * Creates a vehicle.
     * Sets the current year to 2020.
     * Sets the totalGasConsumed to 0.
     * Sets the gasRemained to 0.
     */
	public Vehicle() {
		this.currYear = 2020;
		this.totalGasConsumed = 0;
		this.gasRemained = 0;
	}
	
	//methods
	
	/**
	 * Gets the age of the vehicle.
	 * @return age 
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Gets the gas remaining in the tank.
	 * @return gas remaining
	 */
	public int getGasRemained() {
		return this.gasRemained;
	}
	
	/**
	 * Gets the total gas consumed by running.
	 * @return total gas consumed
	 */
	public int getTotalGasConsumed() {
		return this.totalGasConsumed;
	}
	
	/**
	 * Should be overridden by subclasses Car and Bike.
	 * 
	 * For the bike, we don't need to refuel. 
	 * Therefore, when bike calls refuel, nothing should happen. Just print: "You don't need to refuel a bike."
	 *  
	 * For the car, you have to make sure there's room in the gas tank for the given amount of gas.
	 * If the given amount of gas plus the remaining amount of gas in the tank is greater than the
	 * max amount of gas the tank can hold, set the remaining amount of gas to be the max amount of gas 
	 * the tank can hold.  Otherwise, add the given amount of gas to the gas remaining in the tank.
	 * 
	 * Example(s):
     * - For a bike ("Trek" purchased in 1999):
     * - If you call refuel(100), the gasRemained would be 0
     * 
     * - For a car ("Jeep" purchased in 2010):
     * - If you call refuel(100), the gasRemained would be 100
     * - Then, if you call refuel(101), the gasRemained would be 200
     * 		
	 * @param amountOfGas to put in the gas tank
	 */
	public void refuel(int amountOfGas) {
		
		return;	
	}
	
	/**
	 * Should be overridden by subclasses Car and Bike.
	 * 
	 * For the bike, we don't need to run.
	 * Therefore, when bike calls run, nothing should happen. Just print "Eco-friendly travel by bicycle!"
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
     * - For a bike ("Giant" purchased in 1999):
     * - If you call run(100), the gasRemained would be 0
     * - If you call run(100) again, the gasRemained would be 0
     * - And if you call run(100) again, the gasRemained would still be 0
     * 
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
	public void run(int hours) {
		
		return;
	}
	
	/**
	 * Compare two vehicles are equal by comparing their brand and their type.
	 * In other words, if vehicle1 has type "Car" with brand "Jeep", 
	 * and vehicle2 has type "Car" with brand "Jeep", 
	 * they are equal.
	 * 
	 * But if vehicle1 has type "Car" with brand "Benz", 
	 * and vehicle2 has type "Car" with brand "Jeep", 
	 * they are not equal.
	 * 
	 * If vehicle1 has type "Bike" with brand "Benz", 
	 * and vehicle2 has type "Car" with brand "Benz", 
	 * then they are also not equal.
	 * 
	 * Example(s):
     * - For car1 ("Jeep" purchased in 2019) and car2 ("Jeep" purchased in 2010):
     * - Calling car1.equals(car2) would return true
     * 
     * - For car2 ("Jeep" purchased in 2010):
     * - Calling car2.equals(car2) would return true
     * 
     * - For benz1 ("Benz" purchased in 2020) and car2 ("Jeep" purchased in 2010):
     * - Calling benz1.equals(car2) would return false
     * 
     * - For bike1 ("Giant" purchased in 2019) and bike2 ("Giant" purchased in 2020):
     * - Calling bike1.equals(bike2) would return true
     * 
	 * @return whether the two vehicles are equal
	 */
	@Override 
	public boolean equals(Object o) {
		
		//TODO Implement method
		
		return false;
	}
	
	/**
	 * Return the type and the brand of the vehicle as a String,
	 * in the format: type + " " + brand
	 * 
	 * For example, if we have a vehicle with type "Car" and brand "jeep",
	 * we will return "Car jeep" as a String.
	 * 
	 * Example(s):
     * - For car1 ("Jeep" purchased in 2019):
     * - Calling car1.toString() would return "Car Jeep"
     * 
     * - For car2 ("Jeep" purchased in 2010):
     * - Calling car2.toString() would return "Car Jeep"
     * 
     * - For benz1 ("Benz" purchased in 2020):
     * - Calling benz1.toString() would return "Car Benz"
     * 
     * - For bike1 ("Giant" purchased in 1999):
     * - Calling bike1.toString() would return "Bike Giant"
	 * 
	 * @return type and brand of vehicle as String
	 */
	@Override
	public String toString() {
		
		//TODO Implement method
		
		return "";
	}
	
	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create a car that is a jeep from 2000
		Car jeep = new Car("Jeep", 2000);
		System.out.println("jeep age : #" + jeep.getAge());
		
		//call methods on jeep
		jeep.refuel(1000);
		jeep.run(10);
		jeep.refuel(100);
		jeep.run(1000);
		
		//create another car that is a jeep from 2019
		Car jeep1 = new Car("Jeep", 2019);
		
		//compare the two jeeps
		if (jeep.equals(jeep1)) {
			System.out.println("Same");
		}
		
		//create a bike that is a giant from 2018
		Bike bike = new Bike("Giant", 2018);
		System.out.println("bike age : #" + bike.getAge());
		
		//call methods on bike
		bike.refuel(1);
		bike.run(1000);
		
		//call toString on jeep and bike
		System.out.println(jeep.toString());
		System.out.println(bike.toString());
	}
}