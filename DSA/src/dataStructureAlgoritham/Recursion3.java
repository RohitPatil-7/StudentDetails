package dataStructureAlgoritham;

public class Recursion3 {
//                     1,2,3,4=then here come 32
	static int show(int n) {
		if (n == 4) {
			return n;
		} else {
			return 2 * show(n + 1);  // First   2* show(2)
		}                            //  Second 2*2 show(3)
		                             //third    2*2*2 show(4)=32

	}

	public static void main(String[] args) {
		System.out.println(show(1));
	}
}
