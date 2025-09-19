package com.timecomplexity;

public class EuclidAlogorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					int a=24;
					int b=12;
					
					while(a!=b) {
						if(a>b) {
							a=a-b;
						}
						else {
							b=b-a;
						}
					}
					System.out.println(a);
	}

}
