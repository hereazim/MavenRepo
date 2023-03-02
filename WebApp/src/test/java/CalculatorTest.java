import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		int res=Calculator.add(14, 24);
		assertEquals(38, res);
	}

}
