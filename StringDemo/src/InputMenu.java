import java.util.Scanner;


public class InputMenu {
	
    public void display_menu() 
    {
	    // Printing menu to screen
	    System.out.println("Menu:");
	    System.out.println("1. Capitalize a string");
	    System.out.println("2. Reverse a string");
	    System.out.println("3. Tell if string and reverse string is true");
	    System.out.println("4. Quit Program");
	
	    // Getting user option from above menu
		System.out.print("Selection: ");
    }
    
    public InputMenu() 
    {
    	boolean bContinue = true;
    	String sTestString = "this is my string";
	    StringBuilder sDisplayString = new StringBuilder(sTestString);
	    Integer iInput = 0;
	    Scanner in = new Scanner(System.in);
    	while (bContinue == true) {
			//in = new Scanner(System.in);
		        display_menu();
		    
		    
		    try {    
		    	if (!in.hasNextInt()) {
		    		System.out.print("Not an integer, try again: ");
		    	} else {
		    	iInput = in.nextInt();
		    	in.nextLine();
		    	}
		    } catch (Exception e) {
		    	System.out.println("Exception occurred: " + e.getMessage());
		    	iInput = 0;
		    }
			switch (iInput) 
			{
				case 0:
				System.out.println("An exception occurred, try again");
				
				break;
				
			    case 1:
			    System.out.println ( "You picked option 1, capitalize a string. Capitalizing: " + sTestString );
			    System.out.println(sTestString.toUpperCase());
			    
			    break;
		  
			    case 2:
			    System.out.println ( "You picked option 2, reverse a string. Reversing: " + sTestString);
			    System.out.println(sDisplayString.reverse());
			    
			    break;
		  
			    case 3:
			    System.out.println ( "You picked option 3, tell if string and reverse string is true." );
			    boolean bCompareResult = ((sTestString == sDisplayString.reverse().toString()));
 
			    System.out.println("Is string " + sTestString + " equal to its reverse " + sDisplayString.reverse() + ": " + bCompareResult);
			    break;
			    
			    case 4:
			    System.out.println ( "Goodbye!" );
			    bContinue = false;
			    break;
			    
			    default:
			    System.err.println ( "Unrecognized option, try again" );
			    break;		    
			}
			//in.close();
    	}
    	in.close();
    }
 
}
