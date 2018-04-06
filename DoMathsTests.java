import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoMathsTests {

	DoMaths dm = new DoMaths();

	@Test
	public void add() {
		assertEquals("9.0", DoMaths.whatMaths("add", 4, 5));
		assertEquals("0.0", DoMaths.whatMaths("add", -5, 5));
		assertEquals("12.2", DoMaths.whatMaths("add", 5.5, 6.7));
	}
	
	@Test
	public void subtract() {
		assertEquals("-1.0", DoMaths.whatMaths("subtract", 4, 5));
		assertEquals("-10.0", DoMaths.whatMaths("subtract", -5, 5));
		assertEquals("-1.2", DoMaths.whatMaths("subtract", 5.5, 6.7));
	}
	
	@Test
	public void divide() {
		assertEquals("0.8", DoMaths.whatMaths("divide", 4, 5));
		assertEquals("-1.0", DoMaths.whatMaths("divide", -5, 5));
		assertEquals("0.8", DoMaths.whatMaths("divide", 5.5, 6.7));
	}
	
	@Test
	public void multiply() {
		assertEquals("20.0", DoMaths.whatMaths("multiply", 4, 5));
		assertEquals("-25.0", DoMaths.whatMaths("multiply", -5, 5));
		assertEquals("36.85", DoMaths.whatMaths("multiply", 5.5, 6.7));
	}			
}
	