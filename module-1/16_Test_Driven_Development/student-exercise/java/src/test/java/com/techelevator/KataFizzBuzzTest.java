package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	
	@Test 
	public void returns_int_1() {
		assertEquals("String does not return 1", ("1"), KataFizzBuzz.fizzBuzz(1));
	}
	
	
}
