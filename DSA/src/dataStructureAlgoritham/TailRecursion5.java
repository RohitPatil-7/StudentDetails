package dataStructureAlgoritham;

public class TailRecursion5 {
	// 3,2,1 then value will be 6
	static int show(int n) {
		if (n <= 1) { // if we don't want send value inside then use this or n>=1 by this value go in
						// and check condition
			return 1;
		} else {
			return n * show(n - 1); // 3* show(2)
									// 3* 2* show(1) =6
		}
	}

	public static void main(String[] args) {
		System.out.println(show(3));
	}
}
