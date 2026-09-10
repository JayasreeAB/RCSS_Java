import java.util.*;

public class addnumbersuserip{
	public static void main(String args[]){
		Scanner newsc = new Scanner(System.in);
		System.out.print("enter 1st no: ");
		int a = newsc.nextInt();

		System.out.print("enter 2nd no: ");
		int b = newsc.nextInt();

		int sum = a+b;
		System.out.println("the sum of "+a+" + " + b +" is " +sum);

		newsc.close();
}
}
