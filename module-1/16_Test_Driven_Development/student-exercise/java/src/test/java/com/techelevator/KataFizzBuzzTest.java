package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	
	@Test 
	public void returns_int_not_multiple_of_3_or_5() {
		assertEquals("String does not return 1", ("1"), KataFizzBuzz.fizzBuzz(1));
		assertEquals("String does not return 2", ("2"), KataFizzBuzz.fizzBuzz(2));
		assertEquals("String does not return 4", ("4"), KataFizzBuzz.fizzBuzz(4));
	}
	@Test
	public void multiple_of_3_and_5_returns_fizzbuzz() {
		assertEquals("String does not return FizzBuzz", ("FizzBuzz"), KataFizzBuzz.fizzBuzz(15));
		assertEquals("String does not return FizzBuzz", ("FizzBuzz"), KataFizzBuzz.fizzBuzz(30));
	}
	@Test
	public void multiple_of_only_3() {
		assertEquals("String does not return Fizz", ("Fizz"), KataFizzBuzz.fizzBuzz(9));
		assertEquals("String does not return Fizz", ("Fizz"), KataFizzBuzz.fizzBuzz(33));
	}
	@Test
	public void multiple_of_only_5() {
		assertEquals("String does not return Buzz", ("Buzz"), KataFizzBuzz.fizzBuzz(50));
		assertEquals("String does not return Buzz", ("Buzz"), KataFizzBuzz.fizzBuzz(100));
	}
	@Test
	public void passed_in_0() {
		assertEquals("String does not return empty String", ("0"), KataFizzBuzz.fizzBuzz(0));
	}
	@Test
	public void passed_in_greater_than_100() {
		assertEquals("String does not return empty String", (""), KataFizzBuzz.fizzBuzz(101));
		assertEquals("String does not return empty String", (""), KataFizzBuzz.fizzBuzz(102));
	}
	@Test
	public void Contains_a_5() {
		assertEquals("String does not return Buzz", ("Buzz"), KataFizzBuzz.fizzBuzz(56));
	}
	@Test
	public void Contains_a_3() {
		assertEquals("String does not return Fizz", ("Fizz"), KataFizzBuzz.fizzBuzz(13));
	}
	@Test
	public void Contains_a_3_and_a_5() {
		assertEquals("String does not return Fizz", ("FizzBuzz"), KataFizzBuzz.fizzBuzz(53));
	}
}
