package workshop04;

import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz fizzbuzz = new FizzBuzz();

	@Test public void 
	number_1_should_be_1() {
		assertEquals("1", fizzbuzz.getResult(1));
	}

	@Test public void 
	number_2_should_be_2() {
		assertEquals("2", fizzbuzz.getResult(2));
	}

	@Test public void 
	number_3_should_be_Fizz() {
		assertEquals("Fizz", fizzbuzz.getResult(3));
	}

	@Test public void 
	number_4_should_be_4() {
		assertEquals("4", fizzbuzz.getResult(4));
	}

	@Test public void 
	number_5_should_be_Buzz() {
		assertEquals("Buzz", fizzbuzz.getResult(5));
	}

	@Test public void 
	number_6_should_be_Fizz() {
		assertEquals("Fizz", fizzbuzz.getResult(6));
	}

	@Test public void 
	number_10_should_be_Buzz() {
		assertEquals("Buzz", fizzbuzz.getResult(10));
	}

	@Test public void 
	number_15_should_be_FizzBuzz() {
		assertEquals("FizzBuzz", fizzbuzz.getResult(15));
	}

	@Test public void 
	number_30_should_be_FizzBuzz() {
		assertEquals("FizzBuzz", fizzbuzz.getResult(30));
	}

	@Test public void 
	number_7_should_be_Wow() {
		assertEquals("Wow", fizzbuzz.getResult(7));
	}
	
	
	

}
