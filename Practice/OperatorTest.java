/**
* This is OperatorTest
*
**/
class OperatorTest {

    public static void main( String args[] ) {
    
	int n = 0;
	
	here:
	while ( true )  {
    	

		while ( ( ( n != 3 ) || ( n != 5 ) ) && ( n < 4 ) )  {
			if ( ++n == 0 )
				System.out.println("a/	n is " + n );
			else if ( n++ == 6 )    {
				System.out.println("b/	n is " + n );
			} else if ( ++n == 3 )
				System.out.println("c/	n is " + n );
			else 
				System.out.println("d/	n is " + n );

			System.out.println("	executing break here");

		}
		
		System.out.println( n % 2 == 0 ?
					( n == 4 ? "=" : "!" )
				      : ( n % 3 != 0 ? "3" : "!3" ));
		break here;
	}
    }
}