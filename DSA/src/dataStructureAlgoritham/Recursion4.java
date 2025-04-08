package dataStructureAlgoritham;

public class Recursion4 {
	                 //1,2,3,4  Then n value will be 6004
	static int show(int n) {
		if(n==4) {
			return n;
		}else {
			                       //Now in this 
			return 2000+show(n+1); //First 2000+ show(2)
			                       //Second 2000+2000 show(3)
			                       //Third 2000+2000+2000 show(4) here value will be 6004
		}
		
	}
	
public static void main(String[] args) {
	System.out.println(show(1));
}
}
