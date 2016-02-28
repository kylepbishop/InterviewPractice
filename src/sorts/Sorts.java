package sorts;

public class Sorts {
	static int[] arr = { 5, 1, 4, 2, 8};
	static int[] arr1 = { 5, 1, 4, 2, 8};
	static int[] arr2 = { 5, 1, 4, 2, 8};
	static int[] arr3 = { 5, 1, 4, 2, 8};
	static int[] arr4 = { 5, 1, 4, 2, 8};
	static int[] arr5 = { 5, 1, 4, 2, 8};
	
	//all cases O(n^2), in place
	public static int[] SelectionSort(int[] arr){
		int i, j;
		for(j = 0; j < arr.length - 1; j++){
			int iMin = j;
			for(i = j +1; i < arr.length; i++){
				if(arr[i] < arr[iMin]){
					iMin = i;
				}
			}
			if(iMin != j){
				int temp = arr[j];
				arr[j] = arr[iMin];
				arr[iMin] = temp;
			}
		}
		return arr;
	}
	
	//terrible, really only for learning purposes
	//best case O(n), worse O(n^2), still ends up being worse
	//than similarly ranked sorts such as insertion
	public static int[] BubbleSort(int[] arr){
		int n = arr.length;
		boolean swapped;
		do {
			swapped = false;
			for(int i = 1; i <= n-1; i++){
				if(arr[i-1] > arr[i]){
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
					swapped = true;
				}
			}
		}while(swapped);
		return arr;
	}
	
	//Worst and expected case O(n^2), best case O(n) when data is already
	//sorted
	public static int[] InsertionSort(int[] arr){
		int j = 0;
		for(int i = 1; i < arr.length - 1; i++){
			j = i;
			while(j > 0 && arr[j-1] > arr[j]){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		return arr;
	}
	//public portion of merge sort for calling, O(nlogn)
	public static int[] MergeSort(int[] arr){
		int[] arr2 = new int[arr.length];
		MergeSort(arr, arr2, 0, arr.length);
		return arr;
	}
	
	//recursive portion of merge sort, O(nlogn)
	private static void MergeSort(int[] arr, int[] arr2, int start, int end){
		if(end - start < 2){
			return;
		}
			int mid = (end + start) / 2;
			MergeSort(arr, arr2, start, mid);
			MergeSort(arr, arr2, mid, end);
			Merge(arr, arr2, start, mid, end);
			CopyArray(arr2, arr, start, end);		
	}
	
	//Merge function of mergesort, O(n)
	private static void Merge(int[] arr, int[] arr2, int start, int mid, int end){
		int i = start; int j = mid;
		for(int k = start; k < end; k++){
			if(i < mid && (j >= end || arr[i] <= arr[j])){
				arr2[k] = arr[i];
				i++;
			} else {
				arr2[k] = arr[j];
				j++;
			}
		}
	}
	//copy array for utility and for merge sort O(n)
	public static void CopyArray(int[] from, int[] to, int start, int end){
		for(int i = start; i < end; i++){
			to[i] = from[i];
		}
	}
	
	//print function for utility, O(n)
	public static void PrintArray(int[] arr){
		System.out.print("[ ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}
	
	public static int[] Quicksort(int[] arr, int start, int end){
		if(start < end){
			int p = MidPartition(arr, start, end);
			Quicksort(arr, start, p-1);
			Quicksort(arr, p+1, end);
		}
		return arr;
	}
	
	private static int MidPartition(int[] arr, int start, int end){
		int i = start; int j = end;
		int temp;
		int pivot = arr[(start + end) /2];
		while(i <= j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			if(i <= j){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	public static void main(String[] args){
		int[] bubble = BubbleSort(arr1);
		int[] selection = SelectionSort(arr2);
		int[] insertion = InsertionSort(arr3);
		int[] merge = MergeSort(arr4);
		int[] quicksort = Quicksort(arr5, 0, arr5.length-1);
		PrintArray(bubble);
		PrintArray(selection);
		PrintArray(insertion);
		PrintArray(merge);
		PrintArray(quicksort);
	}
}
