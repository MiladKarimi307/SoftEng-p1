package test.cen4010.a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cen4010.pa1.Vector3D;

class Vector3DTest {

	@Test
	void testToString() {
		Vector3D vec = new Vector3D(1,2,3);
		assertEquals("x: 1.0\ny: 2.0\nz: 3.0\n", vec.toString());
	}
	
	@Test
	void testEquals() {
		Vector3D vec = new Vector3D(1.01234,2.12345,3.23456);
		assertEquals(true, vec.equals(new Vector3D(1.01234,2.12345,3.23456)));
		assertEquals(true, vec.equals(new Vector3D(1.01233,2.12344,3.23455)));
	}

}
