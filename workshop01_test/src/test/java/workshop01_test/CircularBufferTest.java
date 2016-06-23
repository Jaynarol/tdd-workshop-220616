package workshop01_test;

import static org.junit.Assert.*;
import org.junit.Test;

public class CircularBufferTest {

	private CircularBuffer circularBuffer = new CircularBuffer(3);

	@Test
	public void 
	add_A_read_should_be_A() {
		circularBuffer .add("A");
		assertEquals("A", circularBuffer.read());
	}
	
	@Test
	public void 
	add_B_read_should_be_B() {
		circularBuffer.add("B");
		assertEquals("B", circularBuffer.read());
	}
	
	@Test 
	public void 
	add_A_and_B_read_should_be_A_and_B() {
		circularBuffer.add("A");
		circularBuffer.add("B");
		assertEquals("A", circularBuffer.read());
		assertEquals("B", circularBuffer.read());
	}
	
	@Test(expected=BufferEmptyException.class)
	public void 
	should_throw_BufferEmptyException_when_read_empty_buffer() {
		circularBuffer.read();
	}
	
	@Test(expected=BufferFullException.class)
	public void 
	should_throw_BufferFullException_when_write_full_buffer() {
		circularBuffer.add("A");
		circularBuffer.add("B");
		circularBuffer.add("C");
		circularBuffer.add("D");
	}
	
	@Test
	public void 
	buffer_size_should_be_3() throws Exception {
		assertEquals(3, circularBuffer.getSize());
	}
	
	@Test
	public void 
	buffer_size_change_3_to_5() throws Exception {
		circularBuffer.setSize(5);
		assertEquals(5, circularBuffer.getSize());
	}

}
