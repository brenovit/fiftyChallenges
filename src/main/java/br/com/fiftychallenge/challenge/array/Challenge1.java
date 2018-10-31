package br.com.fiftychallenge.challenge.array;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Challenge1 {
	
	/**
	 * Description: How do you find the missing number in a given integer array of 1 to 100?
	 */
	public int[] findMissingNumber(int[] numbers) {
			
		Arrays.sort(numbers);
				
		Set<Integer> missingNumbers = new TreeSet<Integer>();
				
		for (int i = 0; i < numbers.length -1; i++) {
			
			int actualNumber = numbers[i];
			int nextNumber = numbers[i+1];
			int difference = nextNumber - actualNumber;
			
			if(difference > 1) {
				while(actualNumber < nextNumber - 1) {
					missingNumbers.add(++actualNumber);
				}				
			}
			
		}
		int[] newMissingNumber = new int[missingNumbers.size()];
		
		int i = 0;
		for(Integer n : missingNumbers) 
			newMissingNumber[i++] = n;
						
		return newMissingNumber;
	}	
	
}
