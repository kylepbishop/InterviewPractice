package binarysearch;

public class SortedArrayOfIntegers {
	
	public static int binarySearch(int[] arr, int target){
		int low = 0;
		int high = arr.length - 1;
		int mid = (high + low)/2;
		while(low <= high){//assume the item is in the list
			//System.out.println(low+" - "+high);
			mid = (high + low)/2;
			if(arr[mid] == target){
				//System.out.println("Found");
				return mid;
			} else if (arr[mid] < target){
				//System.out.println("Too low, go right");
				low = mid + 1;
			} else {
				//System.out.println("Too high, go left");
				high = mid - 1;
			}
		}
		return -1;
	}
	
	//recursive solution
	public static int binarySearch(int[] arr, int low, int high, int target){
		if(low > high){
			return -1;
		}
		if(high == low){
			return low;
		}
		int mid = (high + low)/2;
		if(arr[mid] == target){
			return mid;
		} else if (arr[mid] < target){
			return binarySearch(arr, mid+1, high, target);
		} else {
			return binarySearch(arr, low, mid-1, target);
		}
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println(binarySearch(arr, 5));
		System.out.println(binarySearch(arr,13));
		System.out.println(binarySearch(arr, 0, arr.length-1, 5));
		System.out.println(binarySearch(arr, 0, arr.length-1, 13));
	}
}
