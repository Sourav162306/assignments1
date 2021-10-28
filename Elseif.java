package Assignments_oct27;

public class Elseif {
	public static void main (String args[]) {
		int num1=100;
		
		if (num1>100) {
			System.out.println(num1);  //100
		}else if (num1<0) {
			System.out.println(num1);
		}else {
			System.out.println(num1);
		}
		
		int num2=-100;
		if (num2>100) {
			System.out.println(num2);
		}else if (num2<0) {
			System.out.println(num2);  //-100
		}else {
			System.out.println(num2);
		}
		
		int num3=0;
		if (num3>100) {
			System.out.println(num3);
		}else if (num3<0) {
			System.out.println(num3);
		}else {
			System.out.println(num3);  //0
		}
	}
}