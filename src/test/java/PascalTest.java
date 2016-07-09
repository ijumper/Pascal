

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;
import org.junit.*;

public class PascalTest {


	private PascalTriangle pascalTriangle;

	@Test
    public void PositionOneOne() {

		assertEquals(pascalTriangle.NumberAtPosition(1,1), 1);
	}

	@Test
	public void PositionTwoOne() {

		assertEquals(pascalTriangle.NumberAtPosition(2,1), 1);
	}

	@Test
	public void PositionTwoTwo() {

		assertEquals(pascalTriangle.NumberAtPosition(2,2), 1);
	}

    @Test(expected = IllegalArgumentException.class)
    public void PositionTwoThreethrowsException() {
        assertEquals(pascalTriangle.NumberAtPosition(1,3), 1);
    }

}