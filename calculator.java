import java.util.Scanner;



public class Calculator {

public  static int Addition(int a ,int b) {
	return a +b;
}
public static  int Subtract(int a ,int b) {
	return a - b;
}
public static int Multiply(int a ,int b) {
	return a * b;
}
public static double Divide(int a,int b ) {
	if(b ==0) {
		System.out.println("Error");
	       return Double.NaN; // Not a Number
    }
    return (double) a / b;
}
	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        boolean running =true;
		        
		        while(running) {
		        	System.out.println("Simple Calculator");
		        	System.out.println("");
		        	System.out.println("1.Addition :");
		        	System.out.println("2.substract :");
		        	System.out.println("3.Multifly :");
		        	System.out.println("4.Divide :");
		        	System.out.println("5.Exit ");
		        	System.out.println("");
		        	System.out.println("choose on operation (1 to 5) : ");
		        	
		        	int choice =sc.nextInt();
		        	
		        	if(choice == 5) {
		        		running=false;
		        		System.out.println("Good bye");
		        		break;
		        	}
		     
		        	System.out.println("Enter the First number :");
		        	int num1 =sc.nextInt();
		        	System.out.println("Enter the Second number :");
		        	int num2 =sc.nextInt();
		   
		        	
		        	
		        
		    
		        switch (choice) {
		            case 1:
		                System.out.println("result :" +Addition(num1 ,num2)); 
		                break;
		            case 2:
		            	System.out.println("result :" + Subtract(num1 ,num2));
		            	break;
		            case 3:
		            	System.out.println("result :" + Multiply(num1 ,num2));
		            	break;
		            case 4:
		            	System.out.println("result :" +Divide(num1 ,num2));
		            	break;
		            
		            default:
		                System.out.println("Invalid operation");
		        }

		 
		    }
		        sc.close();
		}
}
		
		