package Dealer;

public class ToyotaCamry2019 extends ParentCar {
	

	String brand_of_Car = "Toyata Camry 2019 XSE";
	String color_of_Car = "Blue";
	String Traction = "AWD";  // Variable declared outside of the method.
	String Engine = "VVT 4 Cyl";
	String Mileage= "12993 mi";
	String Fuel = "Gasoline";
	String Price ="22,897 $";
	String Transmission= "Automatic";
	String Tire_Size = "235/65 R 16";// Attributes
	final int Max_Speed = 140;
	
	static boolean Has_AirBag = true;
	static boolean Has_AC = true;
	static boolean started = false; // start or not 
	static boolean Horn = true;
	static boolean moving = true;
	static boolean absorb = true;
	static boolean stop =true;
	
	// declaration methods , the behavior of the car 


	public static void started () {
		
		started = true;
		
	}
	public  static void Horn () {// method
		 Horn=true;
		
	  }
	public static void  moving () {
		moving = true;// Action
		  
	  }

	public static void absorb () {
		 absorb= true;
		
	   }
	 public static void stop() {
		  stop = true;
	 }
	 
	 public static void has_AC() {
		 Has_AC= true;
	   }
	 
	 public static void Has_AirBag() {
		
		 Has_AirBag = true;
		 
	    }


		
		
}


	
	
	








	



