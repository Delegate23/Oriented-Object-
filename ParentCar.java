package Dealer;
import java.util.Scanner;
import java.util.ArrayList;

public class ParentCar {
	
 public static void Construction () {
	 
	 String []my_Cars= {"Toyata Camry 2019 |", "Toyata Corolla 2017 |" ," Toyota 4Runner 2015 |"," Toyota Highlander 2020"};// List 

	 		
	 Scanner scanner = new Scanner(System.in); //
	 
	 System.out.println("Welcome to my Car dealer");
	 
	 System.out.println();
	 
	System.out.println(" The  availble cars are : 0) Toyata Camry 2019 | 1)  Toyata Corolla 2017 | 2) Toyota 4Runner 2015 | 3) Toyota Highlander 2020 |"); 
	
	System.out.println();
	
	System.out.println("Which one would like to buy, please?");
	 
	int choice =  scanner.nextInt();
	
	
	switch(choice) { // Menu
	  
	  case 0: 
		   System.out.println(my_Cars[0]);
		  // ToyotaCamry2019();
             
		   break;
	  case 1:
		  System.out.println(my_Cars[1]);
		 break;
	  case  2:
		   System.out.println(my_Cars[2]);
		 break;
		  
	  case 3:
		  System.out.println(my_Cars[3]);
		   break;
		   default:
		   break;
	  }
	
	  System.out.println();
	 
    }// end construction
 
 
 

	
}//end Parent
