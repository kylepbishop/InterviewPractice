package sorts;

public class BubbleSort {
	static int[] arr = { 5, 1, 4, 2 , 8};
	
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
	
	public static void main(String[] args){
		arr = BubbleSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
