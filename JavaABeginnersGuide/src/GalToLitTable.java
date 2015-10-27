import java.util.Scanner;
public class GalToLitTable {

	public static void main(String[] args) {
		Scanner newScanner = new Scanner(System.in);
		
		
		double liters, gallons, howManyGallons;
		int counter = 1;
		
		System.out.println("Enter first number: ");
		gallons = Double.parseDouble(newScanner.nextLine());
		System.out.println("Enter the second number: ");
		howManyGallons = Double.parseDouble(newScanner.nextLine());
	
		for(gallons = gallons; gallons <= howManyGallons; gallons++){
		
			
			liters = gallons * 3.78541;
			System.out.println(liters);
			counter++;
			
				if(counter == 10){
					System.out.println();
					counter = 0;
				}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
