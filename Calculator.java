package calculator;
import java.util.*;

public class Calculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number1:"+" ");
		double num1=sc.nextDouble();
		
		System.out.print("Enter nukmber2:"+" ");
		double num2=sc.nextDouble();
		
		System.out.print("Enter the operator:"+" ");
		char operator=sc.next().charAt(0);
		
	switch(operator) {
		
		case '+' : System.out.print("Addition is:"+(num1 + num2));
		break;
		
		case '-' : System.out.print("Subtraction is:"+(num1-num2));
		break;
		
		case '*' : System.out.print("Multiplication is:"+(num1*num2));
		break;
		
		case '/' : 
			if(num2 == 0) {
				System.out.print("Cannot divide");
			}
			
			System.out.print("Division is:"+(num1/num2));
			break;
			
		case '%' : 
			if(num2 == 0) {
				System.out.print("Cannot find remainder");
			}
			System.out.print("Remainder is:"+(num1 % num2));
			break;
		}
		
	}

}
