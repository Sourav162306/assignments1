package Assignments_oct27;

public class tableofallnumbers {
	public static void main (String args[]) {
		for(int num=1; num<=10; num+=1) {
			
			for(int i=1; i<=10; i+=1) {
				
				System.out.println(num*i);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
}
