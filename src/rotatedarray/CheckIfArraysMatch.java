package rotatedarray;

import java.util.Arrays;
import java.util.Random;

public class CheckIfArraysMatch {
	
	//naive method, sort both then check if they are equal
	//O(n)
	public static void SameArray(int[] array1, int[] array2){
		Arrays.sort(array1);
		Arrays.sort(array2);
		int i = 0;
		boolean same = true;
		while(same && i < array1.length){
			if(array1[i] != array2[i]){
				same = false;
			}
			i++;
		}
		if(same){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		//create some arrays with random numbers
		int[] arr = {1,2,3,5,6,7,8};
		int[] arr2 = {5,6,7,8,1,2,3};
		int[] arr3 = new int[7];
		
		for(int i = 0; i < arr.length; i++){
			arr3[i] = rand.nextInt(20);//100 to 200
		}
		
		SameArray(arr,arr2);
		SameArray(arr2,arr3);
		SameArray(arr,arr3);
	}
}
