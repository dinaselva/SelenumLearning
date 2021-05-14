package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = {1,3,4,6,7,8,9};
		
		Arrays.sort(arr);
		
		int length = arr.length - 1;
		
		for(int i =0; i <= length; i++) {
			
			if(arr[i]+1!=arr[i+1])
            {
                System.out.println(arr[i]+1);
                break;
                
            }
		}
	}

}
