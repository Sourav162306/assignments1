package WAP_2_Assignments;

public class All_the_prime_numbers_1to100 {
	public static void main (String args[]) {
		
		int count=0;
        for(int num=1;num<=100;num+=1){
        	for(int i=1; i<=num; i++){
        		if(num%i == 0) {
        			count+=1;
        		}
        		if(count==2) {
        			System.out.print(num);
        			count=0;
        		}
        	}
        	
        }
			
	}
}
