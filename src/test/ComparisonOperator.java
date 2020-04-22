package test;

public class ComparisonOperator {
	public static void main(String[] args) {
		// > < >= <= == != // retrun boolean

		int i = 4;
//		if( i > 10) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
//		
//		logical AND - && - it will think logically 
//      bitwise AND - &  it will check all condition always
		
//		if(   returnTrue() | returnFalse() ) {
//			System.out.println("is present in 10-20 range");
//		}
		
		// Assignment Operator
//		 int y = 10;
//		 y += 4; // y = y + 4;
		 
		 // Ternary operator ?: operator
		 
		 int age = 8;
		 String type = (age<18 ? ( (age >10 && age < 18 ) ? "normal chile" : "super child")  :"adult")  ;
//		 if(age < 18) {
//			 type="child";
//		 }else {
//			 type ="adult";
//		 }
		 System.out.println(type);
		 
		 // do.while , while and for loop
		
	}
	
	public static boolean returnTrue() {
		System.out.println("true valuue");
		return true;
	}

	public static boolean returnFalse() {
		System.out.println("false valuue");
		return false;
	}

	// Logical and Bitwise Operator 
	// and or
	//Logical - && ||
	// bitwise - & |
	
}
