// Compare integers using if statements and relational operators. 
import java.util.Scanner; // program uses class Scanner
public class compare {
		public static void main( String[] args ){

		 Scanner input = new Scanner( System.in );
		 int number1; // first number to add
		 int number2; // second number to add
		 int sum; // sum of number1 and number2
		 System.out.print( "Enter first integer: " ); // prompt
		 number1 = input.nextInt(); // read first number from user
		 System.out.print( "Enter second integer: " ); // prompt
		 number2 = input.nextInt(); // read second number from user

		 if ( number1 == number2 )
			 System.out.printf( "%d == %d\n", number1, number2 );
		 if ( number1 != number2 )
			 System.out.printf( "%d != %d\n", number1, number2 );
		 if ( number1 < number2 )
			 System.out.printf( "%d < %d\n", number1, number2 );
		 if ( number1 > number2 )
			 System.out.printf( "%d > %d\n", number1, number2 );
		 if ( number1 <= number2 )
			 System.out.printf( "%d <= %d\n", number1, number2 );
		 if ( number1 >= number2 )
			System.out.printf( "%d >= %d\n", number1, number2 );
		}
	}