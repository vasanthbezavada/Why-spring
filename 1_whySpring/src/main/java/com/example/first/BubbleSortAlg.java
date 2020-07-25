package com.example.first;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

@Primary
public class BubbleSortAlg implements SortAlg  {
	
	public int[] sort(int[] numbers) {
		
		
		// implement algorithm
		int[] result = numbers;
		
		return numbers;
	}

}
