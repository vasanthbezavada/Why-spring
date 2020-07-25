package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {
	
	
	public static void main(String[] args) {
		
		ApplicationContext aplcontext=SpringApplication.run(FirstApplication.class, args);
		
		//BinarySearchImpl binarysearch = new BinarySearchImpl(new BubbleSortAlg() );
		int[] arr={1,2,3};
		
		
		BinarySearchImpl binarysearch=aplcontext.getBean(BinarySearchImpl.class);
		
		int result = binarysearch.binarysearch(arr, 2);
		System.out.println(result);
		
		
	}

}
