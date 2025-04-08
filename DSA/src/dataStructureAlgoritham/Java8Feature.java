package dataStructureAlgoritham;

import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

public class Java8Feature {
	
	public static void main(String[] args) {
		List<Integer> add = Arrays.asList(1,2,43,63,2,6,9);
		

//		Normal way we are printing it
		for(Integer num : add) {
			if(num%2!=0) {
				System.out.println(num);
			}
		}
//		sys-----------------------------
		
		System.out.println("--------------------------------------------------------");
		
	List<Integer>	ao=add.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println(ao);
	
	System.out.println("------------------------------------------------------------------");
	List<Integer>	a=add.stream().filter(n->n%2==0).toList();
	
	System.out.println("----------------------------------------------------------");
	     add.stream()
			.filter(n->n%2!=0)
			.forEach(System.out::println);//without object create we can print it
	     
	
	
	}
	
	
	

}
