import java.io.*;
import java.util.*;

class c2{
	public void disp(int a){
		System.out.println("a = "+a);
	}

	public int read(){
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a no:");
		a = s.nextInt();
		return a;
	}

	public int add(int a,int b){
		int s= a+b;
		return s;
	}
}

class argndreturn{
	public static void main(String [] args){
		c2 obj;
		obj = new c2();
		int p,q,r;
		p=obj.read();
		q=obj.read();
		r = obj.read();
		obj.disp(r);
}
}