package Assignments_oct26;

public class ifelse {
	public static void main (String args[]) {
		
		int num1 = 50;
		int num2 = 100;
		
		if (num1 > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);	
		}
		
		System.out.println(100>50); //true
		System.out.println(10>50);  //false
		System.out.println(10<50);  //true
		System.out.println(100<50); //false
		System.out.println(10==50);  //false
		System.out.println(10==10);  //true
		
		System.out.println(10 !=50);  //true
		System.out.println(50 !=50);  //false
		
		System.out.println(10>=50);   //false
		System.out.println(50>=50);   //true
		System.out.println(100>=50);  //true
		
		System.out.println(10<=50);  //true
		System.out.println(50<=50);   //true
		System.out.println(100<=50);   //false
	}
}

// print the greater number