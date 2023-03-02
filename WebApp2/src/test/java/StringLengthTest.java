import static org.junit.Assert.*;

import org.junit.Test;

public class StringLengthTest {

	@Test
	public void wordTest() {
		int length=StringLength.word("Azim");
		assertEquals(4, length);
	}

}
