package converter;

public class IntToBinary {
	
	public static int binToDec(int x){
		String bin = x + "";
		int place = 1;
		int total = 0;
		for(int i = bin.length()-1; i >= 0; i--){
			if(bin.charAt(i) == '1'){
				total += place;
			}
			place *= 2;
		}
		return total;
	}
	
	public static String decToBin(int x){
		String bin = "";
		int div = x;
		do{
			int rem = div % 2;
			div = div / 2;
			bin = rem + bin + "";
		}while(div != 0);
		return bin;
	}
	
	public static void main(String[] args){
		System.out.println(decToBin(101));
		System.out.println(binToDec(1100101));
	}

}
