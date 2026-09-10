import java.util.Scanner;

public class Stringbufferoperations{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
// input
		System.out.println("Enter your string: " );
		String ip = sc.nextLine();

		StringBuffer sb = new StringBuffer(ip);

//length and capacity
		System.out.println("Initial String: "+sb);
		System.out.println("Length: "+sb.length());
 		System.out.println("Capacity: "+ sb.capacity());

// append
		System.out.println("Enter your string to  append: " );
		String a = sc.nextLine();
		sb.append(a);
		System.out.println("After appending: "+sb);

//insert
		System.out.println("Enter the string to insert: " );
		String ins = sc.nextLine();						System.out.println("Enter the staring position: ");
		int is = sc.nextInt();
		sc.nextLine();
		sb.insert(is,ins);
		System.out.println("After insertion: "+sb);

//replace
		System.out.println("Enter start index: " );
		int rs = sc.nextInt();
		System.out.println("Enter end: ");
		int re = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter replacement string: ");
		String rep = sc.nextLine();
		sb.replace(rs,re,rep);
		System.out.println("After replace: "+sb);

//delete
		System.out.println("starte index: ");
		int ds = sc.nextInt();
		System.out.println("end: ");
		int de = sc.nextInt();
		sb.delete(ds,de);
		System.out.println("after deleteion: "+sb);

//reverse
		sb.reverse();
		System.out.println("after reverse:"+sb);
		sc.close();
	}
}