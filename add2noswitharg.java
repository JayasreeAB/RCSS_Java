public class add2noswitharg{
	public static void main(String[] args){
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int sum = n1+n2;
		System.out.println("Sum = " + sum);
	}
}

//here the op will be like C:\Users\hp\Desktop\javaja>javac add2noswitharg.java

//C:\Users\hp\Desktop\javaja>java add2noswitharg 10 2
//Sum = 12