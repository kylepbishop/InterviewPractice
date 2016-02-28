package arraysearch;

import java.util.Arrays;

public class FindSingleElement {
	
	//O(n)
	public static int findsingle(int[] arr){
		Arrays.sort(arr);
		int[] count = new int[arr.length];
		int ret = 0;
		for(int i = 0; i < arr.length - 1; i++){
			if(arr[i] == arr[i+1]){
				count[i]++;
				count[i+1]++;
			} else {
				if(count[i] == 0){
					ret = arr[i];
				}
			}
		}
		return ret;
	}
	
	public static void main(String[] args){
		int[] arr1 = {1,1,2,2,3,3,4,5,5,6,6,7,7,8,8};
		System.out.println(findsingle(arr1));
		
	}
}
