package basic;
import java.util.Scanner;
class Operator{
	     public int Addition(int x,int y)
	     {
	    	return x+y; 
	     }
	     public int Subtraction(int x,int y)
	     {
	    	 return x-y;
	     }
	     public int Multiplication(int x,int y)
	     {
	    	return x*y; 
	     }
	     public double division(int x,int y)
	     {
	    	 return x/y;
	     }
}
public class CalculatorOp {

	public static void main(String[] args) {
         Operator op = new Operator();
         System.out.println("Welcome to my Calculator");
         Scanner sc = new Scanner(System.in);
         int x,y;
         do {
         System.out.println("Enter 1-for Addition 2-for Subtraction 3-for Multiplication 4-for division 5-Exit");
         int choice = sc.nextInt();
         switch(choice)
         {
         case 1:
        	 System.out.println("Enter first number");
              x = sc.nextInt();
             System.out.println("Enter Second number");
              y = sc.nextInt();
        	 System.out.println("Sum "+op.Addition(x, y));
        	 break;
         case 2:
        	 System.out.println("Enter first number");
              x = sc.nextInt();
             System.out.println("Enter Second number");
              y = sc.nextInt();
        	 System.out.println("Sum "+op.Subtraction(x, y));
        	 break;
         case 3:
        	 System.out.println("Enter first number");
              x = sc.nextInt();
             System.out.println("Enter Second number");
              y = sc.nextInt();
        	 System.out.println("Sum "+op.Multiplication(x, y));
        	 break;
         case 4:
        	 System.out.println("Enter first number");
              x = sc.nextInt();
             System.out.println("Enter Second number");
               y = sc.nextInt();
        	 System.out.println("Sum "+op.division(x, y));
        	 break;
         case 5:
        	 System.exit(0);
        	 break;
         default:
        	 System.out.println("Invalid Input");
         }
         }while(true);
	}

}
