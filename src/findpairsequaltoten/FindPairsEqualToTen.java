package findpairsequaltoten;
import java.util.Random;

public class FindPairsEqualToTen {
	public static void pairs(int[] myArray, int soughtPairTotal){
		//naive method, enumerate all pairs and return only
		//the pairs that match the requirement
		//O(n^2)
		int[][] table = new int[myArray.length][myArray.length];
		for(int row = 0; row < myArray.length; row++){
			for(int col = 0; col < myArray.length; col++){
				if(row != col){
					table[row][col] = myArray[row]+myArray[col];
					if(table[row][col] == soughtPairTotal){
						System.out.println("Pair of " + myArray[row] + " and " + myArray[col]);
					}
				}
			}
		}
		
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
			arr[i] = rand.nextInt(20);//1 to 100
			arr3[i] = rand.nextInt(20);//100 to 200
		}
		
		printArray(arr);
		pairs(arr, 10);
		printArray(arr2);
		pairs(arr2, 10);
		printArray(arr3);
		pairs(arr3, 10);
		
		
	}
}
