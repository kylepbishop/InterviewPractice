package binarysearch;

public class RotatedSortedArrayOfIntegers {
	
	public static int binarySearch(int[] arr, int low, int high, int target){
		if(low > high){
			return -1;
		}
		int mid = (low + high)/2;
		if(arr[mid] == target){
			return mid;
		}
		
		//if the left side is sorted
		if(arr[low] <= arr[mid]){
			//since this side is sorted it's easy to check if the 
			//target is in this half or the other half
			if(target >= arr[low] && target <= arr[mid]){
				return binarySearch(arr, low, mid-1, target);
			}
			//if it's not in the left, it must be in the right
			return binarySearch(arr, mid+1, high, target);
		}
		
		//if the left side is not sorted, then the right side must be
		if(target >= arr[mid] && target <= arr[high]){
			return binarySearch(arr, mid+1, high, target);
		}
		//if it's not in the right side it must be in the left side
		return binarySearch(arr, low, mid-1, target);
	}
	
	public static void main(String[] args){
		int[] arr = {9,10,11,12,13,1,2,3,4,5,6,7,8};
		System.out.println(binarySearch(arr, 0, arr.length-1, 12));
	}
}
