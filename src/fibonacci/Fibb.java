package fibonacci;

public class Fibb {
	
	//fibonacci recursively
	public static int reFibonacci(int n){
		if(n <= 0){
			return 0;
		} else if (n == 1){
			return 1;
		}
		return reFibonacci(n-1) + reFibonacci(n-2);
	}
	
	//fibonacci iteratively
	public static int itFibonacci(int n){
		int prev = 0;
		int curr = 1;
		for(int i = 0; i < n; i++){
			int temp = prev;
			prev = curr;
			curr = temp + curr;
		}
		return prev;
	}
	
	//fibonacci using dynamic programming
	public static int dyFibonacci(int n){
		int[] fib = new int[n+1];
		for(int i = 0; i < n+1; i++){
			fib[i] = 0;
		}
		fib[1] = 1;
		for(int i = 2; i < n+1; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
//		for(int i = 0; i < n+1; i++){
//			System.out.print(fib[i] + " ");
//		}
//		System.out.println();
		return fib[n];
	}
	
	public static void main(String[] args){
		System.out.println(itFibonacci(5));
		System.out.println(reFibonacci(5));
		System.out.println(dyFibonacci(5));
	}
}
