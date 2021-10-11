/**
 * 
 */
package business.logic.test.Calculate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import business.logic.Calculate;

/**
 * @author Arthur
 *
 */
class SubtractMethodTest {

	/**
	 * Test method for {@link business.logic.Calculate#subtract(int, int)}.
	 */
	@Test
	void testSubtract() {
		Calculate c= new Calculate();
		assertEquals(1, c.subtract(2,1));
	}

}
