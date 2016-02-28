package sorts;

public class SelectionSort {
	public static int[] arr = {64, 25, 12, 22, 11};
	
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
	
	public static void main(String[] args){
		arr = SelectionSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
