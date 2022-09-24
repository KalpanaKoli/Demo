package day6_arrays;

import java.util.Arrays;

public class ArraySort1 {

	public static void main(String[] args) {
	
		int y[]= {22,34,6,7,8};
	
		Arrays.sort(y);
		//if negative number is returned i.e number not found 
		//positive number is index value of searched element in sorted array
		System.out.println(Arrays.binarySearch(y, 22));
		
		
		for(int u:y)
		{
			System.out.print("  "+ u);
		}
	

	}

}
