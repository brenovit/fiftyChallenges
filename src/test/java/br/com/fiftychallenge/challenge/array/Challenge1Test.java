package br.com.fiftychallenge.challenge.array;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Challenge1Test {
	
	@Test
	public void test1_sorted_array() {
		Challenge1 challenge = new Challenge1();
		int[] numbers = { 1,2,5,8,9,12 };
		int[] missing = { 3, 4, 6, 7, 10, 11 };
		int[] result = challenge.findMissingNumber(numbers);
		log.info("Numbers: "+Arrays.toString(numbers));
		log.info("Missings: "+Arrays.toString(result));
		assertArrayEquals(missing, result);
	}
	
	@Test
	public void test2_unsorted_array() {
		Challenge1 challenge = new Challenge1();
		int[] numbers = { 15, 18, 10, 12, 9, 7, 3, 4, 1, 20 };
		int[] missing = { 2, 5, 6, 8, 11, 13, 14, 16, 17, 19 };
		int[] result = challenge.findMissingNumber(numbers);
		log.info("Numbers: "+Arrays.toString(numbers));
		log.info("Missings: "+Arrays.toString(result));
		assertArrayEquals(missing, result);
	}	
}
