package basic;
import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		int n,arm = 0,rem,c;
		System.out.print("Enter a number ");
		Scanner r = new Scanner(System.in);
		n = r.nextInt();
		c = n;
	   while(n>0)
		   {
		      rem = n%10;
		      arm = (rem*rem*rem)+arm;
		      n = n/10;
		      }
	   if(c == arm)
		 
	            System.out.println( " Armstrong number.");
	        else
	            System.out.println(" N"
	            		+ "Not an Armstrong number.");
	    }
		   
}
