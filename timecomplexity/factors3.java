package com.timecomplexity;

public class factors3 {
	public static void main(String[] args) {
	int n=25;
	for(int i=1;i<Math.sqrt(n);i++) {
		if(n%i==0) {
			System.out.println(i);
		}
	}
		for(int i=(int)Math.sqrt(n);i>=1;i--) {
			if(n%i==0) {                                    //O(root(n))
				System.out.println(n/i);
			}
		
		

}
}
}
