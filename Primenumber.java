package Assignments_oct27;

public class Primenumber {
	public static void main (String args[]) {
		
		int num=51;
		int count_of_factors =0;
		
		for(int i=1; i<=num; i+=1) {
			if(num%i ==0) {
			count_of_factors = count_of_factors+1;
			}
		}
		if(count_of_factors ==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("NOT Prime Number");
			
			
	}
		
		int num2=53;
		int count_of_factors2 =0;
		
		for(int j=1; j<=num2; j+=1) {
			if(num2%j ==0) {
			count_of_factors2 = count_of_factors2+1;
			}
		}
		if(count_of_factors2 ==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("NOT Prime Number");
			
			
	}
}}
