package HSYD100_1_Jan_Jun2023_SA1;

import java.util.ArrayList;

public class Main {
	
	public static void main(String a[]) {
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Ferari");
	    cars.add("VW");
	    cars.add("Kia");
	    cars.add("Honda");
	    cars.add("Mahindra");
	    cars.add("Toyota");
	    
	    displayList(cars);
		
	}
	
	private static void displayList(ArrayList<String> cars) {
		
		tableHeader();
		
		int count = 1;
		
		for(String car: cars) {
			count = count + cars.indexOf(car);
			System.out.println("* "+ count + "   *  " + car);
			System.out.println("*********************");
		}		
		
	}
	
	private static void tableHeader() {
		System.out.println("*********************");
		System.out.println("******* Cars ********");
		System.out.println("*********************");
		System.out.println("* No: *  Name        ");
		System.out.println("*********************");
	}

}
