package test;

public class OperatorDemo {
	public static void main(String[] args) {
		int i = 10;
		int j = 7;
		//Arithmatic Operators
//		System.out.println(i+j);
//		System.out.println(i-j);
//		System.out.println(i*j);
//		System.out.println(i/j);
//		System.out.println(i%j);
		
		// increment operator
		// pre - first increase then assign ++i
		// post - first assign then increase i++
		
		int z = ++i + i++ + i-- + --i;
			//= 11 + 11 + 12 + 10
		
		// Assignment - which one is faster? pre or post?
		
		
 		System.out.println(z);
		System.out.println(i);
	}
}
