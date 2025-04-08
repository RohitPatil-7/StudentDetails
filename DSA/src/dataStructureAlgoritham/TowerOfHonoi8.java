package dataStructureAlgoritham;



public class TowerOfHonoi8 {

public static void toh(int n, char A, char B, char C) {
	
	if(n==1) {
		System.out.println("Disk from " +A+ " to " +C);
	}else {
		toh(n-1 , A, C, B);
		System.out.println("Disk from "+A+ " to " +C);
		toh(n-1,B,A,C);
		
	}
	
	}
//	static void toh(int n, char A, char B, char C) {
//		if(n==1) {
//			System.out.println("Disk from "+A + " to " + C);
//		}else { //3
//			toh(n-1, A, C, B); //2 , A, C, B
//			System.out.println("Disk from "+A + " to " + C);
//			toh(n-1,B,A,C);  //1 , B, A, C
//		}
//		
//	}
//	public static void main(String[] args) {
//		int n=3;
//		toh(n,'A','B','C');
//	}
//}
	
	
	public static void main(String[] args) {
		int n=3;
		toh(n, 'A', 'B', 'C');
	}
	
}


//Disk from A to C
//Disk from AtoB
//Disk from B to C
//Disk from AtoB
//Disk from B to C
//Disk from BtoA
//Disk from A to C

