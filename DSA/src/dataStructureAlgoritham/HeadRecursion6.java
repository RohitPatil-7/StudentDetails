package dataStructureAlgoritham;

public class HeadRecursion6 {
                     //3,2,1 then value will be 6
	static int show(int n) {
		if (n >= 1) { //her it go inside check condition and then n-1 and when it was 1 then return 1
			return n * show(n - 1); // 3* show(2)
		} else {                    //3*2 show(1) =6
			return 1;
		}

	}
	public static void main(String[] args) {
		System.out.println(show(3));
	}
}
