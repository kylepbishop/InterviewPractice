package commonarrays;

import java.util.HashMap;
import java.util.Random;

public class FindCommonElementsOfTwoArrays {
	
	//O(n)
	public static void intersect(int[] arr1, int[] arr2){
		HashMap hm = new HashMap();
		for(int i = 0; i < arr1.length; i++){
			Object value = hm.putIfAbsent(arr1[i], arr1[i]);
			if(value == null){
				//System.out.println("Not in the list");
			} else {
				System.out.println(value.toString());
			}
		}
		for(int i = 0; i < arr2.length; i++){
			Object value = hm.putIfAbsent(arr2[i], arr2[i]);
			if(value == null){
				//System.out.println("Not in the list");
			} else {
				System.out.println(value.toString());
			}
		}
			
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		int[] arr1 = {1,2,3,5};
		int[] arr2 = {3,4,5,6,7, 100};
		int[] arr3 = new int[rand.nextInt(20)];
		int[] arr4 = new int[arr3.length];
		for(int i = 0; i < arr3.length; i++){
			arr3[i] = rand.nextInt(100);
			arr4[i] = rand.nextInt(100);
		}
		intersect(arr1,arr2);
		intersect(arr3,arr4);
	}
}
