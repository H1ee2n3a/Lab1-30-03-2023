package basic;
import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		int n,ans = 0,count,x;
		System.out.print("Enter a number ");
		Scanner r = new Scanner(System.in);
		n = r.nextInt();
		x = n;
	   while(n>0)
		   {
		      count = n%10;
		      ans = (count*count*count)+ans;
		      n = n/10;
		      }
	   if(x == ans)
		 
	            System.out.println( " Armstrong number.");
	        else
	            System.out.println(" N"
	            		+ "Not an Armstrong number.");
	    }
		   
}
