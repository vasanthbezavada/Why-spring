package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl{
	
	@Autowired
	private SortAlg AlgToBeUsed;
	
	// use name of the class with first letter capsoff to avoid primary
	
//	public BinarySearchImpl(SortAlg AlgGiven ) {
//		
//		this.AlgToBeUsed=AlgGiven;
//	}
	
	public int binarysearch(int[] numbers,int numberToSearch) {
		
		
		
		int[] resultOfSortedArray = AlgToBeUsed.sort(numbers);
		
		System.out.println(AlgToBeUsed);
		
		
		
		
		//implement search algorithm and return the answer
		
		
		return 2;
	}
	
}
