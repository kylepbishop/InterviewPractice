package frequentinteger;

import java.util.Arrays;
import java.util.Random;

public class FindMostFrequentInteger {
	public static int mode(int[] myArray){
		Arrays.sort(myArray);
		int maxCount = 0;
		int maxIndex = 0;
		int count = 0;
		int ret = 0;
		//accesses n-1 data so big o is O(n)
		for(int i = 0; i < myArray.length-1; i++){
			if(myArray[i] == myArray[i+1]){
				count++;
				if(count > maxCount){
					maxCount = count;
					maxIndex = i;
				}
			} else {
				count = 1;
			}
		}
		if(maxCount > 1){
			ret = myArray[maxIndex];
		} else {
			ret = -1;
		}
		return ret;
	}
	
	public static void printArray(int[] myArray){
		for(int i = 0; i < myArray.length; i++){
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		//create some arrays with random numbers
		int[] arr = new int[15];
		int[] arr2 = {2, 34, 54, 2, 5, 23, 4, 5, 2, 5, 2};
		int[] arr3 = new int[15];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = rand.nextInt(100)+1;//1 to 100
			arr3[i] = rand.nextInt(100)+101;//100 to 200
		}
		
		//Arrays.sort(arr);
		//Arrays.sort(arr2);
		//Arrays.sort(arr3);
		//find the most frequent integer in an array
		
		
		printArray(arr);
		System.out.println(mode(arr));
		printArray(arr2);
		System.out.println(mode(arr2));
		printArray(arr3);
		System.out.println(mode(arr3));
	}

}
