package com.practiceRecursion;

import java.util.LinkedHashSet;
import java.util.Set;

public class Recursion1 {
	public static void main(String args[]) {
	int arr[]= {1,2,3,4,4,5,5};
	Set<Integer> uni=new LinkedHashSet<>();
	
	for(int num:arr) {
		uni.add(num);
		
	}
	
	for(int num:uni) {
		System.out.print(num+" ");
	}
}
}