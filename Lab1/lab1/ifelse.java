import java.util.Scanner; // program uses class Scanner 
public class ifelse{
 	 public static void main( String[] args ){
			Scanner input = new Scanner( System.in );
			int num// first number to add
			System.out.print( "Enter the num: " ); // prompt
			num = input.nextInt(); // read first number from user
			
		    if ( num>= 60 )
				System.out.println( "Passed" );
			else
				System.out.println( "Failed" );
		}	
	}