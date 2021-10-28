package Assignments_oct27;

public class WhileandDowhile {
	public static void main (String args[]) {
		
		//entry control loop
		for(int i=1; i<=10; i+=1) {
			System.out.println(i); // 1 to 10
		}
		
		//entry control loop
		int j=1;
		while(j<=10) {
			System.out.println(j); //1 to 10
			
			j+=1;
		}
		//exit control loop
		int k=1;
		do {
			System.out.println(k);
			k+=1;
		} while(k<=10); //1 to 10
		
		//special case
		int l=100;
		do {
			System.out.println(l);
			l+=1;
		} while(l<=10); //100
	}
}
