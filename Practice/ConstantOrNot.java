
class ConstantOrNot {

   private final int aInt = 1;
   private final String aString = "abc";
   private       String bString = "abc";
   private final String[] aArray = new String[10];

   public void doTheJob() {
	   aInt = 3;
	   aString = aString + "abc";
	   aString = aString;
     aArray = new String[10];
	   bString = aString;
	   bString = aString + "def";
	   aArray[0] = "abc";	
   }

    public static void main( String args[] ) {
	     new ConstantOrNot().doTheJob();
    }
}