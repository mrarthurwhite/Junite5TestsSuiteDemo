/**
 * 
 */
package business.logic.test.add;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import business.logic.Calculate;

/**
 * @author Arthur
 *
 */
class TestAddMethod {

	/**
	 * Test method for {@link business.logic.Calculate#add(int, int)}.
	 */
	@Test
	void testAdd() {
		Calculate c= new Calculate();
		assertEquals(2, c.add(1,1));
	}

}
