package prime;

public class dynamicProgrammingPrime {
	
	public static void getPrimes(int x){
		boolean[] primes = new boolean[x+1];
		for(int i = 0; i < primes.length; i++){
			if(i == 2 || i == 3){
				primes[i] = true;
			} else {
				primes[i] = false;
			}
		}
		int j = 0;
		for(int i = 3; i < primes.length; i++){
			j = i-1;
			boolean outcome = true;
			while(j > 1){
				if(i % j == 0){//not a prime
					outcome = false;
				}
				j--;
			}
			primes[i] = outcome;
		}
		for(int i = 0; i < primes.length; i++){
			if(primes[i] == true){
				System.out.println(i + " ");
			}
		}
	}
	
	public static void main(String[] args){
		getPrimes(100);
	}
}
