package test;

public class RealtimeApproach {

	public static void main(String[] args) {
		Hotel a1  = new Hotel();
		
		a1.name = "XYZ";
		a1.numberOfRooms= 20;
		Hotel.country = "India";
		Hotel a2  = new Hotel();
		a2.name = "ABC";
		a2.numberOfRooms= 40;
		///  instance variable
		System.out.println(a1.name);
		System.out.println(a2.numberOfRooms);
		System.out.println(Hotel.country);


		ReturnType r1 = a2.sumOfNumber(10, 20);
		System.out.println(r1.intValue);
		System.out.println(r1.strValue);
		// static variable - Class varibales
		// shared variables
		A4 a5 = new A4();
		a5.test1(a2);
		System.out.println(a2.name);
		
		Hotel.test();
		
	}
}

class Hotel{

	// 2 type of varibales
	// instance variable 
	// static variable
	//Common - outside method and inside class 
	String name;
	int numberOfRooms;
	static String country;

	ReturnType sumOfNumber(int i, int j){
		ReturnType ret = new ReturnType();
		ret.intValue = i+j;
		ret.strValue = "test";
		return ret;
	}
	// non static method can access both static and non static method/variable ()
// static method can access only static variable
	 static void test() {
		country = "";
		
		System.out.println("hello ");
	}
	
}


class A4{
	public Hotel test1(Hotel h1) {
		h1.name ="modfied";
		return h1;
	}
}

class ReturnType{
	int intValue ;
	String strValue;

}



