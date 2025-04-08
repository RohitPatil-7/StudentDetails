package dataStructureAlgoritham;

public class Recursion2 {
	static int x=0;
	 static void show ( ) {
		 x++ ;
		 if(x< 5) {  
		 System.out.println(" x is calling five time ");
		 show( ) ;
	 }
	 }
	public static void main  (String  args[]) { 
		show();
	}
}
