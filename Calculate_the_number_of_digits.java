package WAP_2_Assignments;

public class Calculate_the_number_of_digits {
	public static void main (String args[]) {
		int num= 4598;
		int count=0;
		int i=num;
		
		while(num>0) {
			count+=1;
			num/=10;
		}
		System.out.println(count);
	}
}
