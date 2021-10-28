package Assignments_oct27;

public class Printallevennumbers {
	public static void main (String args[]) {
		
		//print all the even numbers from 1 to 100
		
		for(int i=1; i<=100; i+=1) {
			
			if(i%2 == 0) {
				System.out.println(i);
			}
		
			//print all the odd numbers from 1 to 100
			
			for(int j=1; j<=100; j+=1) {
				
				if(j%2 != 0) {
					System.out.println(j);
				}
		}
	}
}
}
