import java.util.*;
import java.io.*;

public class mathop{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a+b;
		int diff = a - b;
		int prod = a * b;
		int quot = a/b;

		while(true){
			System.out.println("------------List of Operations:-----------");
			System.out.println("1.Addition of 2 numbers");
			System.out.println("2.Subtraction of 2 numbers");
			System.out.println("3.Multiplications of 2 numbers");
			System.out.println("4.Division of 2 numbers");
			System.out.println("5.Exit");
			System.out.println("Enter  your choice: ");
			int choice = sc.nextInt();
			
			


		switch(choice){
			
			case 1:
				System.out.println("The sum of "+ a +"and "+b+" is "+sum);
				break;
			
			case 2:
				System.out.println("The difference of "+a+"and "+b+" is "+diff);
				break;
			
			case 3:
				System.out.println("The product of "+a+"and "+b+" is "+prod);
				break;
			
			case 4:
				System.out.println("The quotient of "+a+"and "+b+" is "+quot);
				break;
			
			case 5:
				System.exit(0);

			
			default:
				System.out.println("Invalid value");
				break;

}
}
}
}




		