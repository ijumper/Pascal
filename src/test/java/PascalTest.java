

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

    @Test(expected = IllegalArgumentException.class)
    public void PositionNegativeOnethrowsException() {
        assertEquals(pascalTriangle.NumberAtPosition(-1,3), 1);
    }

    @Test
    public void PositionThreeOne() {

        assertEquals(pascalTriangle.NumberAtPosition(3,1), 1);
    }

    @Test
    public void PositionThreeThree() {

        assertEquals(pascalTriangle.NumberAtPosition(3,3), 1);
    }

    @Test
    public void PositionThreeTwo() {

        assertEquals(pascalTriangle.NumberAtPosition(3,2), 2);
    }

    @Test
    public void PositionFourTwo() {

        assertEquals(pascalTriangle.NumberAtPosition(4,2), 3);
    }
}