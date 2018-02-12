/*
 * David Moore/HAYDEN HOGUE/Caleb Kisling
 *	12/04/17
 *	make a program from chaipin chart
 *
 *
 */
 
 import java.util.*;
 import java.text.*; //for SimpleDateFormat // DecimalFormat
 
 
 class SantasLittleHelper{
 	// Global def
 	
 	static String iFirst;    
 	static String iLast;
 	static String iToy1;
 	static String iToy2;
 	static String iData;
 	static String iAge;
 	static String oDate;
 	static String oPrice1; 
 	static String oPrice2;
 	static String oSubTotal;
 	static String oTax;
 	static String oTotal;
 	
 	static double iPrice1;
 	static double iPrice2;
 	static double cSubTotal;
 	static double cTax;
 	static double cTotal;
 	
 	
 	static Scanner scanner;
 	
 	static DecimalFormat dfInt3, dfDouble3v2;
 	
 	
 	public static void main(String[] args){
 		
 		init();
		input();
		calcs();
		output();
 		
 	}
 	
 	
 	public static void init(){
 		
 		scanner = new Scanner(System.in);
 		scanner.useDelimiter("\r\n");
		
 		Date today;
		today = new Date();
	
		SimpleDateFormat simpleDF1;
		simpleDF1 = new SimpleDateFormat("MMMM dd, yyyy");
		

		//Default short format display
		System.out.println("Today is " + simpleDF1.format(today) );
 		
 		dfInt3 = new DecimalFormat("##0");
 		dfDouble3v2 = new DecimalFormat("###.00");
 		
 	}
 	
 		public static void input(){
 			scanner = new Scanner(System.in);
 			
 		// Statement to display info to screen 
 		// Prints first name to screen and puts
 		System.out.println("Enter your First Name");
 		iFirst = scanner.next();
 		
 		System.out.println("Enter your Last Name");
 		iLast = scanner.next();
 		System.out.println("Enter your Age");
 		iAge = scanner.next();
 	
 		System.out.println("First Toy Name");
 		iToy1 = scanner.next();
 		System.out.println("First Toy Price"); // This one
 		iData = scanner.next();
 		
 		try{
 			iPrice1 = Double.parseDouble(iData);
 			
 		}
 		catch(Exception e){
 			
 			System.out.println("Oh crap... ");
 			System.out.println("Invalid Price entered. Qty assigned a value of 1.00");
 			iPrice1 = 1.00;
 			
 		}
 	
 		System.out.println("Second Toy Name");
 		iToy2 = scanner.next();
 		System.out.println("Second Toy Price"); // This two
 		iData = scanner.next();
	 try{
 			iPrice2 = Double.parseDouble(iData);
 			
 		}
 		catch(Exception e){
 			
 			System.out.println("Oh crap... ");
 			System.out.println("Invalid Price entered. Qty assigned a value of 1.00");
 			iPrice2 = 1.00;
 			
 		}
	 
	 
	 	
 	}
 	
 	public static void calcs(){
 		
 		cSubTotal = iPrice1 + iPrice2;
 		cTax = cSubTotal * .07;
 		cTotal = cSubTotal + cTax;
 		
 		
 	}
 	
 	public static void output(){
 		System.out.println("MERRY CHRISTMASS!");
 		System.out.println("Name: " + iFirst + " " + iLast);
 		try {
 			oPrice1 = dfDouble3v2.format(iPrice1);
 			oPrice2 = dfDouble3v2.format(iPrice2);
 			oTax = dfDouble3v2.format(cTax);
 			oSubTotal = dfDouble3v2.format(cSubTotal);
 			oTotal = dfDouble3v2.format(cTotal);
 			
 			System.out.println("First Toy Price: $" + oPrice1);
 			System.out.println("Second Toy Price: $" + oPrice2);
 			System.out.println("SubTotal Price: $" + oSubTotal);
 			System.out.println("Tax: $" + oTax);
 			System.out.println("Total Price: $" + oTotal);
 			
 		}
 		catch(Exception e){
 			
 			System.out.println("Oh crap... ");
 			
 			
 		}
 		
 		
 	}
 	
 	
 }