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
class AddMethodTest {

	/**
	 * Test method for {@link business.logic.Calculate#add(int, int)}.
	 */
	@Test
	void testAdd() {
		Calculate c= new Calculate();
		assertEquals(2, c.add(1,1));
	}

}
