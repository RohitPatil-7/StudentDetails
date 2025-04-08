	package dataStructureAlgoritham;
	
	//Work of this program is 
	//0+1=1
	//1+0=1
	//1+1=2
	//2+1=3
	//3+2=5
	
	public class Fibonic7 {
	                     //1,2,3,4,5,6
		static int fib(int n) {
			if(n<=1) {
				return n;      //fib(1) this base case here it become 1
			}else {
				
				return fib(n-1) + fib(n-2); //1 fib(0)+fib(1) =1
			}                               //2 fib(1)+fib(0) =1+0=1
			                                //3 fib(2)+fib(1) =1+1=2
		}                                   //4 fib(3)+fib(2) =2+1=3
		                                    //5 fib(4)+fib(3) =3+2=5
		                                    //6 fib(5)+fib(4) =5+3=8
		
		
		public static void main(String[] args) {
			int num=10;
			
			for(int i=1; i<=num; i++) {
				System.out.println(fib(i));
			}
	
		}
	
	}
	