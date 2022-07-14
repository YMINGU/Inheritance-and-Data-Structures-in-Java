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
		this.jeep1 = new Car("Jeep", 2019); //$NON-NLS-1$
		this.jeep2 = new Car("Jeep", 2010); //$NON-NLS-1$
		this.benz = new Car("Benz", 2020); //$NON-NLS-1$
		this.bike1 = new Bike("Trek", 1999); //$NON-NLS-1$
		this.bike2 = new Bike("Giant", 1999); //$NON-NLS-1$
		this.bike3 = new Bike("Giant", 2020); //$NON-NLS-1$
	}

	@Test
	void testVehicle() {
		assertEquals("Jeep", this.jeep1.brand); //$NON-NLS-1$
		assertEquals("Jeep", this.jeep2.brand); //$NON-NLS-1$
		assertEquals("Benz", this.benz.brand); //$NON-NLS-1$
		assertEquals("Trek", this.bike1.brand); //$NON-NLS-1$
		assertEquals("Giant", this.bike2.brand); //$NON-NLS-1$
		assertEquals("Giant", this.bike3.brand); //$NON-NLS-1$

		assertEquals("Car", this.jeep1.type); //$NON-NLS-1$
		assertEquals("Car", this.jeep2.type); //$NON-NLS-1$
		assertEquals("Car", this.benz.type); //$NON-NLS-1$
		assertEquals("Bike", this.bike1.type); //$NON-NLS-1$
		assertEquals("Bike", this.bike2.type); //$NON-NLS-1$
		assertEquals("Bike", this.bike3.type); //$NON-NLS-1$

	}

	@Test
	void testGetAge() {
		assertEquals(1, this.jeep1.getAge());
		assertEquals(10, this.jeep2.getAge());
		assertEquals(0, this.benz.getAge());
		assertEquals(21, this.bike1.getAge());
		assertEquals(21, this.bike2.getAge());
		assertEquals(0, this.bike3.getAge());
	}

	@Test
	void testGetGasRemained() {
		this.bike1.refuel(100);
		assertEquals(0, this.bike1.getGasRemained());
		this.bike1.refuel(10000);
		assertEquals(0, this.bike1.getGasRemained());
		this.jeep1.refuel(1);
		assertEquals(1, this.jeep1.getGasRemained());
		this.jeep1.refuel(100);
		assertEquals(101, this.jeep1.getGasRemained());
		this.jeep1.refuel(300);
		assertEquals(200, this.jeep1.getGasRemained());
	}

	@Test
	void testGetTotalGasConsumed() {
		this.bike2.run(100);
		this.bike2.run(100);
		this.bike2.run(100);
		assertEquals(0, this.bike1.getTotalGasConsumed());
		this.benz.run(10);

		assertEquals(0, this.benz.getTotalGasConsumed());
		this.benz.refuel(100);
		this.benz.run(5);
		this.benz.run(5);
		assertEquals(100, this.benz.getTotalGasConsumed());
		this.benz.refuel(200);
		this.benz.run(25);
		assertEquals(300, this.benz.getTotalGasConsumed());

		this.jeep1.refuel(200);
		this.jeep1.run(10);
		assertEquals(100, this.jeep1.getTotalGasConsumed());
		this.jeep1.run(15);
		assertEquals(200, this.jeep1.getTotalGasConsumed());
		this.jeep1.refuel(100);
		assertEquals(200, this.jeep1.getTotalGasConsumed());

	}

	@Test
	void testRefuel() {
		this.bike1.refuel(100);
		assertEquals(0, this.bike1.getGasRemained());

		this.jeep1.refuel(100);
		assertEquals(100, this.jeep1.getGasRemained());
		this.jeep1.refuel(101);
		assertEquals(200, this.jeep1.getGasRemained());

		this.bike1.refuel(0);
		assertEquals(0, this.bike1.getGasRemained());

		this.bike1.refuel(-50);
		assertEquals(0, this.bike1.getGasRemained());

		this.jeep1.refuel(0);
		assertEquals(200, this.jeep1.getGasRemained());

	}

	@Test
	void testRun() {
		this.bike2.run(100);
		this.bike2.run(100);
		this.bike2.run(100);
		assertEquals(0, this.bike1.getGasRemained());

		this.benz.run(10);
		assertEquals(0, this.benz.getGasRemained());
		this.benz.refuel(100);
		this.benz.run(5);
		assertEquals(50, this.benz.getGasRemained());

		this.bike2.run(0);
		assertEquals(0, this.bike1.getGasRemained());

		this.bike2.run(-50);
		assertEquals(0, this.bike1.getGasRemained());

		this.benz.run(10);
		assertEquals(0, this.benz.getGasRemained());
	}

	@Test
	void testEquals() {
		assertTrue(this.jeep1.equals(this.jeep2));
		assertFalse(this.benz.equals(this.jeep2));

		assertFalse(this.bike2.equals(this.benz));
		assertTrue(this.bike2.equals(this.bike2));
		assertTrue(this.benz.equals(this.benz));
	}

	@Test
	void testToString() {
		assertEquals("Car Jeep", this.jeep1.toString()); //$NON-NLS-1$
		assertEquals("Bike Trek", this.bike1.toString()); //$NON-NLS-1$

		assertNotEquals("Bike Trek", this.jeep1.toString()); //$NON-NLS-1$
		assertNotEquals("Car Jeep", this.bike1.toString()); //$NON-NLS-1$
		assertNotEquals("Bike Trek", this.benz.toString()); //$NON-NLS-1$
	}
}
