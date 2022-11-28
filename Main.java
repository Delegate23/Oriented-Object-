package Dealer;

public class Main extends ParentCar    {
	
	//private static final Object[] Object = null;

	public  static void main(String []agrs) {
		
		ParentCar parentcar = new ParentCar();
		
		parentcar.Construction();
		
		
		ToyotaCorolla2017 toyotaCorolla2017 = new ToyotaCorolla2017();
		
		
		ToyotaCamry2019 toyatacamry = new ToyotaCamry2019();
		// ToyotaCamry2019();
	
		 System.out.println("The Brand is : " + toyatacamry.brand_of_Car );
		 System.out.println();
		 System.out.println("The color is : " + toyatacamry.color_of_Car);
		 System.out.println();
		 System.out.println("The Traction is : " + toyatacamry.Traction);
		 System.out.println();
		 System.out.println("The engine type is: " +toyatacamry.Engine + " or variable valve timing "); 
		 System.out.println(); 
		 System.out.println("The Tire size is : " + toyatacamry.Tire_Size);
		 System.out.println(); 
		 System.out.println("The Speed Max is :  "+toyatacamry.Max_Speed+ " Miles");
		 
		 
		 System.out.println(); 
		 
		 
		 
		 
		 System.out.println("The Starts : "+ toyatacamry.started);
		 toyatacamry.started();
		 System.out.println(); 
		 System.out.println("The Car Horns : "+toyatacamry.Horn);
		 toyatacamry.Horn();
		 System.out.println(); 
		 System.out.println("The Car Absorbs : "+toyatacamry.absorb);
		 toyatacamry.absorb();
		 System.out.println(); 
		 System.out.println("The Car Moves : " + toyatacamry.moving);
		 toyatacamry.moving();
		 System.out.println(); 
		 System.out.println("The Car Stops : "+ toyatacamry.stop);
		  toyatacamry.stop();
		  

			 }
	
	
	
	
		
		
	
	
	
		}
		
		 
		
		
	


