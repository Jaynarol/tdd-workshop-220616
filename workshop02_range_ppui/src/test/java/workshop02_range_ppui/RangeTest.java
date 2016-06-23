package workshop02_range_ppui;

import static org.junit.Assert.*;

import org.junit.Test;

import workshop02_range_ppui.Range;

public class RangeTest {
	
	Range range = new Range();

	@Test public void 
	start_with_inclusive() {
		assertTrue(range.startWithInclusive("[1,5]"));
	}

	@Test public void 
	start_with_exclusive() {
		assertFalse(range.startWithInclusive("(1,5]"));
	}

	@Test public void 
	end_with_inclusive() {
		assertTrue(range.endWithInclusive("[1,5]"));
	}

	@Test public void 
	end_with_exclusive() {
		assertFalse(range.endWithInclusive("[1,5)"));
	}
	
	

}
