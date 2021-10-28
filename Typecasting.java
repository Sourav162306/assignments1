package Assignments_oct26;

public class Typecasting {
	public static void main (String args[]) {
		 
// automatic/widening
		byte age = 22;
		int new_age = age; 
		System.out.println(new_age);
	
// manual/ narrowing
		int salary = 30000;
		short new_salary = (short) salary;
		System.out.println(new_salary);
		
		float percentage = 72.5f;
		int new_percentage = (int) percentage;
		System.out.println(new_percentage);
		
	}
}
