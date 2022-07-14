package transportation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleTest {
	Vehicle jeep1;
	Vehicle jeep2;
	Vehicle benz;
	Vehicle bike1;
	Vehicle bike2;
	Vehicle bike3;
	
	@BeforeEach
	void setUp() throws Exception {
		this.jeep1 = new Car("Jeep", 2019);
		this.jeep2 = new Car("Jeep", 2010);
		this.benz = new Car("Benz", 2020);
		this.bike1 = new Bike("Trek", 1999);
		this.bike2 = new Bike("Giant", 1999);
		this.bike3 = new Bike("Giant", 2020);
	}

	@Test
	void testVehicle() {
		assertEquals("Jeep", jeep1.brand);
		assertEquals("Jeep", jeep2.brand);
		assertEquals("Benz", benz.brand);
		assertEquals("Trek", bike1.brand);
		assertEquals("Giant", bike2.brand);
		assertEquals("Giant", bike3.brand);
		
		assertEquals("Car", jeep1.type);
		assertEquals("Car", jeep2.type);
		assertEquals("Car", benz.type);
		assertEquals("Bike", bike1.type);
		assertEquals("Bike", bike2.type);
		assertEquals("Bike", bike3.type);
		
	}

	@Test
	void testGetAge() {
		assertEquals(1, jeep1.getAge());
		assertEquals(10, jeep2.getAge());
		assertEquals(0, benz.getAge());
		assertEquals(21, bike1.getAge());
		assertEquals(21, bike2.getAge());
		assertEquals(0, bike3.getAge());
	}

	@Test
	void testGetGasRemained() {
		bike1.refuel(100);
		assertEquals(0, bike1.getGasRemained());
		bike1.refuel(10000);
		assertEquals(0, bike1.getGasRemained());
		jeep1.refuel(1);
		assertEquals(1, jeep1.getGasRemained());
		jeep1.refuel(100);
		assertEquals(101, jeep1.getGasRemained());
		jeep1.refuel(300);
		assertEquals(200, jeep1.getGasRemained());
	}
	
	@Test
	void testGetTotalGasConsumed() {
		bike2.run(100);
		bike2.run(100);
		bike2.run(100);
		assertEquals(0, bike1.getTotalGasConsumed());
		benz.run(10);
		
		assertEquals(0, benz.getTotalGasConsumed());
		benz.refuel(100);
		benz.run(5);
		benz.run(5);
		assertEquals(100, benz.getTotalGasConsumed());
		benz.refuel(200);
		benz.run(25);
		assertEquals(300, benz.getTotalGasConsumed());
		
		jeep1.refuel(200);
		jeep1.run(10);
		assertEquals(100, jeep1.getTotalGasConsumed());
		jeep1.run(15);
		assertEquals(200, jeep1.getTotalGasConsumed());
		jeep1.refuel(100);
		assertEquals(200, jeep1.getTotalGasConsumed());
		
	}

	@Test
	void testRefuel() {
		bike1.refuel(100);
		assertEquals(0, bike1.getGasRemained());
		
		jeep1.refuel(100);
		assertEquals(100, jeep1.getGasRemained());
		jeep1.refuel(101);
		assertEquals(200, jeep1.getGasRemained());
		
		// TODO write at least 3 additional test cases 
		
	}
	
	@Test
	void testRun() {
		bike2.run(100);
		bike2.run(100);
		bike2.run(100);
		assertEquals(0, bike1.getGasRemained());
		
		benz.run(10);
		assertEquals(0, benz.getGasRemained());
		benz.refuel(100);
		benz.run(5);
		assertEquals(50, benz.getGasRemained());
		
		// TODO write at least 3 additional test cases 
	}

	@Test
	void testEquals() {
		assertTrue(jeep1.equals(jeep2));
		assertFalse(benz.equals(jeep2));

		// TODO write at least 3 additional test cases 
	}

	@Test
	void testToString() {
		assertEquals("Car Jeep", jeep1.toString());
		assertEquals("Bike Trek", bike1.toString());
		
		// TODO write at least 3 additional test cases 
		
	}
}
