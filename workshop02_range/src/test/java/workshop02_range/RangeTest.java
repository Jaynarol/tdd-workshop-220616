package workshop02_range;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest {
	
	Range range = new Range();

	@Test
	public void 
	number_first_should_be_1() {
		assertEquals(1, range.getNumberFirst("[1,5]"));
	}

	@Test
	public void 
	number_first_should_be_2() {
		assertEquals(2, range.getNumberFirst("(1,5]"));
	}

	
	@Test
	public void 
	number_last_should_be_5() {
		assertEquals(5, range.getNumberLast("[1,5]"));
	}

	@Test
	public void 
	number_last_should_be_4() {
		assertEquals(4, range.getNumberLast("[1,5)"));
	}

	@Test
	public void 
	number_1_and_5_shoud_be_concat() {
		assertEquals("1,2,3,4,5", range.concatNumber(1,5));
	}

	@Test
	public void 
	should_be_result_1_to_5() {
		assertEquals("1,2,3,4,5", range.getResult("[1,5]"));
	}
	
}
